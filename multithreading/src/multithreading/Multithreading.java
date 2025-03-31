package multithreading;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Multithreading {

    
    public static void main(String[] args) {
        int nums[]=new int [1000];
        int target =120;
        int start=0;
        int end=nums.length-1;
         randomNumbers(nums);
       BubbleSort bubble=new BubbleSort(nums); 
       
       Thread thread= new Thread(bubble);
       thread.start();
       
       
        try {
            thread.join();
            
            
            System.out.println();
        } catch (InterruptedException ex) {
            Logger.getLogger(Multithreading.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
        
        for(int i :nums){
            System.out.println(i);
        }
        
        
         linearSearch search=new linearSearch(nums,target);
         Thread thread_2= new Thread(search);
       
        
        biSearch binarySearch= new biSearch(nums,target,start,end);
        Thread thread_3 =new Thread(binarySearch);
        thread_3.start();
         thread_2.start();
        
       
    }
    
    
    
    public static void randomNumbers(int nums[]){
        Random random=new Random();
        int min=0;
        int max=1000;
        for(int i=0;i<nums.length;i++){
        
           nums[i]=(int)(Math.random()*(max-min+1)+min);
  
        }
        
    }
}
