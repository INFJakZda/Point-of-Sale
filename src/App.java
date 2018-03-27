import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String args[]) {

        Receipt receipt = new Receipt();
        Printer printer;

        Scanner idReader = new Scanner(System.in);
        System.out.println("Enter password: ");
        String pass = idReader.next();

        try {
            Connect connect = new Connect(pass);
            try {
                String id = idReader.next();

                //main loop - product scan
                while(!id.equals("exit")) {
                    if(id.equals(null)) {
                        System.out.println("Invalid code!");
                        break;
                    }

                    Product prod = connect.getProduct(id);

                    if(prod != null) {
                        receipt.addProduct(prod);
                        System.out.println(prod.getName() + " " + prod.getPrice());
                    }
                    else {
                        System.out.println("Product not found!");
                    }

                    id = idReader.next();
                }   //end main loop

            } catch (SQLException ex) {
                System.out.println("Error executing the command" + ex.toString());
            }

            //print receipt
            printer = new Printer(receipt);
            printer.print();
            connect.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(
                    Connection.class.getName()).log(Level.SEVERE, "cant dis/connect to database", ex);
            System.exit(-1);
        }
    }
}

