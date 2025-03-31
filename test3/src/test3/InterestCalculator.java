package test3;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


class InterestCalculator extends JFrame implements Runnable{

    private static  int windowCount = 0;
    private static final int OFFSET = 30;
     
    
 
    int threadNum=0;
    
    @Override
    public void run() {
        
     frames();
       
      
        
        
    }
    
    public void frames(){
        this.setTitle("thread");
        this.setSize(400, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton btn1= new JButton("new price");
        JTextField txt=new JTextField();
        JButton btn2= new JButton("Get price after 5 years");
        this.add(btn1);
        this.add(txt);
        this.add(btn2);
        btn1.setBounds(10, 10, 20, 30);
         btn2.setBounds(10, 10, 20, 30);
        this.setLayout(new GridLayout());
        
        this.setLocation(OFFSET * windowCount, OFFSET * windowCount);
        windowCount++;
        
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                
             double interestRate=0.0011;
               double initialPrice=1000; 
                
             double price,nextPrice;
             price=getInterest(initialPrice,interestRate);
             nextPrice =getNextPrice(price,interestRate);
             String dat=Double.toString(nextPrice);
              
              txt.setText(dat);
              
              txt.setBounds(10, 10, 15, 20);
            }
        });
     
     
        
        
    }
        
     public double getInterest(double price,double interestRate){
         
        double totalInterest;
       interestRate=0.0011;
       totalInterest=interestRate*price;
        
        return totalInterest;
    }
     
    public double getNextPrice(double previousPrice,double interestRate){
     double nextPrice;
     nextPrice=previousPrice +interestRate;
     
        
     return nextPrice;   
    }
    
    
}
