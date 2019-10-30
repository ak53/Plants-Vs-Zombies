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
            StackPane stackPane = new StackPane(); //To display the scenes on top of each other
            Pane p = new Pane(); //pane with 3 buttons (Main Menu)
            Image image1 = new Image("file:MainMenu.jpg", 1350,800,false,false);
            ImageView iv1 = new ImageView();
            iv1.setImage(image1);
            iv1.setPreserveRatio(true);

            Pane p2 = new Pane(); //pane with text box and buttons for new name
            Image image2 = new Image("file:Enter_Name.jpg", 500,300,false,false);
            ImageView iv2 = new ImageView();
            iv2.setX(430);
            iv2.setY(200);
            iv2.setImage(image2);
            iv2.setPreserveRatio(true);
            TextField eName = new TextField("");
            eName.setLayoutX(468);
            eName.setLayoutY(360);
            eName.setPrefWidth(420);
            Button NmOk = new Button("OK");
            Button NmCancel = new Button("CANCEL");
            NmOk.setLayoutX(470);
            NmOk.setLayoutY(440);
            NmOk.setPrefSize(200,35);
            NmOk.setStyle("-fx-background-color:transparent;");
            NmOk.setOnAction(e->{
                System.out.println("OK selected");
            });
            NmCancel.setLayoutX(700);
            NmCancel.setLayoutY(440);
            NmCancel.setPrefSize(200,35);
            NmCancel.setStyle("-fx-background-color:transparent;");
            NmCancel.setOnAction(e->{
                System.out.println("Cancel selected");
            });
            p2.getChildren().add(iv2);
            p2.getChildren().add(eName);
            p2.getChildren().add(NmOk);
            p2.getChildren().add(NmCancel);

            stackPane.getChildren().addAll(iv1,p);

            Button ng = new Button("New Game");
            Button lg = new Button("Load Game");
            Button ex = new Button("Exit");
            ng.setLayoutX(720);
            ng.setLayoutY(245);
            ng.setPrefSize(455,80);
            ng.setStyle("-fx-background-color:transparent;");
            //ng.setOnMouseEntered(e -> ng.setStyle("-fx-background-color: -fx-shadow-highlight-color, -fx-outer-border, -fx-inner-border, -fx-body-color;\""));
            //ng.setOnMouseExited(e -> ng.setStyle("-fx-background-color:transparent;");
            ng.setOnAction(e->{
                System.out.println("New game selected");
                stackPane.getChildren().add(p2);
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
