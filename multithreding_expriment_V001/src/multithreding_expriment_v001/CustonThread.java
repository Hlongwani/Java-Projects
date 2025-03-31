package multithreding_expriment_v001;

import static java.lang.Math.random;
import java.util.Random;


class CustonThread implements Runnable {

int threadNum;   
int result;
    public CustonThread(int ID_number) {
         threadNum=ID_number;
         
         
    }
  
    @Override
    public void run() {
        int array[]= new int[1000];
        randomizeArray(array);
        printArr(array,threadNum);
   
      
       result= sum(array);
        
    }

    private void randomizeArray(int input[]) {
        Random random = new Random();

      for(int i=0;i<input.length;i++){
          
          input[i] =random.nextInt();
            
      }
    }

    private void printArr(int input [], int threadNum) {
          Random random = new Random();
     
           for(int i=0;i<input.length;i++){
          
        System.out.println(threadNum +" [ " + input[i] +" ] ");
            
      }
        
    }

    private int sum(int input[]) {
        int output;
        output=0;
        
          for(int i=0;i<input.length;i++){
          
            output= output+input[i];
            
      }
        
          output=output;
       return output;

    }

    public int getResult() {
        return result;
    }
    
    
}
