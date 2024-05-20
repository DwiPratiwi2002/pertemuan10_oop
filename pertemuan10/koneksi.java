package pertemuan10;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * Ni Kadek Dwi Pratiwi
 * 2201010051
 * Kelas = U
 * Tgl 20 Mei 2024
 */
public class koneksi {
    public static Connection getKoneksi() throws SQLException{
        Connection cnn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bukuteman", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Koneksi Ke Database Gagal");
        }
        
        return cnn;
    }
}
