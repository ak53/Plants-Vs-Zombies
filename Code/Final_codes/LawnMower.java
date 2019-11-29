package sample;

import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class LawnMower extends Sprite{
    int Speed;

    LawnMower(int ypos){
        super(140, ypos, 100,70);
        Image lm1 = new Image("file:LawnMower.png", 100,70, false, false);
        this.setImage(lm1);
    }

    public void displayLawnMower(){
        this.setPreserveRatio(true);
        //this.relocate(310,ypos);//115,230,335,450,565,
        Lawn.root.getChildren().add(this);
    }

    public void Move(){
        TranslateTransition moverTrans = new TranslateTransition();
        moverTrans.setDuration(Duration.seconds(7));
        moverTrans.setNode(this);
        moverTrans.setFromX(310);
        moverTrans.setFromY(230);
        moverTrans.setToX(1400);
        moverTrans.play();
    }
}
