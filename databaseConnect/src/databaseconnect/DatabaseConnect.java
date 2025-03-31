
package databaseconnect;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level; 
import java.util.logging.Logger;

public class DatabaseConnect {

    public static void main(String[] args) {
        
        Statement statement;
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            //sun.jdbc.odbc.JdbcOdbcDriver
            System.out.println("Driver Loaded");
            
            String url="jdbc.odbc:Driver=(Microsoft Access Driver "+"(*.mdb, *.accdb) };DBQ=C:\\Users\\Mabena\\Documents\\Database1.accdb";
            
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Database Connected");
            statement =connection.createStatement();
            
            String queryString ="Select *  from the client";
            
            ResultSet resultSet =statement.executeQuery(queryString);
            if(resultSet.next()){
                System.out.println("Colu 1= "+ resultSet);
                System.out.println("columb with name employee ");
            }
            
            statement.close();
            
        } catch (Exception ex) {
            System.out.println("The Error is" + ex);
        }
    }
    
}
