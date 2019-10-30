package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.geometry.Pos;

public class Main extends Application {

    // launch the application
    public void start(Stage stage)
    {
        try {
            StackPane stackPane = new StackPane();

            Pane p = new Pane();

            Image image1 = new Image("file:MainMenu.jpg", 1350,800,false,false);
            ImageView iv1 = new ImageView();
            iv1.setImage(image1);
            iv1.setPreserveRatio(true);

            stackPane.getChildren().addAll(iv1,p);

            Button ng = new Button("New Game");
            Button lg = new Button("Load Game");
            Button ex = new Button("Exit");
            ng.setLayoutX(720);
            ng.setLayoutY(245);
            ng.setStyle("-fx-background-color:transparent;");
            ng.setPrefSize(455,80);
            ng.setOnAction(e->{
                System.out.println("New game selected");
            });
            lg.setLayoutX(720);
            lg.setLayoutY(350);
            lg.setStyle("-fx-background-color:transparent;");
            lg.setPrefSize(445,70);
            lg.setOnAction(e->{
                System.out.println("Load game selected");
            });
            ex.setLayoutX(730);
            ex.setLayoutY(455);
            ex.setStyle("-fx-background-color:transparent;");
            ex.setPrefSize(400,60);
            ex.setOnAction(e->{
                System.out.println("Exit selected");
            });
            Group bgrp = new Group();
            bgrp.getChildren().add(ng);
            bgrp.getChildren().add(lg);
            bgrp.getChildren().add(ex);
            bgrp.setRotate(7);

            p.getChildren().add(bgrp);

            Scene scene1 = new Scene(stackPane,1350, 700);

            stage.setTitle("Plants Vs Zombies");
            stage.setScene(scene1);
            stage.show();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Main Method
    public static void main(String args[])
    {
        // launch the application
        launch(args);
    }
}
