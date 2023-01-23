/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasAkhir;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.DriverManager;

/**
 *
 * @author alifb
 */
import java.sql.SQLException;
public class ConnectorDb {
    static final String jdbc_driver = "com.mysql.cj.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/kostdb";
    static final String user = "root";
    static final String pass = "";
    static Connection conn;
    static Statement stat;
    static ResultSet rs;
    
    public static Connection connectDatabase(){
        try{
            Class.forName(jdbc_driver);
        }catch(ClassNotFoundException cnf){
           
        }try {
            conn = (Connection) DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Koneksi berhasil");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }catch(HeadlessException e){
            
        }
        return conn;
    }
}
