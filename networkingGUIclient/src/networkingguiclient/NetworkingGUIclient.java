
package networkingguiclient;


import java.awt.GridLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;



public class NetworkingGUIclient {
    
  
    
    public static void main(String[] args) {
       
        Socket sock;
       String text;
        
          try {
             sock =new Socket("172.17.240.1",7410);
              System.out.println("Connected to server");
             DataInputStream recieved= new DataInputStream(sock.getInputStream());
             DataOutputStream recieve= new DataOutputStream(sock.getOutputStream());
             text=recieved.readUTF();
              System.out.println(text);
             recieve.writeUTF("kabza");
             
             sock.close();
             recieved.close();
         } catch (IOException ex) {
             Logger.getLogger(printCl.class.getName()).log(Level.SEVERE, null, ex);
         }
          
        
    }
 
  
}
