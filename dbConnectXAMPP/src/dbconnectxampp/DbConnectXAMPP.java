package dbconnectxampp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DbConnectXAMPP {

  
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql";
        String username ="root";
     //  String password="";
        String driver ="com.mysql.jdbc.Driver";
         String path ="jdbc:mysql:localhost:3306/myfirstjavadb";
        try {
            
            Class.forName(driver);
           
            System.out.println("Okay");
           
           
            System.out.println("Dart");
        } catch (Exception ex) {
            System.out.println("Okyyyyu");
        }
       Connection mycon = DriverManager.getConnection(path,username,"");
        
      // Statement myst = mycon.createStatement();
    }
    
}
