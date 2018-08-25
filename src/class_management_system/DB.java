/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Asheni
 */
public class DB {
  public static Connection c;
  
  
  public static Connection getConnection() throws Exception{
       
           Class.forName("com.mysql.jdbc.Driver");
        Connection c= DriverManager.getConnection ("jdbc:mysql://localhost:3306/class_management_system", "root", "5678");
        
  
        return c;
        
  } 
  
  
  public static void iud (String s)throws Exception{
    Connection c=getConnection();
         c.createStatement().executeUpdate(s);
         
     
  }
  public static ResultSet search(String s)throws Exception{
     Connection c=getConnection();
      return c.createStatement().executeQuery(s);
  }
}
