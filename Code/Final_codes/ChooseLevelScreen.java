package sample;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class ChooseLevelScreen {
    static Pane p3 = new Pane();

    public static void screen(){
        ///////////////////////// CHOOSE LEVEL SCREEN /////////////////////////////////////////////////

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
        Main.ButtonFormat(l1,45,57,250,180);
        Main.ButtonFormat(l2,347,57,250,180);
        Main.ButtonFormat(l3,663,57,250,180);
        Main.ButtonFormat(l4,980,57,250,180);
        Main.ButtonFormat(l5,537,260,250,180);
        Main.ButtonFormat(back,580,594,205,50);
        back.setOnAction(e->{
            System.out.println("Back Selected");
            Main.stackPane.getChildren().remove(p3);
        });
        p3.getChildren().add(l1);
        p3.getChildren().add(l2);
        p3.getChildren().add(l3);
        p3.getChildren().add(l4);
        p3.getChildren().add(l5);
        p3.getChildren().add(back);

        ////////////////////////////////////////////////////////////////////////////////////
    }
}
