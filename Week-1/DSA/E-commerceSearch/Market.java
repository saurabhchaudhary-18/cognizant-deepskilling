//package Week-1.DSA.E-commerceSearch;
//import java.util.*;
public class Market {

    int productId;
    String productName;
    String category;

    public Market(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public void display() {
        System.out.println(productId + " " + productName + " " + category);
    }
}
