package koneksi;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author fahmi dan ajeng
 */
public class konek {
    static Connection koneksi;
    public static Connection getConnection(){
        try{
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/dbmhs","root","");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal");
        }
        return koneksi;
    }
}
