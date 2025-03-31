
package rucursion;


public class Rucursion {

    
    public static void main(String[] args) {
        
        recursion(10);
        method_1(2);
    }
    
    static void recursion(int input)
    {
       
        input= input-1;
         System.out.println(input);
        if(input>0){
            recursion(input);
        }
        
         System.out.println(input);
           
    }
    
    private static void method_1(int i){
        
        method_2(9);
        
    }
    
     private static void method_2(int i){
      
         method_3(4);
        
    }
     
      private static void method_3(int i){
        
        
    }
      
    
}
