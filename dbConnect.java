package train.mgt;

import java.sql.*;
import javax.swing.*;

public class dbConnect 
{
	Connection conn=null;
    public static Connection java_db()
    {     
        try
        {
        	String url="jdbc:mysql://localhost:3306/Trains";
        	String u_name="root";
        	String pw="123456";
     
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =DriverManager.getConnection(url,u_name,pw);
            
            return conn;    
        }
       
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e.toString());
            return null;
        }
        
    }
}
