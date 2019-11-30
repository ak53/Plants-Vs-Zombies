package sample;

import javafx.animation.PathTransition;
import javafx.animation.TranslateTransition;
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
    Lawn l;
    int x;
    int y;
    Group sungrp;
    Sun(int x, int y,Lawn l){
        this.x = x;
        this.y = y;
        sungrp= new Group();
        this.l = l;
    }

    public void appear(){
        Button btn = new Button("");
        btn.setLayoutX(x);
        btn.setLayoutY(y);
        btn.setPrefSize(70,70);
        btn.setStyle("-fx-background-color:transparent;");


        Image imageSun = new Image("file:sun.png", 70,70,false,false);
        ImageView imsun = new ImageView();
        imsun.setImage(imageSun);
        imsun.setPreserveRatio(true);
        imsun.relocate(x,y);
        sungrp.getChildren().add(imsun);
        sungrp.getChildren().add(btn);
        this.l.root.getChildren().add(sungrp);

        btn.setOnAction(e->{
            System.out.println("Sun selected");
            this.l.sunToken+=25;
            this.l.NumSuns.setText(Integer.toString(l.sunToken));
            this.l.root.getChildren().remove(sungrp);
            sungrp.setLayoutX(2000);
        });
    }
    /*public void disappear(){

    }
    public void collected(){

    }*/
}

class FallingSun extends Sun{
    static int FallSpeed;
    FallingSun(int x, int y, Lawn l)
    {
        super(x, y, l);
    }

    //static PathTransition transition;
    public void Fall(){
        appear();
        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setDuration(Duration.seconds(10));
        translateTransition.setNode(sungrp);
        translateTransition.setFromY(20);
        translateTransition.setByY(400);
        translateTransition.play();
    }
}
