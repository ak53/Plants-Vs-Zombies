package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.util.Duration;

public class Main extends Application {

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
        //b.setStyle("-fx-background-color:transparent;");
    }

    // launch the application
    public void start(Stage stage) {
        try {
            StackPane stackPane = new StackPane(); //To display the scenes on top of each other
            StackPane stackPaneG = new StackPane();
            Scene scene1 = new Scene(stackPane, 1350, 700);
            Scene scene2 = new Scene(stackPaneG,1350,700);

            Pane pG = new Pane();
            Image image1G = new Image("Lawn.png", 1330,700,false,false);
            ImageView iv1G = new ImageView();
            iv1G.setImage(image1G);

            Pane p2G = new Pane();
            Image image2G = new Image("pauseMenu.png", 1350,800,false,false);
            ImageView iv2G = new ImageView();
            iv2G.setImage(image2G);
            iv2G.setPreserveRatio(true);
            p2G.getChildren().add(iv2G);
            

            Image zomimg = new Image("Zombie.gif",80,150,false,false);
            ImageView ivzom = new ImageView();
            ivzom.setImage(zomimg);
            ivzom.setPreserveRatio(true);
            ivzom.relocate(1135,40);
            pG.getChildren().add(ivzom);

            Image plimg = new Image("Pea.gif",90,110,false,false);
            ImageView ivpl = new ImageView();
            ivpl.setImage(plimg);
            ivpl.setPreserveRatio(true);
            ivpl.relocate(90,100);
            pG.getChildren().add(ivpl);

            Image lm1 = new Image("LawnMower.png", 100,70, false, false);
            ImageView ivlm1 = new ImageView();
            ivlm1.setImage(lm1);
            ivlm1.setPreserveRatio(true);
            ivlm1.relocate(10,115);
            pG.getChildren().add(ivlm1);
            ImageView ivlm2 = new ImageView();
            ivlm2.setImage(lm1);
            ivlm2.setPreserveRatio(true);
            ivlm2.relocate(10,230);
            pG.getChildren().add(ivlm2);
            ImageView ivlm3 = new ImageView();
            ivlm3.setImage(lm1);
            ivlm3.setPreserveRatio(true);
            ivlm3.relocate(10,335);
            pG.getChildren().add(ivlm3);
            ImageView ivlm4 = new ImageView();
            ivlm4.setImage(lm1);
            ivlm4.setPreserveRatio(true);
            ivlm4.relocate(10,450);
            pG.getChildren().add(ivlm4);
            ImageView ivlm5 = new ImageView();
            ivlm5.setImage(lm1);
            ivlm5.setPreserveRatio(true);
            ivlm5.relocate(10,565);
            pG.getChildren().add(ivlm5);

            Button save = new Button("Save");
            save.setLayoutX(500);
            save.setLayoutY(375);
            save.setPrefSize(330,37);
            //pauseMenu.setStyle("-fx-background-color:transparent;");
            save.setOnAction(e->{
                System.out.println("Save selected");

            });

            Button restart = new Button("Restart");
            restart.setLayoutX(500);
            restart.setLayoutY(430);
            restart.setPrefSize(330,37);
            //pauseMenu.setStyle("-fx-background-color:transparent;");
            restart.setOnAction(e->{
                System.out.println("Restart selected");

            });

            Button exit = new Button("To Main Menu");
            exit.setLayoutX(500);
            exit.setLayoutY(495);
            exit.setPrefSize(330,30);
            //pauseMenu.setStyle("-fx-background-color:transparent;");
            exit.setOnAction(e->{
                System.out.println("Exit to main menu selected");

            });

            Button resume = new Button("Resume");
            resume.setLayoutX(400);
            resume.setLayoutY(565);
            resume.setPrefSize(500,88);
            //pauseMenu.setStyle("-fx-background-color:transparent;");
            resume.setOnAction(e->{
                System.out.println("Resume selected");
                stackPane.getChildren().remove(p2G);

            });

            p2G.getChildren().add(save);
            p2G.getChildren().add(restart);
            p2G.getChildren().add(exit);
            p2G.getChildren().add(resume);

            Label NumSuns = new Label("");
            NumSuns.setText("50");
            pG.getChildren().add(NumSuns);
            NumSuns.setLayoutX(70);
            NumSuns.setLayoutY(75);

            Button zz = new Button("0,0");
            lawnbutton(zz,70,100,120,100);
            Button zo = new Button("0,1");
            lawnbutton(zo,70,215,120,100);
            Button ztw = new Button("0,2");
            lawnbutton(ztw,70,330,120,100);
            Button zth = new Button("0,3");
            lawnbutton(zth,70,450,120,100);
            Button zerof = new Button("0,4");
            lawnbutton(zerof,70,560,120,100);
            Button oz = new Button("1,0");
            lawnbutton(oz,200,100,120,100);
            Button oo = new Button("1,1");
            lawnbutton(oo,200,215,120,100);
            Button otw = new Button("1,2");
            lawnbutton(otw,200,330,120,100);
            Button oth = new Button("1,3");
            lawnbutton(oth,200,450,120,100);
            Button of = new Button("1,4");
            lawnbutton(of,200,560,120,100);
            Button twz = new Button("2,0");
            lawnbutton(twz,340,100,120,100);
            Button two = new Button("2,1");
            lawnbutton(two,340,215,120,100);
            Button twtw = new Button("2,2");
            lawnbutton(twtw,340,330,120,100);
            Button twth = new Button("2,3");
            lawnbutton(twth,340,450,120,100);
            Button twf = new Button("2,4");
            lawnbutton(twf,340,560,120,100);
            Button thz = new Button("3,0");
            lawnbutton(thz,480,100,120,100);
            Button tho = new Button("3,1");
            lawnbutton(tho,480,215,120,100);
            Button thtw = new Button("3,2");
            lawnbutton(thtw,480,330,120,100);
            Button thth = new Button("3,3");
            lawnbutton(thth,480,450,120,100);
            Button thf = new Button("3,4");
            lawnbutton(thf,480,560,120,100);
            Button fz = new Button("4,0");
            lawnbutton(fz,610,100,120,100);
            Button fo = new Button("4,1");
            lawnbutton(fo,610,215,120,100);
            Button ftw = new Button("4,2");
            lawnbutton(ftw,610,330,120,100);
            Button fth = new Button("4,3");
            lawnbutton(fth,610,450,120,100);
            Button ff = new Button("4,4");
            lawnbutton(ff,610,560,120,100);
            Button fiz = new Button("5,0");
            lawnbutton(fiz,745,100,120,100);
            Button fio = new Button("5,1");
            lawnbutton(fio,745,215,120,100);
            Button fitw = new Button("5,2");
            lawnbutton(fitw,745,330,120,100);
            Button fith = new Button("5,3");
            lawnbutton(fith,745,450,120,100);
            Button fif = new Button("5,4");
            lawnbutton(fif,745,560,120,100);
            Button sz = new Button("6,0");
            lawnbutton(sz,875,100,120,100);
            Button so = new Button("6,1");
            lawnbutton(so,875,215,120,100);
            Button stw = new Button("6,2");
            lawnbutton(stw,875,330,120,100);
            Button sth = new Button("6,3");
            lawnbutton(sth,875,450,120,100);
            Button sf = new Button("6,4");
            lawnbutton(sf,875,560,120,100);
            Button sez = new Button("7,0");
            lawnbutton(sez,1010,100,120,100);
            Button seo = new Button("7,1");
            lawnbutton(seo,1010,215,120,100);
            Button setw = new Button("7,2");
            lawnbutton(setw,1010,330,120,100);
            Button seth = new Button("7,3");
            lawnbutton(seth,1010,450,120,100);
            Button sef = new Button("7,4");
            lawnbutton(sef,1010,560,120,100);
            Button ez = new Button("8,0");
            lawnbutton(ez,1135,100,120,100);
            Button eo = new Button("8,1");
            lawnbutton(eo,1135,215,120,100);
            Button etw = new Button("8,2");
            lawnbutton(etw,1135,330,120,100);
            Button eth = new Button("8,3");
            lawnbutton(eth,1135,450,120,100);
            Button ef = new Button("8,4");
            lawnbutton(ef,1135,560,120,100);

            //zz.setStyle("-fx-background-color:transparent;");
            //ng.setOnMouseEntered(e -> ng.setStyle("-fx-background-color: -fx-shadow-highlight-color, -fx-outer-border, -fx-inner-border, -fx-body-color;\""));
            //ng.setOnMouseExited(e -> ng.setStyle("-fx-background-color:transparent;");
            //zz.setOnAction(e->{
            //System.out.println("New game selected");
            //stackPane.getChildren().add(p)
            //});

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

            Button sun = new Button();

            stackPaneG.getChildren().addAll(iv1G,pG);

            Button pauseMenu = new Button("Menu");
            pauseMenu.setLayoutX(1150);
            pauseMenu.setLayoutY(0);
            pauseMenu.setPrefSize(170,27);
            //pauseMenu.setStyle("-fx-background-color:transparent;");
            pG.getChildren().add(pauseMenu);
            pauseMenu.setOnAction(e->{
                System.out.println("Menu selected");
                stackPaneG.getChildren().add(p2G);

            });


            Pane p = new Pane(); //pane with 3 buttons (Main Menu)
            Image image1 = new Image("MainMenu.jpg", 1350, 800, false, false);
            ImageView iv1 = new ImageView();
            iv1.setImage(image1);
            iv1.setPreserveRatio(true);

            Pane p2 = new Pane(); //pane with text box and buttons for new name
            Image image2 = new Image("Enter_Name.jpg", 500, 300, false, false);
            ImageView iv2 = new ImageView();
            iv2.setX(430);
            iv2.setY(200);
            iv2.setImage(image2);
            iv2.setPreserveRatio(true);
            TextField eName = new TextField("");
            eName.setLayoutX(468);
            eName.setLayoutY(360);
            eName.setPrefWidth(420);
            Button NmOk = new Button("OK");
            Button NmCancel = new Button("CANCEL");
            ButtonFormat(NmOk,470,440,190,35);
            NmOk.setOnAction(e -> {
                System.out.println("OK selected");
                stage.setScene(scene2);
            });
            ButtonFormat(NmCancel,700,440,190,35);
            NmCancel.setOnAction(e -> {
                System.out.println("Cancel selected");
                stackPaneG.getChildren().remove(p2);

            });
            p2.getChildren().add(iv2);
            p2.getChildren().add(eName);
            p2.getChildren().add(NmOk);
            p2.getChildren().add(NmCancel);

            Pane p3 = new Pane();
            Image image3 = new Image("ChooseLevel.jpg", 1350, 700, false, false);
            ImageView iv3 = new ImageView();
            iv3.setImage(image3);
            p3.getChildren().add(iv3);
            Button l1 = new Button("Level 1");
            Button l2 = new Button("Level 2");
            Button l3 = new Button("Level 3");
            Button l4 = new Button("Level 4");
            Button l5 = new Button("Level 5");
            Button back = new Button("Back");
            ButtonFormat(l1,45,57,250,180);
            ButtonFormat(l2,347,57,250,180);
            ButtonFormat(l3,663,57,250,180);
            ButtonFormat(l4,980,57,250,180);
            ButtonFormat(l5,537,260,250,180);
            ButtonFormat(back,580,594,205,50);
            back.setOnAction(e->{
                stackPane.getChildren().remove(p3);
            });
            p3.getChildren().add(l1);
            p3.getChildren().add(l2);
            p3.getChildren().add(l3);
            p3.getChildren().add(l4);
            p3.getChildren().add(l5);
            p3.getChildren().add(back);

            stackPane.getChildren().addAll(iv1, p);

            Button chLev = new Button("Select Level");
            Button ng = new Button("New Game");
            Button lg = new Button("Load Game");
            Button ex = new Button("Exit");
            ButtonFormat(chLev,715,98,485,85);
            chLev.setOnAction(e -> {
                System.out.println("Choose level selected");
                stackPane.getChildren().add(p3);
            });
            ButtonFormat(ng,720,245,455,80);
            //ng.setOnMouseEntered(e -> ng.setStyle("-fx-background-color: -fx-shadow-highlight-color, -fx-outer-border, -fx-inner-border, -fx-body-color;\""));
            //ng.setOnMouseExited(e -> ng.setStyle("-fx-background-color:transparent;");
            ng.setOnAction(e -> {
                System.out.println("New game selected");
                stackPane.getChildren().add(p2);
            });
            ButtonFormat(lg,720,350,445,70);
            lg.setOnAction(e -> {
                System.out.println("Load game selected");
            });
            ButtonFormat(ex,730,455,400,60);
            ex.setOnAction(e -> {
                System.out.println("Exit selected");
                stage.close();
            });

            Group bgrp = new Group();
            bgrp.getChildren().add(chLev);
            bgrp.getChildren().add(ng);
            bgrp.getChildren().add(lg);
            bgrp.getChildren().add(ex);
            bgrp.setRotate(7);

            p.getChildren().add(bgrp);


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
