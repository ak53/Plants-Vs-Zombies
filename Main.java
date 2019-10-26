package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
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

            // set title for the stage
            stage.setTitle("VBox");

            // create a VBox
            VBox vbox = new VBox(20);

            // set alignment
            vbox.setAlignment(Pos.CENTER);

            vbox.getChildren().add(new Button("New Game"));
            vbox.getChildren().add(new Button("Load Game"));
            vbox.getChildren().add(new Button("Exit"));

            // create a scene
            Scene scene = new Scene(vbox, 300, 300);

            // set the scene
            stage.setScene(scene);

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