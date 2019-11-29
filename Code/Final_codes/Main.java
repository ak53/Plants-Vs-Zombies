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

    public static Stage stage;

    public User Player;
    static StackPane stackPane = new StackPane();   // 1ST STACK PANE WITH THE MAIN MENU
    static Scene scene1 = new Scene(stackPane, 1350, 700);

    static StackPane stackPaneG = new StackPane();   // 2ND STACK PANE WITH THE GAME PLAY SCREEN
    static Scene scene2 = new Scene(stackPaneG,1350,700);


    public static void ButtonFormat(Button b, double posx, double posy, double sx, double sy){
        b.setLayoutX(posx);
        b.setLayoutY(posy);
        b.setPrefSize(sx,sy);
        b.setStyle("-fx-background-color:transparent;");
    }

    // launch the application
    public void start(Stage S) {
        try {
            stage = S;
            
            new Lawn().LawnLayout();
            InGameMenu.Screen();
            MainMenu.DisplayMenu();

            ////////////////// 1ST PANE WHICH TAKES USER NAME ////////////////////////////////////////////
            Pane firstPane = new Pane();
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
                if(!eName.getText().equals("")) {
                    Player = User.getInstance(eName.getText()); //Makes a new user if not found, else
                    stackPane.getChildren().remove(firstPane);
                    /*Label nameplate = new Label("Hi " + Player.getName());
                    nameplate.setLayoutX(80);
                    nameplate.setLayoutY(210);
                    nameplate.setPrefWidth(420);
                    p.getChildren().add(nameplate);*/
                }
            });
            ButtonFormat(NmCancel,700,440,190,35);
            NmCancel.setOnAction(e -> {
                System.out.println("Cancel selected");
                eName.setText("");
            });
            firstPane.getChildren().add(iv2);
            firstPane.getChildren().add(eName);
            firstPane.getChildren().add(NmOk);
            firstPane.getChildren().add(NmCancel);
            ///////////////////////////////////////////////////////////////////////////////////////////

            stackPane.getChildren().addAll(MainMenu.iv1,MainMenu.p, firstPane);

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
