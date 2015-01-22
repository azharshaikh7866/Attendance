
package attendence;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Connectivity {
    
    public static Connection conn= null;
    
    public static Connection mydb() {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/attendance","root","root");
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connectivity.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Connectivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
}
