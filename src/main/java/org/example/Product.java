package org.example;
public class Product {
    private int productId;
    private String productName;
    private String category;
    private double price;
    private int quantity;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(int productId, String productName, String category,
                   double price, int quantity) {

        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }
    public String toString() {
        return String.format(
                "%-10d %-15s %-15s ₹%-12.2f %-10d",
                productId,
                productName,
                category,
                price,
                quantity
    );
}}
