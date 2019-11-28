package sample;

import javafx.scene.paint.Color;

public abstract class Plant extends Characters{
    int reqSun;
    int replantTime;

    public Plant(int x,int y,int h,int w,String type) {
        super(x,y,h,w,"plant");

    }

    public boolean isAvailable(){
        return true;
    }
}

class Sunflower extends Plant{
    public Sunflower(int x, int y, int h, int w, String type) {
        super(x, y, h, w, type);
    }

    public void EmitSun(){

    }
}

class Walnut extends Plant{

    public Walnut(int x, int y, int h, int w, String type) {
        super(x, y, h, w, type);
    }
}

class PotatoMine extends Plant{
    public PotatoMine(int x, int y, int h, int w, String type) {
        super(x, y, h, w, type);
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
    }

    public void shoot(Plant who){
        Characters c=new Characters((int)who.getTranslateX()+20,(int)who.getTranslateY(),20,5,who.type+"pea");
        Lawn.root.getChildren().add(c);
    }
}

class Repeater extends PeaShooter{

    public Repeater(int x, int y, int h, int w, String type) {
        super(x, y, h, w, type);
    }
}
