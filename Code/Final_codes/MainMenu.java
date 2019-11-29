package sample;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.util.TimerTask;

public class MainMenu {
    static Pane p = new Pane(); //pane with 3 buttons (Main Menu)
    static ImageView iv1 = new ImageView();
    static Button chLev = new Button("");
    static Button ng = new Button("");
    static Button lg = new Button("");
    static Button ex = new Button("");
    static Group bgrp = new Group();

    public static void DisplayMenu(){
        Image image1 = new Image("file:MainMenu.jpg", 1350, 800, false, false);
        iv1.setImage(image1);
        iv1.setPreserveRatio(true);
        bgrp.getChildren().add(chLev);
        bgrp.getChildren().add(ng);
        bgrp.getChildren().add(lg);
        bgrp.getChildren().add(ex);
        bgrp.setRotate(7);
        p.getChildren().add(bgrp);
        ChooseLevel();
        StartGame();
        LoadGame();
        Exit();
    }

    public static void ChooseLevel(){
        ChooseLevelScreen.screen();
        Main.ButtonFormat(chLev,715,98,485,85);
        chLev.setOnAction(e -> {
            System.out.println("Choose level selected");
            Main.stackPane.getChildren().add(ChooseLevelScreen.p3);
        });
    }

    public static void StartGame(){
        Main.ButtonFormat(MainMenu.ng,720,245,455,80);
        MainMenu.ng.setOnAction(e -> {
            Lawn l = new Lawn();
            System.out.println("New game selected");
            Main.stage.setScene(Main.scene2);
            FallingSun.transition.play();
        });
    }

    public static void LoadGame(){
        LoadGameScreen.Screen();
        Main.ButtonFormat(lg,720,350,445,70);
        lg.setOnAction(e -> {
            System.out.println("Load game selected");
            Main.stackPane.getChildren().add(LoadGameScreen.p4);
        });
    }

    public static void Exit(){
        Main.ButtonFormat(MainMenu.ex,730,455,400,60);
        MainMenu.ex.setOnAction(e -> {
            System.out.println("Exit selected");
            Main.stage.close();
        });

    }
}
