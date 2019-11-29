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

            /*TranslateTransition bullettrans = new TranslateTransition();
            bullettrans.setDuration(Duration.seconds(7));
            bullettrans.setNode(ivpb);
            bullettrans.setFromX(415);
            bullettrans.setFromY(100);
            bullettrans.setToX(1400);*/

            /*Image plimg = new Image("file:Pea.gif",90,100,false,false);
            ImageView ivpl = new ImageView();
            ivpl.setImage(plimg);
            ivpl.setPreserveRatio(true);
            ivpl.relocate(400,80);
            Lawn.root.getChildren().add(ivpl);*/

            /*Image zomimg = new Image("file:Zombie.gif",90,170,false,false);
            ImageView ivzom = new ImageView();
            ivzom.setImage(zomimg);
            ivzom.setPreserveRatio(true);
            //ivzom.relocate(1155,60);
            Lawn.root.getChildren().add(ivzom);
            TranslateTransition translateTransition = new TranslateTransition();
            translateTransition.setDuration(Duration.seconds(35));
            translateTransition.setNode(ivzom);
            translateTransition.setFromX(1270);
            translateTransition.setFromY(20);
            translateTransition.setByX(-910);*/

            /*Image zom2 = new Image("file:Zombie.gif",90,170,false,false);
            ImageView ivzom2 = new ImageView();
            ivzom2.setImage(zom2);
            ivzom2.setPreserveRatio(true);
            //ivzom.relocate(1155,60);
            Lawn.root.getChildren().add(ivzom2);
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
            });*/


            /*TranslateTransition moverTrans = new TranslateTransition();
            moverTrans.setDuration(Duration.seconds(7));
            moverTrans.setNode(lm);
            moverTrans.setFromX(310);
            moverTrans.setFromY(230);
            moverTrans.setToX(1400);*/

            //SequentialTransition s = new SequentialTransition(tT);

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
