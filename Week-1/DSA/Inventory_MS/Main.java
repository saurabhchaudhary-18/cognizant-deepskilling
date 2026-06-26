//package Week-1.DSA.Inventory_MS;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Laptop", 20, 55000);
        Product p2 = new Product(102, "Mouse", 50, 700);
        Product p3 = new Product(103, "Keyboard", 35, 1200);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        System.out.println("\nInventory:");

        inventory.displayProducts();

        System.out.println("\nUpdating Product...\n");

        inventory.updateProduct(102, "Wireless Mouse", 60, 900);

        inventory.displayProducts();

        System.out.println("\nDeleting Product...\n");

        inventory.deleteProduct(101);

        inventory.displayProducts();

    }

}