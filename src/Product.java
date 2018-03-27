
public class Product {

    private String idCode;
    private String name;
    private float price;

    public Product(String code, String name, int price) {
        this.idCode = code;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public float getPrice() {
        return price;
    }

    public String getIdCode() {
        return idCode;
    }
}