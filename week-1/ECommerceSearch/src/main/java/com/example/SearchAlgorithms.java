package com.example;
public class SearchAlgorithms {
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
}
