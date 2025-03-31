
package javatest1;

import java.util.Scanner;


public class NewClass {
 
  public void getValues(int rows,int cols)
    {
        rows=4;
        cols=4;
        
        Scanner sdMarks= new Scanner(System.in);
        
        int[][] marks = new int [rows][cols];
        
        
      for(int i=0;i<rows;i++)
        {
             System.out.println("Enter the marks for student : "+ (i+1) + ":");
             
            for(int j=0;j<cols;j++)
            
            {
                System.out.print("Test : "+ (j+1) + ":");
                marks[i][j]=sdMarks.nextInt();
              
            }
        }  
    }
    
     public double calAvg(int rows,int cols)
     {
         
          rows=4;
          cols=4;
        double avg=0;
        int sum;
         
         int [][] marks= new int [rows][cols];
         
         for(int i=0;i<rows;i++)
         {
             sum=0;
             for(int j=0;j<cols;j++)
             {
                 sum+=marks[i][j];
             }
              avg=(double)sum/0;
         System.out.println("The Avarage grade is :"+ avg);
             
         }
         
         return avg;
     }
        
}
