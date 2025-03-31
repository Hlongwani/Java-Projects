package file_lesson_v001;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;




public class File_lesson_v001 {

   
    public static void main(String[] args) {
        
        File myFile =new File("kb.txt");
        String user_in="Nkavelo Jubiliat Hlongwani \n This is the new line";
          char myUserIn;
           int user_in2;
       
        
        if(myFile.exists())
        {
            System.out.println("File exists");
            try {
                InputStream inStream= new FileInputStream(myFile);
              
               int maxNum= inStream.available();
               for(int i=0;i<maxNum;i++) {
               user_in2= inStream.read();
               myUserIn=(char) user_in2;
              System.out.println(myUserIn +"\t");
               }
               
                inStream.close();
            } catch (Exception ex) {
                Logger.getLogger(File_lesson_v001.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        else{
            System.out.println("File does not exists");
            
            try {
                myFile.createNewFile();
                 FileOutputStream outStream= new FileOutputStream(myFile);
                 
                 for(int i=0;i<user_in.length();i++){
                   
                   myUserIn=user_in.charAt(i);
                    outStream.write(myUserIn);  
                 }
                
                 outStream.close();
            } catch (IOException ex) {
                Logger.getLogger(File_lesson_v001.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
