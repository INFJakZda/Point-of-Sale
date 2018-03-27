
public class Printer {

    private Receipt receipt;

    public Printer(Receipt receipt) {
        this.receipt = receipt;
    }

    public void print() {
        for(Product prod: receipt.getProductList()) {
            System.out.println(prod.getName() + " " + prod.getPrice());
        }
    }
}
