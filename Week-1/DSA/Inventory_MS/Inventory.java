//package Week-1.DSA.Inventory_MS;

import java.util.*;

public class Inventory {

    HashMap<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {

        products.put(product.getProductId(), product);
        System.out.println("Product Added Successfully.");
    }

    public void updateProduct(int id, String name, int quantity, double price) {

        if (products.containsKey(id)) {

            Product p = products.get(id);

            p.setProductName(name);
            p.setQuantity(quantity);
            p.setPrice(price);

            System.out.println("Product Updated Successfully.");

        } else {

            System.out.println("Product Not Found.");

        }

    }

    public void deleteProduct(int id) {

        if (products.containsKey(id)) {

            products.remove(id);
            System.out.println("Product Deleted Successfully.");

        } else {

            System.out.println("Product Not Found.");

        }

    }

    public void displayProducts() {

        if (products.isEmpty()) {

            System.out.println("Inventory is Empty.");
            return;

        }

        for (Product p : products.values()) {

            System.out.println("---------------------");
            System.out.println(p);

        }

    }

}
