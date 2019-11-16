package sample;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.util.Duration;

import java.util.Timer;
import java.util.TimerTask;

public class Main extends Application {

    PathTransition transition;

    public void lawnbutton(Button b, double posx, double posy, double sx, double sy){
        b.setLayoutX(posx);
        b.setLayoutY(posy);
        b.setPrefSize(sx,sy);
        b.setStyle("-fx-background-color:transparent;");
    }

    public void ButtonFormat(Button b, double posx, double posy, double sx, double sy){
        b.setLayoutX(posx);
        b.setLayoutY(posy);
        b.setPrefSize(sx,sy);
        b.setStyle("-fx-background-color:transparent;");
    }

    // launch the application
    public void start(Stage stage) {
        try {
            StackPane stackPane = new StackPane();   // 1ST STACK PANE WITH THE MAIN MENU
            Scene scene1 = new Scene(stackPane, 1350, 700);

            StackPane stackPaneG = new StackPane();   // 2ND STACK PANE WITH THE GAME PLAY SCREEN
            Scene scene2 = new Scene(stackPaneG,1350,700);

            Pane pG = new Pane();   // MAIN GAME PLAY AREA
            Image image1G = new Image("file:Lawn.png", 1330,700,false,false);
            ImageView iv1G = new ImageView();
            iv1G.setImage(image1G);

            Pane p2G = new Pane();   // IN GAME PAUSE MENU
            Image image2G = new Image("file:pauseMenu.png", 1100,800,false,false);
            ImageView iv2G = new ImageView();
            iv2G.setX(160);
            iv2G.setImage(image2G);
            iv2G.setPreserveRatio(true);
            p2G.getChildren().add(iv2G);

            Label NumSuns = new Label("");   // NO. OF AVAILABLE SUNS
            NumSuns.setText("50");
            pG.getChildren().add(NumSuns);
            NumSuns.setLayoutX(50);
            NumSuns.setLayoutY(87);

            Rectangle timer = new Rectangle();    // PROGRESS TIMER
            timer.setHeight(15);
            timer.setX(497);
            timer.setWidth(50);
            timer.setY(12);
            timer.setFill(Color.GREENYELLOW);
            pG.getChildren().add(timer);
            Timer animTimer = new Timer();

            ///////////////////////////// SUN DROP ANIMATION ///////////////////////////////////////
            Group root = new Group();
            Button btn = new Button("");
            btn.setLayoutX(700);
            btn.setLayoutY(0);
            btn.setPrefSize(70,70);
            btn.setStyle("-fx-background-color:transparent;");
            btn.setOnAction(e->{
                System.out.println("Sun selected");
            });

            Image imageSun = new Image("file:sun.png", 70,70,false,false);
            ImageView imsun = new ImageView();
            imsun.setImage(imageSun);
            imsun.setPreserveRatio(true);
            imsun.relocate(700,0);
            root.getChildren().add(imsun);
            root.getChildren().add(btn);
            pG.getChildren().add(root);
            transition = new PathTransition();
            transition.setNode(root);
            transition.setDuration(Duration.seconds(10));
            Path path = new Path();
            path.getElements().add(new MoveTo(700, 20));
            path.getElements().add(new LineTo(700, 800));
            transition.setPath(path);
            ////////////////////////////////////////////////////////////////////////////////////////////////

            ////////////////////////////////////////////// LAWNMOWERS ///////////////////////////////////////
            Image lm1 = new Image("file:LawnMower.png", 100,70, false, false);
            ImageView ivlm1 = new ImageView();
            ivlm1.setImage(lm1);
            ivlm1.setPreserveRatio(true);
            ivlm1.relocate(310,115);
            pG.getChildren().add(ivlm1);
            ImageView ivlm3 = new ImageView();
            ivlm3.setImage(lm1);
            ivlm3.setPreserveRatio(true);
            ivlm3.relocate(310,335);
            pG.getChildren().add(ivlm3);
            ImageView ivlm4 = new ImageView();
            ivlm4.setImage(lm1);
            ivlm4.setPreserveRatio(true);
            ivlm4.relocate(310,450);
            pG.getChildren().add(ivlm4);
            ImageView ivlm5 = new ImageView();
            ivlm5.setImage(lm1);
            ivlm5.setPreserveRatio(true);
            ivlm5.relocate(310,565);
            pG.getChildren().add(ivlm5);
            //////////////////////////////////////////////////////////////////////////////////////////////////

            Image pb = new Image("file:Peabullet.png",30,30,false,false);
            ImageView ivpb = new ImageView();
            ivpb.setImage(pb);
            pG.getChildren().add(ivpb);
            TranslateTransition bullettrans = new TranslateTransition();
            bullettrans.setDuration(Duration.seconds(7));
            bullettrans.setNode(ivpb);
            bullettrans.setFromX(415);
            bullettrans.setFromY(100);
            bullettrans.setToX(1400);

            Image plimg = new Image("file:Pea.gif",90,100,false,false);
            ImageView ivpl = new ImageView();
            ivpl.setImage(plimg);
            ivpl.setPreserveRatio(true);
            ivpl.relocate(400,80);
            pG.getChildren().add(ivpl);

            Image zomimg = new Image("file:Zombie.gif",90,170,false,false);
            ImageView ivzom = new ImageView();
            ivzom.setImage(zomimg);
            ivzom.setPreserveRatio(true);
            //ivzom.relocate(1155,60);
            pG.getChildren().add(ivzom);
            TranslateTransition translateTransition = new TranslateTransition();
            translateTransition.setDuration(Duration.seconds(35));
            translateTransition.setNode(ivzom);
            translateTransition.setFromX(1270);
            translateTransition.setFromY(20);
            translateTransition.setByX(-910);

            Image zom2 = new Image("file:Zombie.gif",90,170,false,false);
            ImageView ivzom2 = new ImageView();
            ivzom2.setImage(zom2);
            ivzom2.setPreserveRatio(true);
            //ivzom.relocate(1155,60);
            pG.getChildren().add(ivzom2);
            TranslateTransition tT = new TranslateTransition();
            tT.setDuration(Duration.seconds(35));
            tT.setNode(ivzom2);
            tT.setFromX(1270);
            tT.setFromY(120);
            tT.setByX(-910);

            Rotate rotate = new Rotate(0,90,170);
            ivzom2.getTransforms().add(rotate);
            //rotate.setPivotX(0);
            //rotate.setPivotY(170);
            //ivzom2.getTransforms().add(rotate);

            tT.setOnFinished(e->{
                rotate.setAngle(90);
            });

            Image lawnMover = new Image("file:LawnMower.png",100,70,false,false);
            ImageView lm = new ImageView();
            lm.setImage(lawnMover);
            lm.setPreserveRatio(true);
            //ivzom.relocate(1155,60);
            pG.getChildren().add(lm);
            TranslateTransition moverTrans = new TranslateTransition();
            moverTrans.setDuration(Duration.seconds(7));
            moverTrans.setNode(lm);
            moverTrans.setFromX(310);
            moverTrans.setFromY(230);
            moverTrans.setToX(1400);

            moverTrans.setOnFinished(e->{
                pG.getChildren().remove(ivzom2);
            });

            SequentialTransition s = new SequentialTransition(tT,moverTrans);

            ///////////////////////////////////// PAUSE MENU BUTTONS //////////////////////////////////////////
            Button pauseMenu = new Button("");
            pauseMenu.setLayoutX(1175);
            pauseMenu.setLayoutY(0);
            pauseMenu.setPrefSize(160,27);
            pauseMenu.setStyle("-fx-background-color:transparent;");
            pG.getChildren().add(pauseMenu);
            pauseMenu.setOnAction(e->{
                System.out.println("Menu selected");
                stackPaneG.getChildren().add(p2G);
            });

            Button save = new Button("");
            save.setLayoutX(558);
            save.setLayoutY(375);
            save.setPrefSize(280,37);
            save.setStyle("-fx-background-color:transparent;");
            save.setOnAction(e->{
                System.out.println("Save selected");
            });

            Button restart = new Button("");
            restart.setLayoutX(558);
            restart.setLayoutY(430);
            restart.setPrefSize(280,37);
            restart.setStyle("-fx-background-color:transparent;");
            restart.setOnAction(e->{
                System.out.println("Restart selected");
            });

            Button exit = new Button("");
            exit.setLayoutX(558);
            exit.setLayoutY(490);
            exit.setPrefSize(280,37);
            exit.setStyle("-fx-background-color:transparent;");
            exit.setOnAction(e->{
                System.out.println("Exit to main menu selected");
                stackPaneG.getChildren().remove(p2G);
                stage.setScene(scene1);
            });

            Button resume = new Button("");
            resume.setLayoutX(465);
            resume.setLayoutY(575);
            resume.setPrefSize(447,88);
            resume.setStyle("-fx-background-color:transparent;");
            resume.setOnAction(e->{
                System.out.println("Resume selected");
                stackPaneG.getChildren().remove(p2G);
            });

            p2G.getChildren().add(save);
            p2G.getChildren().add(restart);
            p2G.getChildren().add(exit);
            p2G.getChildren().add(resume);
            ////////////////////////////////////////////////////////////////////////////////////////////////

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

            pG.getChildren().add(bgrpG);

            stackPaneG.getChildren().addAll(iv1G,pG);
            //////////////////////////////////////////////////////////////////////////////////////////////////

            Pane p = new Pane(); //pane with 3 buttons (Main Menu)
            Image image1 = new Image("file:MainMenu.jpg", 1350, 800, false, false);
            ImageView iv1 = new ImageView();
            iv1.setImage(image1);
            iv1.setPreserveRatio(true);

            ////////////////// 1ST PANE WHICH TAKES USER NAME ////////////////////////////////////////////
            Pane p2 = new Pane();
            Image image2 = new Image("file:Enter_Name.jpg", 500, 300, false, false);
            ImageView iv2 = new ImageView();
            iv2.setX(430);
            iv2.setY(200);
            iv2.setImage(image2);
            iv2.setPreserveRatio(true);
            TextField eName = new TextField("");
            eName.setLayoutX(468);
            eName.setLayoutY(360);
            eName.setPrefWidth(420);
            Button NmOk = new Button("");
            Button NmCancel = new Button("");
            ButtonFormat(NmOk,470,440,190,35);
            NmOk.setOnAction(e -> {
                System.out.println("OK selected");
                User.getInstance(eName.getText()); //Makes a new user if not found, else
                stackPane.getChildren().remove(p2);
            });
            ButtonFormat(NmCancel,700,440,190,35);
            NmCancel.setOnAction(e -> {
                System.out.println("Cancel selected");
                eName.setText("");

            });
            p2.getChildren().add(iv2);
            p2.getChildren().add(eName);
            p2.getChildren().add(NmOk);
            p2.getChildren().add(NmCancel);
            ///////////////////////////////////////////////////////////////////////////////////////////

            ///////////////////////// CHOOSE LEVEL SCREEN /////////////////////////////////////////////////
            Pane p3 = new Pane();
            Image image3 = new Image("file:ChooseLevel.jpg", 1350, 700, false, false);
            ImageView iv3 = new ImageView();
            iv3.setImage(image3);
            p3.getChildren().add(iv3);
            Button l1 = new Button("");
            Button l2 = new Button("");
            Button l3 = new Button("");
            Button l4 = new Button("");
            Button l5 = new Button("");
            Button back = new Button("");
            ButtonFormat(l1,45,57,250,180);
            ButtonFormat(l2,347,57,250,180);
            ButtonFormat(l3,663,57,250,180);
            ButtonFormat(l4,980,57,250,180);
            ButtonFormat(l5,537,260,250,180);
            ButtonFormat(back,580,594,205,50);
            back.setOnAction(e->{
                System.out.println("Back Selected");
                stackPane.getChildren().remove(p3);
            });
            p3.getChildren().add(l1);
            p3.getChildren().add(l2);
            p3.getChildren().add(l3);
            p3.getChildren().add(l4);
            p3.getChildren().add(l5);
            p3.getChildren().add(back);

            stackPane.getChildren().addAll(iv1, p, p2);
            ////////////////////////////////////////////////////////////////////////////////////

            ///////////////////////////////// LOAD GAME SCREEN /////////////////////////////////////////
            Pane p4=new Pane();
            Image image4 = new Image("file:savedFiles.jpg", 1350, 700, false, false);
            ImageView iv4 = new ImageView();
            iv4.setImage(image4);
            p4.getChildren().add(iv4);
            Button backSaved = new Button("");
            ButtonFormat(backSaved,580,594,205,50);
            backSaved.setOnAction(e->{
                System.out.println("Back Selected");
                stackPane.getChildren().remove(p4);
            });
            p4.getChildren().add(backSaved);
            //////////////////////////////////////////////////////////////////////////////////////

            /////////////////////////////////////////// MAIN MENU ///////////////////////////////////
            Button chLev = new Button("");
            Button ng = new Button("");
            Button lg = new Button("");
            Button ex = new Button("");
            ButtonFormat(chLev,715,98,485,85);
            chLev.setOnAction(e -> {
                System.out.println("Choose level selected");
                stackPane.getChildren().add(p3);
            });
            ButtonFormat(ng,720,245,455,80);
            ng.setOnAction(e -> {
                System.out.println("New game selected");
                stage.setScene(scene2);
                //if(!pG.getChildren().contains(ivzom2))  pG.getChildren().add(ivzom2);
                timer.setWidth(50);
                animTimer.scheduleAtFixedRate(new TimerTask() {
                    int i=0;
                    @Override
                    public void run() {
                        if (i<80) {
                            timer.setWidth(timer.getWidth()+2);
                        } else {
                            this.cancel();
                        }
                        i++;
                    }
                }, 1000, 500);
                rotate.setAngle(0);
                bullettrans.play();
                translateTransition.play();
                s.play();
                transition.play();
            });
            ButtonFormat(lg,720,350,445,70);
            lg.setOnAction(e -> {
                System.out.println("Load game selected");
                stackPane.getChildren().add(p4);
            });
            ButtonFormat(ex,730,455,400,60);
            ex.setOnAction(e -> {
                System.out.println("Exit selected");
                animTimer.cancel();
                stage.close();
            });

            Group bgrp = new Group();
            bgrp.getChildren().add(chLev);
            bgrp.getChildren().add(ng);
            bgrp.getChildren().add(lg);
            bgrp.getChildren().add(ex);
            bgrp.setRotate(7);

            p.getChildren().add(bgrp);
            ///////////////////////////////////////////////////////////////////////////////////////////

            stage.setTitle("Plants Vs Zombies");
            stage.setScene(scene1);
            stage.show();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Main Method
    public static void main(String args[]) {
        // launch the application
        launch(args);
    }
}