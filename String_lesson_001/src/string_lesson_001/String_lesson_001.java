
package string_lesson_001;


public class String_lesson_001 {

   
    public static void main(String[] args) {
   
        String userIn ="The man said(I am so drunk) when he.";
        char ourChar;
        int ourInt,currentIndex;
       
       
        ourInt=userIn.length();
        for(int i=0;i<ourInt;i++)
        {
            
            ourChar= userIn.charAt(i);
            
            System.out.println(ourChar);
           // System.out.println("\t");
        }
      
        
    }
    
}
