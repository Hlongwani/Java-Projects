package pkg220107998_hlo;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


class InterestCalculator extends JFrame implements Runnable, ActionListener {
 
    JButton btn1;
    JButton btn2;
    JTextField txt;
    JTextField txt2;
    private static int location1=0;
    private static final int location2=30;
    
    @Override
    public void run() {
       frame();
    }
    
    public void frame(){
        this.setVisible(true);
        this.setSize(450, 450);
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout());
        btn1= new JButton("the value/price ");
        btn2= new JButton("Get price after 5 years");
        
        txt= new JTextField();
        txt2= new JTextField();
        this.add(txt);
        this.add(btn1);
        this.add(btn2);
        this.add(txt2);
        btn1.setBounds(10,15,10,20);
        btn2.setBounds(30,45,20,40);
        txt.setBounds(30,45,20,40);
        txt.setSize(20, 20);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        this.setLocation(location2 * location1 ,location2 *location1);
        location1++;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        double initialPrice=1000.00;
        double interestRate=0.11;
        double newPrice;
        
        String toPrt;
      if(event.getSource()==btn1){
        double price=getInterest(initialPrice,interestRate);
        newPrice=getNextPrice(price,interestRate);
        toPrt=Double.toString(newPrice);
       txt.setText(toPrt);
      }
      if(event.getSource()==btn2){
          
        double price=getInterest(initialPrice,interestRate);
        newPrice=getNextPrice(price,interestRate);
        toPrt=Double.toString(newPrice);
       txt2.setText(toPrt);
      }
      
      
    }
    
    public double getInterest(double price,double interestRate){
        double interest;
        
        interest=price*interestRate;
        
        return interest;
    }
     public double getNextPrice(double previousPrice,double interestRate){
        double nextPrice;
        double interest=previousPrice*interestRate;
        nextPrice =previousPrice + interest;
         
         return nextPrice;
     }
     
     public double getFinalPrice(double originalPrice,double interestRate,int numberOfMonths){
         double finalPrice=0;
         
         
         return finalPrice;
     }
    
}
