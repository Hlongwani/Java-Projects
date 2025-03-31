
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class JavaFXApplication1 extends Application {
    
  
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
      @Override
    public void start(Stage primaryStage) {
        Button esc = new Button("Esc");
       
      
            
           
        
        
        StackPane root = new StackPane();
        root.getChildren().add(esc);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
