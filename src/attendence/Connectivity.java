
package attendence;

import java.sql.*;



public class Connectivity {
    
    static Connection conn= null;
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost/";
    static final String USER = "root";
    static final String PASS = "root";
    
    public static Connection mydb() throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        return conn;
        
    }
    
}
