// Week-1.DSA.E-commerceSearch;
import java.util.*;
public class Shop {

    public static void main(String[] args) {

        Market[] products = {

                new Market(101, "Laptop", "Electronics"),
                new Market(102, "Phone", "Electronics"),
                new Market(103, "Shoes", "Fashion"),
                new Market(104, "Watch", "Accessories"),
                new Market(105, "Bag", "Fashion")

        };

        int searchId = 104;

        System.out.println("Linear Search:");

        Market result1 = SearchAlgorithms.linearSearch(products, searchId);

        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product not found");
        }

        System.out.println();

        System.out.println("Binary Search:");

        Market result2 = SearchAlgorithms.binarySearch(products, searchId);

        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product not found");
        }

    }

}
