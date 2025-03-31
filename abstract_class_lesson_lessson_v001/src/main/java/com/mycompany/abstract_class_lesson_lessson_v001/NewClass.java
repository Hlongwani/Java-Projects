
package com.mycompany.abstract_class_lesson_lessson_v001;


public abstract class NewClass {
    
    public  int method_Normal(String input)
    {
        int output;
        
        try{
            
            output=Integer.parseInt(input);
        }catch(Exception error)
        {
            System.out.println("");
            output=-1;
        }
        return output;
    }
}
