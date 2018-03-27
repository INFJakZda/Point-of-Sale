import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String args[]) {

        Scanner idReader = new Scanner(System.in);
        System.out.println("Enter password: ");
        String pass = idReader.next();

        try {
            Connect connect = new Connect(pass);

            connect.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(
                    Connection.class.getName()).log(Level.SEVERE, "cant dis/connect to database", ex);
            System.exit(-1);
        }
    }
}

