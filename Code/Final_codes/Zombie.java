package sample;
import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.util.Duration;

import java.util.Random;

public abstract class Zombie extends Characters{
    int walkSpeed;

    public Zombie(int x, int y, int h, int w, String type) {
        super(x,y,w,h,"zombie");
    }

    public static Zombie create(){
        Zombie z=new BasicZ(1250,(new Random().nextInt(5)+1)*150,120,70,"zombie");
        Lawn.root.getChildren().add(z);
        return z;
    }

    public void Eat(Plant p){

    }
    public void Walk(){
        TranslateTransition translateTransition = new TranslateTransition();
        //Setting the duration of the transition
        translateTransition.setDuration(Duration.seconds(39));
        //Setting the node for the transition
        translateTransition.setNode(this);
        translateTransition.setFromX(1270);
//        translateTransition.setFromY(20);
        //Setting the value of the transition along the x axis.
        translateTransition.setByX(-910);
        translateTransition.play();
    }
}

class BasicZ extends Zombie{

    public BasicZ(int x, int y, int h, int w, String type) {
        super(x, y, h, w, type);
        this.setImage(new Image("Zombie.gif",90,170,false,false));
    }
}

class FlagZ extends Zombie{

    public FlagZ(int x, int y, int h, int w, String type) {
        super(x, y, h, w, type);
        this.setImage(new Image("flagzombie.gif",90,170,false,false));

    }
}

class BucketHeadZ extends Zombie{

    public BucketHeadZ(int x, int y, int h, int w, String type) {
        super(x, y, h, w, type);
        this.setImage(new Image("buckethead.gif",90,170,false,false));

    }
}

class ConeHeadZ extends Zombie{

    public ConeHeadZ(int x, int y, int h, int w, String type) {
        super(x, y, h, w, type);
        this.setImage(new Image("Conehead.gif",90,170,false,false));

    }
}
