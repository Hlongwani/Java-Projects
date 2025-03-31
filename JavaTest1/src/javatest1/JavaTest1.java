
package javatest1;

public class JavaTest1 {


    static void getValues()
    {
        
        System.out.println("yes");
    }
    
     
    public static void main(String[] args) {
        
        
        String originalStr = "Hello";
String reversedStr = "";

for (int i = 0; i < originalStr.length(); i++) {
  reversedStr = originalStr.charAt(i) + reversedStr;
}

System.out.println("Reversed string: "+ reversedStr);

         int rows=4;
 int cols=4;
 
 try{
     double average=rows/0;
 }
 catch(Exception e)
 {
     System.out.println("You can not devide by zero");
 }
       
      
      NewClass myObj= new NewClass();
      getAvg avg= new getAvg();  
      myObj.getValues(rows, cols);
      avg.calAvg(rows, cols);
      
    }
    
}
