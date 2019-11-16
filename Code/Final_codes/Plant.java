package sample;

public abstract class Plant extends Characters{
    int reqSun;
    int replantTime;
    public boolean isAvailable(){
        return true;
    }
}

class Sunflower extends Plant{
    public void EmitSun(){

    }
}

class Walnut extends Plant{

}

class PotatoMine extends Plant{
    public void explode(){

    }
    public void grow(){

    }
}

class PeaShooter extends Plant{
    int attackStrength;
    public void Shoot(Zombie z){

    }
}

class Repeater extends PeaShooter{

}