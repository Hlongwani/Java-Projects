
package javaserver;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JavaServer {

   
    public static void main(String[] args) {
        ServerSocket serversock;
        Socket socket;
       
        try {
            
            serversock= new ServerSocket(100);
            socket= serversock.accept();
            DataOutputStream teller= new DataOutputStream(socket.getOutputStream());
            teller.writeUTF("Hi This is Nkavelo");
            teller.close();
            serversock.close();
            socket.close();
            
        } catch (IOException ex) {
            Logger.getLogger(JavaServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
