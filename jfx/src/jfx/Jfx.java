
package jfx;

import javafx.application.Application;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;


public class Jfx extends Application {

    int moon_pos_X=200;
   
    public static void main(String[] args) {
     launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
       Group layout= new Group();
       Sphere earth = new Sphere(50);
       earth.setTranslateX(100);
       earth.setTranslateY(100);
      Sphere moon = new Sphere(15);
      moon.setTranslateX(moon_pos_X);
       moon.setTranslateY(100);
       Button escBtn = new Button("Esc Btn");
       TextField sourceTxt = new TextField("Source");
       Button transpose = new Button("transpose");
       transpose.setTranslateX(80);
       
       TextArea destinationTxt = new TextArea("Destination");
       escBtn.setOnAction(new EventHandler() {
           @Override
           public void handle(Event event) {
               
            System.out.println("Existed");
            System.exit(0);
           }
       });
       
       transpose.setOnAction(new EventHandler() {
           @Override
           public void handle(Event event) {
           
            moon_pos_X++;
               
           moon.setTranslateX(moon_pos_X +20);
             
           }
       });
       
        
       layout.getChildren().add(escBtn);
       layout.getChildren().add(earth);
       layout.getChildren().add(moon);
       layout.getChildren().add(transpose);
     
       
       Scene scene = new Scene(layout,600,500);
       scene.setFill(Color.BLUE);
      stage.setScene(scene);
      stage.setTitle("kabzela");
      stage.show();
        
        
    }
    
}
