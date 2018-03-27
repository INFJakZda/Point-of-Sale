import java.util.*;

public class Receipt {

    private List<Product> productList;
    private float sumPrice;

    public Receipt() {
        this.productList = new ArrayList<>();
        this.sumPrice = 0;
    }

    public void addProduct(Product product) {
        productList.add(product);
        sumPrice += product.getPrice();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public float getSumPrice() {
        return sumPrice;
    }
}
