package javathreads;


public class JavaThreads {

   
    public static void main(String[] args) {
        MyThread thread1= new MyThread();
        
        Thread thread=new Thread(thread1);
        thread.start();
        
    }
    
}
