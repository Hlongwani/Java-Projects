package javaclient;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JavaClient {

    
    public static void main(String[] args) {
       
       Socket socket;
       String fromServer;
        try {
            socket=new Socket("localhost",100);
            System.out.println("Server connected");
            
            DataInputStream dataIn =new DataInputStream(socket.getInputStream());
            fromServer= dataIn.readUTF();
            
            dataIn.close();
            socket.close();
            
            System.out.println(fromServer);
        } catch (IOException ex) {
            Logger.getLogger(JavaClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
