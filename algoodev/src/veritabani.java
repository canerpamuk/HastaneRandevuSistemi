/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Çağdaş Sert
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class veritabani {
    Connection conn = null;
    
    public static Connection connect_db()
    {
        try
        {
           Class.forName("org.sqlite.JDBC");
           Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\LENOVO\\Desktop\\algoodev\\hos.sqlite");
           return conn;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }       
}
