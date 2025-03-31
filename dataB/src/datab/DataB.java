package datab;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DataB {


    public static void main(String[] args) {
        
        try {
            
           Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
           String path= "jdbc:mysql://localhost:3306/kabzela";
           Connection connect = DriverManager.getConnection(path,"root","");
            System.out.println("Database Connected");
           Statement statement =connect.createStatement();
           ResultSet resultSet;
           resultSet= statement.executeQuery("SELECT * FROM tableJB");
           
           while(resultSet.next()){
               System.out.println(resultSet.getInt(1)+" " + resultSet.getString("Skill"));
           }
           
           statement.executeUpdate("INSERT INTO tableJB (ID, name,Skill,year) VALUES ('2002','Hlongwani','GOAT','2025')");
            System.out.println("Second");
           
             resultSet= statement.executeQuery("SELECT * FROM tableJB");
             while(resultSet.next()){
               System.out.println(resultSet.getInt(1)+" " + resultSet.getString("Skill"));
           }
            
           resultSet.close();
           statement.close();
           connect.close();
        } catch (Exception ex) {
            System.out.println("driver not found");
        }
        
    }
    
}
