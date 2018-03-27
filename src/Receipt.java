import java.util.*;

public class Receipt {

    private List<Product> productList;
    float sumPrice;

    public Receipt() {
        this.productList = new ArrayList<>();
        this.sumPrice = 0;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }
}
