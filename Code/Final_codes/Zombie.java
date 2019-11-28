package sample;

public abstract class Zombie extends Characters{
    int walkSpeed;

    public Zombie(int x,int y,int h,int w,String type) {
        super(x,y,w,h,"zombie");
    }

    public void Eat(Plant p){

    }
    public void Walk(){

    }
}

class BasicZ extends Zombie{

    public BasicZ(int x, int y, int h, int w, String type) {
        super(x, y, h, w, type);
    }
}

class FlagZ extends Zombie{

    public FlagZ(int x, int y, int h, int w, String type) {
        super(x, y, h, w, type);
    }
}

class BucketHeadZ extends Zombie{

    public BucketHeadZ(int x, int y, int h, int w, String type) {
        super(x, y, h, w, type);
    }
}

class ConeHeadZ extends Zombie{

    public ConeHeadZ(int x, int y, int h, int w, String type) {
        super(x, y, h, w, type);
    }
}
