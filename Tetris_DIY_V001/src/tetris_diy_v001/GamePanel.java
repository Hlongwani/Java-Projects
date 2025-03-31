package tetris_diy_v001;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;


 class GamePanel extends JFrame implements ActionListener{

     public static final int WIDTH= 700;
     public static final int HEIGHT= 720;
     int BlockType =0;
     int pos_X=4;
     int pos_Y=0;
     int rotate=0;
     Timer timer =new Timer(1000, this);
     
     JButton left_btn= new JButton(">>");
     JButton right_btn= new JButton("<<");
     JButton down_btn= new JButton("Down");
     JButton rotate_btn= new JButton("Rotate");
     
     char blockPos[][] = {
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
    };

    public GamePanel() {
        setVisible(true);
        setSize(WIDTH, HEIGHT);
        setTitle("Tetris");
        setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        left_btn.setBounds(50, 600, 60, 30);
         right_btn.setBounds(120, 600, 60, 30);
          down_btn.setBounds(190, 600, 80, 30);
           rotate_btn.setBounds(220, 600, 80, 30);
      
           left_btn.addActionListener(this);
        right_btn.addActionListener(this);
        down_btn.addActionListener(this);
        rotate_btn.addActionListener(this);
        
           
       timer.start();
           
    }

    @Override
    public void paint(Graphics graph) {
        
        super.paint(graph);
           for(int row=0;row<10; row ++){
                 for (int col = 0; col < 10; col++) {
                     blockPos[row][col]=' ';
                 }
           }
    
         blockPos[pos_Y][pos_X] = 'b';
        blockPos[pos_Y][pos_X +1] = 'b';
        blockPos[pos_Y+1][pos_X] = 'b';
       blockPos[pos_Y+2 ][pos_X ] = 'b';
        
        graph.setColor(Color.red);
        for(int row=0;row<10; row ++)
        {
        
            for (int col = 0; col < 10; col++) {
              if (blockPos[row][col] == 'b') {  
              graph.fillRect((30 *col) +100, (30*row )+100, 25, 25);
             
              }
        }
            
        }
        graph.drawRect(97, 97, 300, 450);
    
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        
        if(event.getSource()== timer){
            if(pos_Y <9){
                pos_Y++;
            } else {
                pos_Y=0;
                pos_Y=4;
                  
            }
            repaint();
            
        }else if(event.getSource()==left_btn){
          if (pos_X > 0) {
                pos_X--;
            }
            repaint();
        }else if(event.getSource()==right_btn){
         
              if (pos_X < 7) { 
                pos_X++;
            }
            repaint();
            
        }else if(event.getSource()==down_btn){
            
            if (pos_Y < 9) {
                pos_Y++;
            }
            repaint();
        }else if(event.getSource()==rotate_btn){
            
            rotate = (rotate+1) & 4;
            
            repaint();
        }
     
        
    }
     
     
     

}
