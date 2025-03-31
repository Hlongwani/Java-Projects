package serverr;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;



public class Serverr {

    
    
    public static void main(String[] args) {
        
        ServerSocket serverSock;
        Socket socket;
        DataInputStream dataIn;
        DataOutputStream dataOut;
        
        String orderInfo;
        try {
            Till tiil;
            serverSock = new ServerSocket(9090);
            
            socket= serverSock.accept();
            
            dataIn =new DataInputStream(socket.getInputStream());
            orderInfo=dataIn.readUTF();
            System.out.println(orderInfo);
            socket.close();
            serverSock.close();
            dataIn.close();
            
        } catch (Exception ex) {
            
        }
                
    }

    private static class Till {

        public Till() {
            
            
        }
    }
    
}
