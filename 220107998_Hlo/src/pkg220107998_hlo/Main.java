package pkg220107998_hlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Main implements ActionListener {

    
    public static void main(String[] args) {
        String userText;
       userText=JOptionPane.showInputDialog("Enter the number of Threads you will like to execute");
       int threadNum=Integer.parseInt(userText);
       
       for(int i=1;i<=threadNum;i++){
           InterestCalculator interestCalculator= new InterestCalculator();
           Thread mainThread=new Thread(interestCalculator);
           mainThread.start();
           
           
       }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
}
