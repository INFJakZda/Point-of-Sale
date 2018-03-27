import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect {
    private java.sql.Connection conn;
    private Properties properties;
    private String url = "jdbc:oracle:thin:@//admlab2.cs.put.poznan.pl:1521/dblab02_students.cs.put.poznan.pl";

    public Connect (String pass) throws SQLException {
        this.properties = new Properties();
        this.properties.put("user", pass);
        this.properties.put("password", pass);

        this.conn = DriverManager.getConnection(url, properties);
        System.out.println("Connect to database");
    }

    public void disconnect() throws SQLException {
        conn.close();
        System.out.println("disconnect");
    }
}