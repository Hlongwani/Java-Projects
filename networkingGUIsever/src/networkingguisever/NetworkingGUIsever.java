package networkingguisever;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NetworkingGUIsever {

    
    public static void main(String[] args) {
        ServerSocket serverSock;
        Socket sock;
        String fromClient;
        try {
            serverSock =new ServerSocket(7410);
            sock=serverSock.accept();
            
            DataOutputStream message=new DataOutputStream(sock.getOutputStream());
            DataInputStream mess=new DataInputStream(sock.getInputStream());
            message.writeUTF("Hi client this is Nkavelo");
            
            fromClient=mess.readUTF();
            message.close();
            serverSock.close();
            sock.close();
        } catch (IOException ex) {
            Logger.getLogger(NetworkingGUIsever.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
