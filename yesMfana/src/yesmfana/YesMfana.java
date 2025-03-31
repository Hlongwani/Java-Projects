package yesmfana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



public class YesMfana {

    
    public static void main(String[] args) {
       
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
            String path="jdbc:mysql://localhost:3306/kabzela";
            
            Connection connect= DriverManager.getConnection(path,"root", "");
            System.out.println("Driver connected");
            Statement statement=connect.createStatement();
            ResultSet resultSet;
            resultSet=statement.executeQuery("SELECT * FROM tableJB");
            
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1)+ " " + resultSet.getString("name")+" "+ resultSet.getString("Skill")+" "+ resultSet.getInt(4));
            }
            
            
            connect.close();
            statement.close();
            resultSet.close();
        } catch (Exception ex) {
            System.out.println("The was an error");
        }
      
            
        
    }
    
}
