
package attendence;

import java.sql.*;



public class Connectivity {
    
    static Connection conn= null;
    
    public static Connection mydb() throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/attendance","root","root");
        return conn;
        
    }
    
}
