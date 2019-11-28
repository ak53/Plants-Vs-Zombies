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
    private double t=0;
    private double zt=0;
    private double p=0;
    private Parent createContent(){
        root.setPrefSize(1350,700);
//        root.getChildren().add(player);

        AnimationTimer timer=new AnimationTimer() {
            @Override
            public void handle(long now) {
                update();
            }
        };
        timer.start();

        Plant p=new PeaShooter(100,600,90,90,"plant");
        Plant p2=new PeaShooter(100,450,90,90,"plant");
        Plant p3=new PeaShooter(100,300,90,90,"plant");
        Plant p4=new PeaShooter(100,150,90,90,"plant");
        Plant p5=new PeaShooter(100,0,90,90,"plant");
        root.getChildren().add(p);
        root.getChildren().add(p2);
        root.getChildren().add(p3);
        root.getChildren().add(p4);
        root.getChildren().add(p5);

//        nextLevel();
        return root;
    }



    private List<Characters> chars(){
        return root.getChildren().stream().map(n-> (Characters)n ).collect(Collectors.toList());
    }
    private void update(){
        t+=0.1;
        zt+=0.1;
        p+=0.1;

        if (zt>10){
            zt=0;
            Zombie z=Zombie.create();
            z.Walk();

        }
        chars().forEach(c->{switch(c.type){

            case "pea":
                if(p>1){
                    p=0;
                    System.out.println("moving");
                    c.moveRight();
                    if (c.getTranslateX()>1350){
                        root.getChildren().remove(c);
                    }
                    chars().stream().filter(e-> e.type.equals("zombie")).forEach(enemy->{
                        if (c.getBoundsInParent().intersects(enemy.getBoundsInParent())){
//                            enemy.dead=true;
//                            c.dead=true;
                            root.getChildren().remove(enemy);
                            root.getChildren().remove(c);
                            System.out.println("tata");

                        }});
                }

                break;

            case "plant":
                if (t>5){
                    t=0;
                    chars().stream().filter(ch-> ch.type.equals("zombie")).forEach(cha->{
                        if (c.getClass()==new PeaShooter(0,0,0,0,"Plant").getClass() && (int)cha.getTranslateY()==(int)c.getTranslateY()){
                            PeaShooter p = (PeaShooter) c;
                            System.out.println("heya");
                            p.shoot();
                        }
                    });
                }

                break;


        }
        });

//        root.getChildren().removeIf(n-> {
//            Characters c=(Characters) n;
//            return c.dead;
//        });
//        if (t>2){
//            t=0;
//        }
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
