import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect {
    private java.sql.Connection conn;
    private Properties properties;
    private String url = "jdbc:oracle:thin:@//admlab2.cs.put.poznan.pl:1521/dblab02_students.cs.put.poznan.pl";
    private Statement stmt;
    private ResultSet rs;

    public Connect (String pass) throws SQLException {
        this.properties = new Properties();
        this.properties.put("user", pass);
        this.properties.put("password", pass);
        this.stmt = null;
        this.rs = null;

        this.conn = DriverManager.getConnection(url, properties);
        System.out.println("Connect to database");
    }

    public void disconnect() throws SQLException {
        if (conn != null) conn.close();
        if (rs != null) rs.close();
        if (stmt != null) stmt.close();
        System.out.println("disconnect");
    }

    public Product getProduct(String id) throws SQLException {
        stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_READ_ONLY);

        rs = stmt.executeQuery("SELECT id, name, price " +
                                    "FROM products where id = " + id);

        if (rs.next()) {
            String code = rs.getString(1);
            String name = rs.getString(2);
            Float price = rs.getFloat(3);

            //System.out.println(name + " " + price);
            return(new Product(code, name, price));
        }
        else
            return null;
    }
}