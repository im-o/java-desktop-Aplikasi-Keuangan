/**
 *
 * @author Ramayanti
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class dbKonek {
    private static Connection mysqlKonek;
    public static Connection koneksiDB() throws SQLException{
        if (mysqlKonek==null){
            try {
                String hostDb = "jdbc:mysql://localhost:3306/db_akuntansi";
                String userDb = "root";
                String pass = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlKonek = (Connection) DriverManager.getConnection(hostDb,userDb,pass);
                System.out.println("Berhasil tekoneksi dengan database");
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Gagal terhubung dengan database\ncoba periksa MySQL local server\n(Xampp)");
                System.out.println("Gagal");
            }
        }
        return mysqlKonek;
    }
    
}