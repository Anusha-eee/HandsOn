import java.util.Arrays;

public class SearchDemo {
    public static Product linearSearch(Product[] products, String targetProductId) {
        if (products == null) return null;
        for (Product product : products) {
            if (product != null && product.getProductId().equals(targetProductId)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String targetProductId) {
        if (products == null) return null;
        int low = 0;
        int high = products.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            Product midProduct = products[mid];
            if (midProduct == null) {
                return null;
            }
            int comparison = midProduct.getProductId().compareTo(targetProductId);
            if (comparison == 0) {
                return midProduct;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = new Product[] {
            new Product("P103", "Smartphone", "Electronics"),
            new Product("P101", "Laptop", "Electronics"),
            new Product("P105", "Desk Lamp", "Furniture"),
            new Product("P102", "Coffee Mug", "Kitchen"),
            new Product("P104", "Backpack", "Accessories")
        };

        System.out.println("Original Products:");
        for (Product p : products) {
            System.out.println(p);
        }

        System.out.println("\n--- Testing Linear Search ---");
        Product foundLinear = linearSearch(products, "P101");
        System.out.println("Searching for P101: " + (foundLinear != null ? foundLinear : "Not Found"));

        Product notFoundLinear = linearSearch(products, "P999");
        System.out.println("Searching for P999: " + (notFoundLinear != null ? notFoundLinear : "Not Found"));

        System.out.println("\n--- Testing Binary Search ---");
        // Binary search requires sorting by the key (productId)
        Product[] sortedProducts = Arrays.copyOf(products, products.length);
        Arrays.sort(sortedProducts, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));
        
        System.out.println("Sorted Products (required for Binary Search):");
        for (Product p : sortedProducts) {
            System.out.println(p);
        }

        Product foundBinary = binarySearch(sortedProducts, "P101");
        System.out.println("Searching for P101: " + (foundBinary != null ? foundBinary : "Not Found"));

        Product notFoundBinary = binarySearch(sortedProducts, "P999");
        System.out.println("Searching for P999: " + (notFoundBinary != null ? notFoundBinary : "Not Found"));
    }
}
