package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.util.Duration;

public class Main extends Application {

    public void ButtonFormat(Button b, double posx, double posy, double sx, double sy){
        b.setLayoutX(posx);
        b.setLayoutY(posy);
        b.setPrefSize(sx,sy);
        //b.setStyle("-fx-background-color:transparent;");
    }

    // launch the application
    public void start(Stage stage) {
        try {
            StackPane stackPane = new StackPane(); //To display the scenes on top of each other
            Pane p = new Pane(); //pane with 3 buttons (Main Menu)
            Image image1 = new Image("file:MainMenu.jpg", 1350, 800, false, false);
            ImageView iv1 = new ImageView();
            iv1.setImage(image1);
            iv1.setPreserveRatio(true);

            Pane p2 = new Pane(); //pane with text box and buttons for new name
            Image image2 = new Image("file:Enter_Name.jpg", 500, 300, false, false);
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
            ButtonFormat(NmOk,470,440,190,35);
            NmOk.setOnAction(e -> {
                System.out.println("OK selected");
            });
            ButtonFormat(NmCancel,700,440,190,35);
            NmCancel.setOnAction(e -> {
                System.out.println("Cancel selected");
                stackPane.getChildren().remove(p2);

            });
            p2.getChildren().add(iv2);
            p2.getChildren().add(eName);
            p2.getChildren().add(NmOk);
            p2.getChildren().add(NmCancel);

            Pane p3 = new Pane();
            Image image3 = new Image("file:ChooseLevel.jpg", 1350, 700, false, false);
            ImageView iv3 = new ImageView();
            iv3.setImage(image3);
            p3.getChildren().add(iv3);
            Button l1 = new Button("Level 1");
            Button l2 = new Button("Level 2");
            Button l3 = new Button("Level 3");
            Button l4 = new Button("Level 4");
            Button l5 = new Button("Level 5");
            Button back = new Button("Back");
            ButtonFormat(l1,45,57,250,180);
            ButtonFormat(l2,347,57,250,180);
            ButtonFormat(l3,663,57,250,180);
            ButtonFormat(l4,980,57,250,180);
            ButtonFormat(l5,537,260,250,180);
            ButtonFormat(back,580,594,205,50);
            back.setOnAction(e->{
                stackPane.getChildren().remove(p3);
            });
            p3.getChildren().add(l1);
            p3.getChildren().add(l2);
            p3.getChildren().add(l3);
            p3.getChildren().add(l4);
            p3.getChildren().add(l5);
            p3.getChildren().add(back);

            stackPane.getChildren().addAll(iv1, p);

            Button chLev = new Button("Select Level");
            Button ng = new Button("New Game");
            Button lg = new Button("Load Game");
            Button ex = new Button("Exit");
            ButtonFormat(chLev,715,98,485,85);
            chLev.setOnAction(e -> {
                System.out.println("Choose level selected");
                stackPane.getChildren().add(p3);
            });
            ButtonFormat(ng,720,245,455,80);
            //ng.setOnMouseEntered(e -> ng.setStyle("-fx-background-color: -fx-shadow-highlight-color, -fx-outer-border, -fx-inner-border, -fx-body-color;\""));
            //ng.setOnMouseExited(e -> ng.setStyle("-fx-background-color:transparent;");
            ng.setOnAction(e -> {
                System.out.println("New game selected");
                stackPane.getChildren().add(p2);
            });
            ButtonFormat(lg,720,350,445,70);
            lg.setOnAction(e -> {
                System.out.println("Load game selected");
            });
            ButtonFormat(ex,730,455,400,60);
            ex.setOnAction(e -> {
                System.out.println("Exit selected");
                stage.close();
            });

            Group bgrp = new Group();
            bgrp.getChildren().add(chLev);
            bgrp.getChildren().add(ng);
            bgrp.getChildren().add(lg);
            bgrp.getChildren().add(ex);
            bgrp.setRotate(7);

            p.getChildren().add(bgrp);

            Scene scene1 = new Scene(stackPane, 1350, 700);

            stage.setTitle("Plants Vs Zombies");
            stage.setScene(scene1);
            stage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Main Method
    public static void main(String args[]) {
        // launch the application
        launch(args);
    }
}
