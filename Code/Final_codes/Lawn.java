package sample;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.beans.property.*;
import javafx.util.*;
import java.util.*;

import java.util.List;
import java.util.stream.Collectors;

public class Lawn {
    Characters[] Grid;
    boolean[] LawnMowersAlive;
    ArrayList<LawnMower> lawnmovers = new ArrayList<LawnMower>();
    HashMap<Integer,ArrayList<Plant>> plantgrid =new HashMap<Integer,ArrayList<Plant>>();
    HashMap<Integer,ArrayList<Zombie>> zombiegrid=new HashMap<Integer, ArrayList<Zombie>>();
    //int[] Zombies isme ya level mein
    //int NumSuns isme ya level mein
    protected static Pane root=new Pane();
    private double zt=0;

    static LawnMower l1 = new LawnMower(50);
    static LawnMower l2 = new LawnMower(110);
    static LawnMower l3 = new LawnMower(170);
    static LawnMower l4 = new LawnMower(230);
    static LawnMower l5 = new LawnMower(290);

    public static void lawnbutton(Button b, double posx, double posy, double sx, double sy){
        b.setLayoutX(posx);
        b.setLayoutY(posy);
        b.setPrefSize(sx,sy);
        b.setStyle("-fx-background-color:transparent;");
    }

    public static void PauseButtonDisp(){
        ///////////////////////////////////// PAUSE MENU BUTTON //////////////////////////////////////////
        Button pauseMenu = new Button("");
        pauseMenu.setLayoutX(1175);
        pauseMenu.setLayoutY(0);
        pauseMenu.setPrefSize(160,27);
        pauseMenu.setStyle("-fx-background-color:transparent;");
        root.getChildren().add(pauseMenu);
        pauseMenu.setOnAction(e->{
            System.out.println("Menu selected");
            Main.stackPaneG.getChildren().add(InGameMenu.p2G);
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////
    }

    public static void SunTokenDisp(){
        Label NumSuns = new Label("");   // NO. OF AVAILABLE SUNS
        NumSuns.setText("50");
        Lawn.root.getChildren().add(NumSuns);
        NumSuns.setLayoutX(50);
        NumSuns.setLayoutY(87);
    }

    public static void progressTimer(){
        Timeline timeline=null;
        IntegerProperty timeSeconds = new SimpleIntegerProperty(30*100);
        ProgressBar progressBar = new ProgressBar();
        progressBar.progressProperty().bind(
                timeSeconds.divide(30*100.0).subtract(1).multiply(-1));
        progressBar.setLayoutX(497);
        progressBar.setLayoutY(12);
        progressBar.setPrefHeight(20);
        progressBar.setPrefWidth(215);
        if (timeline != null) {
            timeline.stop();
        }
        timeSeconds.set((30+1)*100);
        timeline = new Timeline();
        timeline.getKeyFrames().add(
                new KeyFrame(Duration.seconds(30+1),
                        new KeyValue(timeSeconds, 0)));
        timeline.playFromStart();
        Lawn.root.getChildren().add(progressBar);

    }

    public void LawnLayout(){
        Image image1G = new Image("file:Lawn.png", 1330,700,false,false);
        ImageView iv1G = new ImageView();
        iv1G.setImage(image1G);
        PauseButtonDisp();
        SunTokenDisp();
        progressTimer();
        new FallingSun().Fall();
        //Plant p=new PeaShooter(200,100,90,90,"plant",this);
        l1.displayLawnMower();
        l5.displayLawnMower();
        l2.displayLawnMower();
        l3.displayLawnMower();
        l4.displayLawnMower();
        //Zombie.create(this);

        ////////////////////////////////////// LAWN GRID BUTONS ////////////////////////////////////////
        Button zz = new Button("");
        lawnbutton(zz,380,100,100,100);
        Button zo = new Button("");
        lawnbutton(zo,380,215,100,100);
        Button ztw = new Button("");
        lawnbutton(ztw,380,330,100,100);
        Button zth = new Button("");
        lawnbutton(zth,380,450,100,100);
        Button zerof = new Button("");
        lawnbutton(zerof,380,560,100,100);
        Button oz = new Button("");
        lawnbutton(oz,490,100,100,100);
        Button oo = new Button("");
        lawnbutton(oo,490,215,100,100);
        Button otw = new Button("");
        lawnbutton(otw,490,330,100,100);
        Button oth = new Button("");
        lawnbutton(oth,490,450,100,100);
        Button of = new Button("");
        lawnbutton(of,490,560,100,100);
        Button twz = new Button("");
        lawnbutton(twz,585,100,100,100);
        Button two = new Button("");
        lawnbutton(two,585,215,100,100);
        Button twtw = new Button("");
        lawnbutton(twtw,585,330,100,100);
        Button twth = new Button("");
        lawnbutton(twth,585,450,100,100);
        Button twf = new Button("");
        lawnbutton(twf,585,560,100,100);
        Button thz = new Button("");
        lawnbutton(thz,687,100,100,100);
        Button tho = new Button("");
        lawnbutton(tho,687,215,100,100);
        Button thtw = new Button("");
        lawnbutton(thtw,687,330,100,100);
        Button thth = new Button("");
        lawnbutton(thth,687,450,100,100);
        Button thf = new Button("");
        lawnbutton(thf,687,560,100,100);
        Button fz = new Button("");
        lawnbutton(fz,790,100,100,100);
        Button fo = new Button("");
        lawnbutton(fo,790,215,100,100);
        Button ftw = new Button("");
        lawnbutton(ftw,790,330,100,100);
        Button fth = new Button("");
        lawnbutton(fth,790,450,100,100);
        Button ff = new Button("");
        lawnbutton(ff,790,560,100,100);
        Button fiz = new Button("");
        lawnbutton(fiz,896,100,100,100);
        Button fio = new Button("");
        lawnbutton(fio,896,215,100,100);
        Button fitw = new Button("");
        lawnbutton(fitw,896,330,100,100);
        Button fith = new Button("");
        lawnbutton(fith,896,450,100,100);
        Button fif = new Button("");
        lawnbutton(fif,896,560,100,100);
        Button sz = new Button("");
        lawnbutton(sz,999,100,100,100);
        Button so = new Button("");
        lawnbutton(so,999,215,100,100);
        Button stw = new Button("");
        lawnbutton(stw,999,330,100,100);
        Button sth = new Button("");
        lawnbutton(sth,999,450,100,100);
        Button sf = new Button("");
        lawnbutton(sf,999,560,100,100);
        Button sez = new Button("");
        lawnbutton(sez,1100,100,100,100);
        Button seo = new Button("");
        lawnbutton(seo,1100,215,100,100);
        Button setw = new Button("");
        lawnbutton(setw,1100,330,100,100);
        Button seth = new Button("");
        lawnbutton(seth,1100,450,100,100);
        Button sef = new Button("");
        lawnbutton(sef,1100,560,100,100);
        Button ez = new Button("");
        lawnbutton(ez,1200,100,100,100);
        Button eo = new Button("");
        lawnbutton(eo,1200,215,100,100);
        eo.setOnAction(e->{
            System.out.println("button click ho gya");
        });
        Button etw = new Button("");
        lawnbutton(etw,1200,330,100,100);
        Button eth = new Button("");
        lawnbutton(eth,1200,450,100,100);
        Button ef = new Button("");
        lawnbutton(ef,1200,560,100,100);

        Group bgrpG = new Group();
        bgrpG.getChildren().add(zo);
        bgrpG.getChildren().add(zz);
        bgrpG.getChildren().add(ztw);
        bgrpG.getChildren().add(zth);
        bgrpG.getChildren().add(zerof);
        bgrpG.getChildren().add(oz);
        bgrpG.getChildren().add(oo);
        bgrpG.getChildren().add(otw);
        bgrpG.getChildren().add(oth);
        bgrpG.getChildren().add(of);
        bgrpG.getChildren().add(twz);
        bgrpG.getChildren().add(two);
        bgrpG.getChildren().add(twtw);
        bgrpG.getChildren().add(twth);
        bgrpG.getChildren().add(twf);
        bgrpG.getChildren().add(thz);
        bgrpG.getChildren().add(tho);
        bgrpG.getChildren().add(thtw);
        bgrpG.getChildren().add(thth);
        bgrpG.getChildren().add(thf);
        bgrpG.getChildren().add(fz);
        bgrpG.getChildren().add(fo);
        bgrpG.getChildren().add(ftw);
        bgrpG.getChildren().add(fth);
        bgrpG.getChildren().add(ff);
        bgrpG.getChildren().add(fiz);
        bgrpG.getChildren().add(fio);
        bgrpG.getChildren().add(fitw);
        bgrpG.getChildren().add(fith);
        bgrpG.getChildren().add(fif);
        bgrpG.getChildren().add(sz);
        bgrpG.getChildren().add(so);
        bgrpG.getChildren().add(stw);
        bgrpG.getChildren().add(sth);
        bgrpG.getChildren().add(sf);
        bgrpG.getChildren().add(sez);
        bgrpG.getChildren().add(seo);
        bgrpG.getChildren().add(setw);
        bgrpG.getChildren().add(seth);
        bgrpG.getChildren().add(sef);
        bgrpG.getChildren().add(ez);
        bgrpG.getChildren().add(eo);
        bgrpG.getChildren().add(etw);
        bgrpG.getChildren().add(eth);
        bgrpG.getChildren().add(ef);

        root.getChildren().add(bgrpG);

        Main.stackPaneG.getChildren().addAll(iv1G,createContent());
        //////////////////////////////////////////////////////////////////////////////////////////////////
    }

    private Parent createContent(){
        root.setPrefSize(1350,700);

        AnimationTimer timer=new AnimationTimer() {
            @Override
            public void handle(long now) {
                update();
            }
        };
        timer.start();

        Plant p=new PeaShooter(200,280,90,90,"plant",this);
        Plant p2=new PeaShooter(200,210,90,90,"plant",this);
        Plant p3=new PeaShooter(200,140,90,90,"plant",this);
        Plant p4=new PeaShooter(200,70,90,90,"plant",this);
        Plant p5=new PeaShooter(200,0,90,90,"plant",this);
//        nextLevel();
        return root;
    }

    private void update() {
        zt += 0.1;

        if (zt > 50) {
            zt = 0;
            Zombie z = Zombie.create(this);
            z.Walk();
        }
    }

}
