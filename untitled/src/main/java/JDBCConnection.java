import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
    public static Connection getConnection() {
        final String url = "jdbc:mysql://localhost:6033/app_db?useSSL=false";
        final String user = "root";
        final String password = "my_secret_password";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url,user,password);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
