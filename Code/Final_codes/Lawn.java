import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.List;
import java.util.stream.Collectors;

public class Lawn extends Application {
    Characters[] Grid;
    boolean[] LawnMowersAlive;
    //int[] Zombies isme ya level mein
    //int NumSuns isme ya level mein
    protected static Pane root=new Pane();
    private double t=0.1;
    private double zt=0;
    private Parent createContent(){
        root.setPrefSize(600,800);
//        root.getChildren().add(player);

        AnimationTimer timer=new AnimationTimer() {
            @Override
            public void handle(long now) {
                update();
            }
        };
        timer.start();
//        nextLevel();
        return root;
    }

    private List<Characters> chars(){
        return root.getChildren().stream().map(n-> (Characters)n ).collect(Collectors.toList());
    }
    private void update(){
        t+=0.016;
        zt+=0.1;

        chars().forEach(c->{switch(c.type){
            case "pea":
                c.moveRight();
                chars().stream().filter(e-> e.type.equals("zombie")).forEach(enemy->{
                    if (c.getBoundsInParent().intersects(enemy.getBoundsInParent())){
                        enemy.dead=true;
                        c.dead=true;
                    }
                });
                break;

            case "":
                if (t>3){
                    chars().stream().filter(ch-> ch.type.equals("plant")).forEach(cha->{
                        if (cha.type.equals("zombie")==true && cha.getTranslateY()== cha.getTranslateY()){
                            Plant.shoot(ch);
                        }
                    });
                }

                break;


        }
        });

        root.getChildren().removeIf(n-> {
            Charac c=(Charac) n;
            return c.dead;
        });
        if (t>2){
            t=0;
        }
    }

    @Override
    public void start(Stage s) throws Exception {

        Scene sc=new Scene(createContent());
        s.setScene(sc);
        s.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
