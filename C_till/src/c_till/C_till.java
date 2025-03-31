
package c_till;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class C_till extends Application {

    int noOfChillyBurger=0;
    int noofCheeseBurger=0;
    int noOfPizza=0;
    int noOfChips=0;
    int orderNum=0;
    TextField text =new TextField();
     
    @Override
    public void start(Stage primaryStage) {
        Button cheeseBtn = new Button();
        Button chillyBtn = new Button();
        Button chipsBtn = new Button();
        Button pizzaBtn = new Button();
        Button payedBtn = new Button();
        
        cheeseBtn.setText("Cheese Burger");
        
        chillyBtn.setText("Chilly Burger");
        chipsBtn.setText("Chips");
        pizzaBtn.setText("Pizza");
        payedBtn.setText("Payed");
        
        cheeseBtn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
               noofCheeseBurger++;
               updatePrice();
            }
        });
        
        chillyBtn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                noOfChillyBurger++;
                updatePrice();
               
            }
            
        });
         
        chipsBtn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
               noOfPizza++;
               updatePrice();
            }
        });
        
        pizzaBtn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                noOfChips++;
                updatePrice();
            }
        });
        
         payedBtn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                    
                        Socket socket;
                        DataOutputStream dataOut;
                        DataInputStream dataIn;
                        String recieved;
                     try {

                            socket =new Socket("localhost",9090);
                             System.out.println("Connected to server");
                            dataOut= new DataOutputStream(socket.getOutputStream());
                            dataIn =new DataInputStream(socket.getInputStream());
                            

                            
                            
                            dataOut.writeUTF("OrderNum "+ orderNum + 
                                    "  CheeseBurgers " + noofCheeseBurger + 
                                    "  ChillyBurger " + noOfChillyBurger +
                                    "  Pizza "+ noOfPizza+
                                    "  Chips " +noOfChips);
                            
                            dataOut.close();
                            socket.close();
                            
                            
                             orderNum++;
                             noOfChillyBurger=0;
                             noofCheeseBurger=0;
                             noOfPizza=0;
                             noOfChips=0;
                            //orderNum=0;
                            if(orderNum >=9){
                                orderNum=0;
                            }
                        } catch (Exception ex) {

                        }
                        }
        });
        
       
        
        GridPane root = new GridPane();
        root.add(cheeseBtn, 0, 0);
        root.add(chillyBtn, 1, 0);
        root.add(chipsBtn, 0, 2);
        root.add(pizzaBtn, 1, 2);
        root.add(payedBtn, 0, 3);
        root.add(text, 1, 3);
       
       
                
        
        Scene scene = new Scene(root, 400, 400);
        
        primaryStage.setTitle("TILL");
        primaryStage.setScene(scene);
        primaryStage.show();
        }
    
        void updatePrice(){
            
            double priceD= (noOfChillyBurger*70) +(noofCheeseBurger*65)+ (noOfPizza*70) + (noOfChips*20);
            String Sprice=Double.toString(priceD);
            text.setText("OrderNum "+ orderNum +"   Price: "+Sprice );
        }
    
  
    public static void main(String[] args) {
         launch(args);
    }
    
}
