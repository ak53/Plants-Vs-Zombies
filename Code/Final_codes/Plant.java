package sample;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public abstract class Plant extends Characters{
    int reqSun;
    int replantTime;

    public Plant(int x, int y, int h, int w, String type) {
        super(x,y,h,w,"plant");

    }


    public boolean isAvailable(){
        return true;
    }
}

class Sunflower extends Plant{
    public Sunflower(int x, int y, int h, int w, String type) {
        super(x, y, h, w, type);
        this.setImage(new Image("Pea.gif",90,100,false,false));
    }

    public void EmitSun(){

    }
}

class Walnut extends Plant{

    public Walnut(int x, int y, int h, int w, String type) {
        super(x, y, h, w, type);
        this.setImage(new Image("walnut.png",90,100,false,false));
    }
}

class PotatoMine extends Plant{
    public PotatoMine(int x, int y, int h, int w, String type) {
        super(x, y, h, w, type);
        this.setImage(new Image("potatomine.png",90,100,false,false));
    }

    public void explode(){

    }
    public void grow(){

    }
}

class PeaShooter extends Plant{
    int attackStrength;

    public PeaShooter(int x, int y, int h, int w, String type) {
        super(x, y, h, w, type);
        this.setImage(new Image("Pea.gif",90,100,false,false));
    }

    public void shoot(){
        Pea p=new Pea((int)this.getTranslateX()+20,(int)this.getTranslateY(),20,5,"pea");
        System.out.println("boooo");
        Lawn.root.getChildren().add(p);
    }
}

class Repeater extends PeaShooter{

    public Repeater(int x, int y, int h, int w, String type) {
        super(x, y, h, w, type);
        this.setImage(new Image("repeater.png",90,100,false,false));
    }
}
