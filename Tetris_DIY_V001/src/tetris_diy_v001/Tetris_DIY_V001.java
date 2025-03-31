
package tetris_diy_v001;

import java.awt.GridLayout;
import javax.swing.JFrame;


public class Tetris_DIY_V001 {

   
    public static void main(String[] args) {
        GamePanel tetris= new GamePanel();
        
        JFrame buttonGUI= new JFrame();
        
        buttonGUI.setVisible(true);
        buttonGUI.setSize(150,150);
        buttonGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonGUI.setLayout(new GridLayout(2,2));
        buttonGUI.add(tetris.right_btn);
        buttonGUI.add(tetris.left_btn);
        buttonGUI.add(tetris.down_btn);
        buttonGUI.add(tetris.rotate_btn);
        
    }
    
}
