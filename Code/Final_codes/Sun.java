package sample;

import javafx.animation.PathTransition;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.util.Duration;

public class Sun {
    static int Value = 25;

    Group sungrp = new Group();
    public void appear(int x, int y){
        Button btn = new Button("");
        btn.setLayoutX(x);
        btn.setLayoutY(y);
        btn.setPrefSize(70,70);
        btn.setStyle("-fx-background-color:transparent;");
        btn.setOnAction(e->{
            System.out.println("Sun selected");
        });

        Image imageSun = new Image("file:sun.png", 70,70,false,false);
        ImageView imsun = new ImageView();
        imsun.setImage(imageSun);
        imsun.setPreserveRatio(true);
        imsun.relocate(x,y);
        sungrp.getChildren().add(imsun);
        sungrp.getChildren().add(btn);
        Lawn.root.getChildren().add(sungrp);
    }
    public void disappear(){

    }
    public void collected(){

    }
}

class FallingSun extends Sun{
    static int FallSpeed;
    static PathTransition transition;
    public void Fall(){
        appear(700,0);
        transition = new PathTransition();
        transition.setNode(sungrp);
        transition.setDuration(Duration.seconds(10));
        Path path = new Path();
        path.getElements().add(new MoveTo(700, 20));
        path.getElements().add(new LineTo(700, 800));
        transition.setPath(path);
    }
}
