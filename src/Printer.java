
public class Printer {

    private Receipt receipt;

    public Printer(Receipt receipt) {
        this.receipt = receipt;
    }

    public void print() {
        System.out.println("Your Receipt:");
        for(Product prod: receipt.getProductList()) {
            System.out.println(prod.getName() + "\t\t\t" + prod.getPrice());
        }
        System.out.println("Sum price of products: " + receipt.getSumPrice());
    }
}
