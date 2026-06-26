//package Week-1.DSA.E-commerceSearch;
import java.util.*;

public class SearchAlgorithms {

    // Linear Search
    public static Market linearSearch(Market[] products, int id) {

        for (int i = 0; i < products.length; i++) {

            if (products[i].productId == id) {
                return products[i];
            }

        }

        return null;
    }

    // Binary Search If data is sorting .. Bset approach in 0(logn).
    public static Market binarySearch(Market[] products, int id) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (products[mid].productId == id) {
                return products[mid];
            }

            else if (products[mid].productId < id) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }

        }

        return null;
    }

}
