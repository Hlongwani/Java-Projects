package multithreding_expriment_v001;

public class Multithreding_expriment_V001 {

 
    public static void main(String[] args) {
        
        CustonThread myThread_0= new CustonThread(0);
        CustonThread myThread_1= new CustonThread(1);
          CustonThread myThread_2= new CustonThread(2);
            CustonThread myThread_3= new CustonThread(3);
             
            int retVal;
              
        Thread controller_1 = new Thread(myThread_1);
        controller_1.start();
        Thread controller_2 = new Thread(myThread_2);
        controller_2.start();
        Thread controller_3 = new Thread(myThread_3);
        controller_3.start();
       
       myThread_0.run();
       
       retVal=myThread_0.getResult();
        System.out.println("Thread 0 retVa "+ retVal );
        retVal=myThread_1.getResult();
        System.out.println("Thread 1 retVal "+ retVal );
        retVal=myThread_2.getResult();
        System.out.println("Thread 2 retVa l"+ retVal );
        retVal=myThread_3.getResult();
        System.out.println("Thread 3 retVa l"+ retVal );
        
        
      
        
       
    }
    
}
