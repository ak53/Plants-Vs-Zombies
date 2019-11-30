package sample;

import javafx.scene.control.Button;

public class PlantMenu {

    Button p1 = new Button("");
    Button p2 = new Button("");
    Button p3 = new Button("");
    Button p4 = new Button("");
    Button p5 = new Button("");
    Lawn l;

    PlantMenu(int lev, Lawn l){
        this.l = l;
        if(lev==1){
            p2.setDisable(true);
            p3.setDisable(true);
            p4.setDisable(true);
            p5.setDisable(true);
        }
        else if(lev==2){
            p3.setDisable(true);
            p4.setDisable(true);
            p5.setDisable(true);
        }
        else if(lev==3){
            p4.setDisable(true);
            p5.setDisable(true);
        }
        else if(lev==4){
            p5.setDisable(true);
        }
    }

    public void menuButtons(){
        Main.ButtonFormat(p1,115,10,60,85);
        Main.ButtonFormat(p2,190,10,60, 85);
        Main.ButtonFormat(p3,263, 10, 60, 85);
        Main.ButtonFormat(p4,335, 10, 60, 85);
        Main.ButtonFormat(p5,405, 10, 60, 85);

        l.root.getChildren().add(p1);
        l.root.getChildren().add(p2);
        l.root.getChildren().add(p3);
        l.root.getChildren().add(p4);
        l.root.getChildren().add(p5);
    }
    public void BuyPlant(){

    }
}
