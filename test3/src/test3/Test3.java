package test3;

import javax.swing.JOptionPane;


public class Test3 {
  
    //int threadNum;
    
    public static void main(String[] args) {
        String  UserInput= JOptionPane.showInputDialog("How many Threads would you want");
        int threadNum= Integer.parseInt(UserInput);
      
        
        
      for(int i=1;i<=threadNum;i++){
          InterestCalculator interestCalculator= new InterestCalculator();
          
          Thread thread=new Thread(interestCalculator);
          thread.start();
      }
        
        
    }
    
}
