package networkingguiclient;

import java.awt.GridLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTextField;



class printCl extends JFrame implements Runnable{

     Socket sock;
       String text;
       
    @Override
    public void run() {
         try {
             sock =new Socket("172.17.240.1",7410);
             DataInputStream recieved= new DataInputStream(sock.getInputStream());
             DataOutputStream recieve= new DataOutputStream(sock.getOutputStream());
             recieve.writeUTF("kabza");
             text=recieved.readUTF();
             sock.close();
             recieved.close();
         } catch (IOException ex) {
             Logger.getLogger(printCl.class.getName()).log(Level.SEVERE, null, ex);
         }
     
    }

      public printCl(String text) {
        
        setTitle("Networking GUI Client");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 1)); // GridLayout with one cell
        JTextField txt = new JTextField(text);
        txt.setEditable(false); // Make the text field non-editable
        add(txt);
        setLocationRelativeTo(null);
        setVisible(true);
    }
   
}
