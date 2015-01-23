
package attendence;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Connectivity {
    
    public static Connection conn= null;
    
    public static Connection mydb() {
        try{
        Class.forName("oracle.jdbc.OracleDriver");
        conn = DriverManager.getConnection("jdbc:oracle:thin:@azhar:1521:XE","system","root");
        
        }
    catch (SQLException ex) {
            Logger.getLogger(Connectivity.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connectivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
}
