package supreme.rentals;
import java.sql.*;
import javax.swing.*;



public class javaconnect {
   Connection conn=null;
   public static Connection ConnecrDb(){
       try{
           Class.forName("org.sqlite.JDBC");
           Connection conn=DriverManager.getConnection("jdbc:sqlite:Vehicles.sqlite");
           JOptionPane.showMessageDialog(null,"Connection Established");
           return conn;
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
        return null;   
       }
   }
}
