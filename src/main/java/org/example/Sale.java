package org.example;

import java.time.LocalDateTime;
public class Sale {

        private int saleId;
        private int productId;
        private String productName;
        private int quantity;
        private double totalAmount;
        private LocalDateTime saleDate;

        public Sale(int saleId, int productId, String productName,
                    int quantity, double totalAmount, LocalDateTime saleDate) {

            this.saleId = saleId;
            this.productId = productId;
            this.productName = productName;
            this.quantity = quantity;
            this.totalAmount = totalAmount;
            this.saleDate = saleDate;
        }

        public int getSaleId() {
            return saleId;
        }

        public int getProductId() {
            return productId;
        }

        public String getProductName() {
            return productName;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getTotalAmount() {
            return totalAmount;
        }

        public LocalDateTime getSaleDate() {
            return saleDate;
        }

        @Override
        public String toString() {
            return "Sale{" +
                    "saleId=" + saleId +
                    ", productId=" + productId +
                    ", productName='" + productName + '\'' +
                    ", quantity=" + quantity +
                    ", totalAmount=" + totalAmount +
                    ", saleDate=" + saleDate +
                    '}';
        }
    }

