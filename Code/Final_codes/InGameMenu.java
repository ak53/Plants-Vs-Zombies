package sample;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class InGameMenu {
    static Pane p2G = new Pane();   // IN GAME PAUSE MENU
    static Button save = new Button("");
    static Button restart = new Button("");
    static Button exit = new Button("");
    static Button resume = new Button("");

    public static void Screen(){
        Image image2G = new Image("file:pauseMenu.png", 1100,800,false,false);
        ImageView iv2G = new ImageView();
        iv2G.setX(160);
        iv2G.setImage(image2G);
        iv2G.setPreserveRatio(true);
        p2G.getChildren().add(iv2G);
        p2G.getChildren().add(save);
        p2G.getChildren().add(restart);
        p2G.getChildren().add(exit);
        p2G.getChildren().add(resume);
        SaveGame();
        ExitLevel();
        ResumeLevel();
        RestartLevel();
    }

    public static void SaveGame(){
        save.setLayoutX(558);
        save.setLayoutY(375);
        save.setPrefSize(280,37);
        save.setStyle("-fx-background-color:transparent;");
        save.setOnAction(e->{
            System.out.println("Save selected");
        });
    }
    public static void RestartLevel(){
        restart.setLayoutX(558);
        restart.setLayoutY(430);
        restart.setPrefSize(280,37);
        restart.setStyle("-fx-background-color:transparent;");
        restart.setOnAction(e->{
            System.out.println("Restart selected");
        });
    }

    public static void ExitLevel(){
        exit.setLayoutX(558);
        exit.setLayoutY(490);
        exit.setPrefSize(280,37);
        exit.setStyle("-fx-background-color:transparent;");
        exit.setOnAction(e->{
            System.out.println("Exit to main menu selected");
            Main.stackPaneG.getChildren().remove(InGameMenu.p2G);
            Main.stage.setScene(Main.scene1);
        });
    }

    public static void ResumeLevel(){
        resume.setLayoutX(465);
        resume.setLayoutY(575);
        resume.setPrefSize(447,88);
        resume.setStyle("-fx-background-color:transparent;");
        resume.setOnAction(e->{
            System.out.println("Resume selected");
            Main.stackPaneG.getChildren().remove(InGameMenu.p2G);
        });
    }
}
