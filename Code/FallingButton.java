package sample;


import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    PathTransition transition;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group root = new Group();

        // create movable object
        Button btn = new Button("HI DEEPI BRO");
        btn.setLayoutX(100);
        btn.setLayoutY(0);
        btn.setPrefSize(300,20);
        root.getChildren().add(btn);

        // init transition
        transition = new PathTransition();
        transition.setNode(btn);
        transition.setDuration(Duration.seconds(10));

        Scene scene = new Scene(root, 1024, 768);
        Path path = new Path();
        path.getElements().add(new MoveTo(100, 20));
        path.getElements().add(new LineTo(100, 800));
        transition.setPath(path);
        transition.play();


        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }

}
