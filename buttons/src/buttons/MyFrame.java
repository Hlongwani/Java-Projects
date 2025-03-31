
package buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class MyFrame extends JFrame implements ActionListener{
    
    JButton button1;
   
    MyFrame(){
        
         button1=new JButton();
         button1.addActionListener(this);
        button1.setBounds(200, 100, 100, 50);
        button1.setText("Do not press me");
        button1.setFocusable(false);
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(550,550);
        this.setVisible(true);
        this.add(button1);
    }   

    @Override
    public void actionPerformed(ActionEvent event) {
        
        if(event.getSource()==button1)
            System.out.println("poo");
         
    }
}
