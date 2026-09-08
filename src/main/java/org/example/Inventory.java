package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private List<Product> products = new ArrayList<>();
    private Map<Integer, Product> productMap = new HashMap<>();
    private List<Sale> sales = new ArrayList<>();
    private int saleCounter = 1;

    public void addProduct(Product product) throws DuplicateProductException {
        if (productMap.containsKey(product.getProductId())) {
            throw new DuplicateProductException(
                    "Product ID " + product.getProductId() + " already exists!"
            );
        }
        products.add(product);
        productMap.put(product.getProductId(), product);
    }

    public void viewProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-13s %-10s%n",
                "ID", "NAME", "CATEGORY", "PRICE", "STOCK");
        System.out.println("---------------------------------------------------------------");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public Product searchProduct(int productId) {
        Product product = productMap.get(productId);
        if (product == null) {
            System.out.println("Product not found.");
            return null;
        }
        return product;
    }

    public void sellProduct(int productId, int quantity)
            throws InsufficientStockException {
        Product product = productMap.get(productId);
        if (product == null) {
            System.out.println("Product not found.");
            return;
        }
        if (product.getQuantity() < quantity) {
            throw new InsufficientStockException(
                    "Not enough stock available!"
            );
        }
        double totalAmount = product.getPrice() * quantity;

        product.setQuantity(product.getQuantity() - quantity);

        Sale sale = new Sale(
                saleCounter++,
                product.getProductId(),
                product.getProductName(),
                quantity,
                totalAmount,
                LocalDateTime.now()
        );

        sales.add(sale);

        System.out.println("Product sold successfully.");
    }
    public void updateStock(int productId, int newQuantity) {

        Product product = productMap.get(productId);

        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        product.setQuantity(newQuantity);

        System.out.println("Stock updated successfully.");
    }
    public void deleteProduct(int productId) {

        Product product = productMap.get(productId);

        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        productMap.remove(productId);
        products.remove(product);

        System.out.println("Product deleted successfully.");
    }
    public void viewSales() {

        if (sales.isEmpty()) {
            System.out.println("No sales available.");
            return;
        }

        for (Sale sale : sales) {
            System.out.println(sale);
        }
    }
}

