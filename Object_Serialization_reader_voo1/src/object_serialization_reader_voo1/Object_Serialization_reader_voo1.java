
package object_serialization_reader_voo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Object_Serialization_reader_voo1 {

    
    public static void main(String[] args) {
        cellphone readObj =new cellphone();
        File readFile= new File("object_serialization_saved.ocsv");
        if(readFile.exists()==true)
        {
            try{
                
                FileInputStream inStream= new FileInputStream(readFile);
                ObjectInputStream objStream=new ObjectInputStream(inStream);
               
                
            }catch(Exception e){
                
            }
        }
        
        
        
    }
    
}
