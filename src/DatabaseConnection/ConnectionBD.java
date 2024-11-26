/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConnection;

import com.sun.jdi.connect.spi.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.cj.MysqlConnection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Student
 */
public class ConnectionBD {
    
    private static final String URL="jdbc:mysql:localhost:3306/Eventos";
    private static final String PASSWORD="";
    private static final String USER="root";
    private static  Connection connection= null;
    
    public static Connection getConnection() throws SQLException{
        if(connection==null){
            try{
              Class.forName("com.mysql.cj.jdbc.Driver");
                connection=(Connection) DriverManager.getConnection(URL,PASSWORD,USER);
            }catch(ClassNotFoundException e){
                
            }
        }
        return connection;
        
    }
   
    
    
    
    
    
}
