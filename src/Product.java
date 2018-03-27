
public class Product {

    private String idCode;
    private String name;
    private Float price;

    public Product(String code, String name, Float price) {
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