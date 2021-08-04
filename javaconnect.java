import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect
{
    public Connection conn;
    public Statement statement=null;
    public PreparedStatement pst=null;
    public ResultSet rs=null;
    
    
     final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    
    //C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext
    final static String DB_URL= "jdbc:mysql://localhost:3306/student_database?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    final static String USER= "root";
    final static String PASS="";
    
    
    
    public  static Connection connerDb()
    {
        try {
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Database Sucessful");
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_database?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
           // JOptionPane.showMessageDialog(null, "Connect database");
           
             
           // Class.forName("org.sqlite.JDBC");
          //  Connection conn=DriverManager.getConnection("jdbc:sqlite:student_database.sqlite");
            
            return conn;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Database Conncetion Problem.");
        }
        return null;
    }
            
}
  