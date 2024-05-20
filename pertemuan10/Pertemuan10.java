package pertemuan10;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Ni Kadek Dwi Pratiwi
 * 2201010051
 * Kelas = U
 * Tgl 20 Mei 2024
 */
public class Pertemuan10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        list_all();
    }
    
    static void list_all() throws SQLException{
        Connection cnn = koneksi.getKoneksi();
        if(cnn.isClosed()){
            System.out.println("Koneksi Gagal");
        }else{
            PreparedStatement PS = cnn.prepareStatement("select * from datateman;");
            ResultSet rs = PS.executeQuery();
            
            while(rs.next()){
                System.out.println( "No Record: "+ rs.getInt("idteman") );
                System.out.println( "Nama : "+ rs.getString("nama") );
                System.out.println( "Alamat : "+ rs.getString("alamat") );
                System.out.println( "telp : "+ rs.getString("telp") );
            }
                    
        }
        
    }
}
