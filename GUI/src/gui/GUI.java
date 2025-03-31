package gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class GUI {
       public static void main(String[] args) {
       
          // ImageIcon image=new ImageIcon("logo.png");
            ImageIcon boys=new ImageIcon("boys.png");
           JLabel label =new JLabel();
           Border border= BorderFactory.createLineBorder(Color.blue);
           
           label.setText("SUPERBALIST.COM");
          label.setIcon(boys);
           label.setHorizontalTextPosition(JLabel.CENTER);
           label.setVerticalTextPosition(JLabel.BOTTOM);
           label.setIconTextGap(-30);
           
           label.setForeground(Color.blue); 
           label.setFont(new Font("calibri",Font.BOLD,20));
          label.setBackground(Color.black);
          label.setOpaque(true);
          label.setBorder(border);
         label.setVerticalAlignment(JLabel.CENTER);
         label.setVerticalAlignment(JLabel.CENTER);
        label.setBounds(64, 220, 250, 250);
         
         
         
         
           
           
           JFrame frame= new JFrame();
            frame.setTitle("Superbalist");
            frame.setIconImage(boys.getImage());
         //  frame.setLayout(null);
           frame.setVisible(true);
           frame.setSize(400, 750);
           frame.setBackground(Color.BLACK);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
          
          frame.add(label);
         //frame.pack();
       
    }
    
}
