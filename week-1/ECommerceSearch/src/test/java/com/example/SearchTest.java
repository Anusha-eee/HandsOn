package com.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
public class SearchTest {
    private Product[] products;
    @BeforeEach
    public void setUp() {
        products = new Product[] {
            new Product("P103", "Smartphone", "Electronics"),
            new Product("P101", "Laptop", "Electronics"),
            new Product("P105", "Desk Lamp", "Furniture"),
            new Product("P102", "Coffee Mug", "Kitchen"),
            new Product("P104", "Backpack", "Accessories")
        };
    }
    @Test
    public void testLinearSearch() {
        Product result = SearchAlgorithms.linearSearch(products, "P101");
        assertNotNull(result);
        assertEquals("Laptop", result.getProductName());
        Product notFound = SearchAlgorithms.linearSearch(products, "P999");
        assertNull(notFound);
    }
    @Test
    public void testBinarySearch() {
        Product[] sortedProducts = Arrays.copyOf(products, products.length);
        Arrays.sort(sortedProducts, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));
        Product result = SearchAlgorithms.binarySearch(sortedProducts, "P101");
        assertNotNull(result);
        assertEquals("Laptop", result.getProductName());
        Product notFound = SearchAlgorithms.binarySearch(sortedProducts, "P999");
        assertNull(notFound);
    }
}
