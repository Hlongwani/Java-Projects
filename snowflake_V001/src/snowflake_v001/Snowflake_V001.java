
package snowflake_v001;

import java.awt.Graphics;
import javax.swing.JFrame;


public class Snowflake_V001  extends JFrame {

    public Snowflake_V001() {
        
        setVisible(true);
        setSize(1200,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Snow flake");
    
    }
   
    public static void main(String[] args) {
        
        Snowflake_V001 myThis= new Snowflake_V001();
     
    }

    private static void branch(Graphics graph,int length, int x_coor, int y_coor) {
        int y_coor_2, y_coor_3, x_coor_2,x_coor_3,y_coor_4,y_coor_5,x_coor_4,x_coor_5;
         y_coor_2=y_coor+length;
         y_coor_3 = y_coor-length;
          x_coor_2=x_coor+length;
         x_coor_3 = x_coor-length;
                int length_1;
            float length_lf;
            length_1=length /2;
            length_lf= length * 0.7071f;
            
             y_coor_4= (int) (y_coor+length_lf);
         y_coor_5= (int) (y_coor-length_lf);
          x_coor_4=(int) (x_coor+length_lf);
         x_coor_5 =(int) (x_coor-length_lf);
        
        graph.drawLine(x_coor, y_coor, x_coor, y_coor_2);
        graph.drawLine(x_coor, y_coor_2, x_coor, y_coor_3);
          graph.drawLine(x_coor, y_coor, x_coor_2, y_coor);
            graph.drawLine(x_coor, y_coor, x_coor_3, y_coor);
            
          graph.drawLine(x_coor, y_coor, x_coor_4, y_coor_4);
              graph.drawLine(x_coor, y_coor, x_coor_5, y_coor_4);
               graph.drawLine(x_coor, y_coor, x_coor_4, y_coor_5);
                graph.drawLine(x_coor, y_coor, x_coor_5, y_coor_5);
            
    
            if(length_1>1){
  
                
                     branch(graph,length_1, x_coor, y_coor_2);
                          branch(graph,length_1, x_coor, y_coor_3);
                               branch(graph,length_1, x_coor_2, y_coor);
                                    branch(graph,length_1, x_coor_3, y_coor);
                                    
                                     branch(graph,length_1, x_coor_4, y_coor_4);
                          branch(graph,length_1, x_coor_5, y_coor_4);
                               branch(graph,length_1, x_coor_4, y_coor_5);
                                    branch(graph,length_1, x_coor_5, y_coor_5);
                           
                                  
            }
            
        
        
    }

    @Override
    public void paint(Graphics graph) {
        
        super.paint(graph); 
        branch(graph,150,600,350);
    
      
    }

}
