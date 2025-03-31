package testtt3;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Testtt3 {

  
    public static void main(String[] args) {
        int nums[]=new int[1000];
        randomNumbers(nums);
        
        BubbleSort bubble= new BubbleSort(nums);
        Thread thread_1= new Thread(bubble);
        thread_1.start();
        
        try {
            thread_1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Testtt3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int i: nums){
            System.out.println(i);
        }
    }
    
    public static void randomNumbers(int nums[]){
        Random random =new Random();
        for(int i=0;i<nums.length;i++){
            nums[i]=random.nextInt();
            //System.out.println(nums[i]);
        }
        
    }
}
