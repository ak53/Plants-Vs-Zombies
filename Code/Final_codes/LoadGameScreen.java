package sample;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class LoadGameScreen {
    static Pane p4=new Pane();
    public static void Screen(){
        ///////////////////////////////// LOAD GAME SCREEN /////////////////////////////////////////

        Image image4 = new Image("file:savedFiles.jpg", 1350, 700, false, false);
        ImageView iv4 = new ImageView();
        iv4.setImage(image4);
        p4.getChildren().add(iv4);
        Button backSaved = new Button("");
        Main.ButtonFormat(backSaved,580,594,205,50);
        backSaved.setOnAction(e->{
            System.out.println("Back Selected");
            Main.stackPane.getChildren().remove(p4);
        });
        p4.getChildren().add(backSaved);
        //////////////////////////////////////////////////////////////////////////////////////
    }

}
