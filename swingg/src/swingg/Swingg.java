
package swingg;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;


public class Swingg extends JFrame implements ActionListener{
     JFrame boy2 =new JFrame();
     JButton move = new JButton("MOVE");
      JButton second = new JButton("Second");
     JButton escBtn = new JButton("ESC");
     Timer timer= new Timer(15,this);
     
     int x_coor=100;
     int y_coor=200;
     int x_speed=1;
      int y_speed=1;
     //int left_speed=1;

    public Swingg() {
        
        
       this.setVisible(true);
       this.setSize(400,300);
       this.setTitle("Jaybee");
       this.setLocation(10, 200);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLayout(new FlowLayout());
       this.add(move);
       this.add(second);
       
       
      move.addActionListener(this);
      second.addActionListener(this);
        timer.start();
      boy2.setVisible(true);
       boy2.setSize(400,300);
       boy2.setLocation(600, 200);
        boy2.setTitle("kaybee");
        boy2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        boy2.setLayout(new FlowLayout());
        this.boy2.add(escBtn);
        //escBtn.addActionListener(this);
    }
    

    public static void main(String[] args) {
        
      Swingg swing =new Swingg();
    
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        
        if(event.getSource()==move){
            // System.out.println("move button was pressed");
            
             
            
        }
        if(event.getSource()==second){
            System.out.println("Second button was pressed");
        }
        
        if(event.getSource()==timer){
         
            x_coor= x_coor+x_speed;
           
            if(x_coor>this.getWidth()-20)x_speed = -4; 
             if(x_coor<20)x_speed = 4; 
             
              y_coor= y_coor+y_speed;
            if(y_coor>this.getHeight()-20)y_speed = -2;
            
           if(y_coor<20)y_speed = 4; 
            repaint(); 
        }
        
       
    }
    
     @Override
    public void paint(Graphics graph){
        super.paint(graph);
        graph.drawOval(100, 100, 49, 29);
        graph.fillOval(x_coor, y_coor, 40, 30);
    }
    
}
