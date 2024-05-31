package Config;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class Koneksi {
    private static Connection conn;
    
    public static Connection getConnection () {
        if (conn == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/mahasiswaku";
                String username = "root";
                String password = "sinta123";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                conn = (Connection) DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return conn;
    }
}
