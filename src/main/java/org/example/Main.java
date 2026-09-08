package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while (true) {

            System.out.println("\n========================================");
            System.out.println("       INVENTORY MANAGEMENT SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Search Product");
            System.out.println("4. Sell Product");
            System.out.println("5. Update Stock");
            System.out.println("6. Delete Product");
            System.out.println("7. View Sales");
            System.out.println("8. Exit");
            System.out.println("========================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    Product product = new Product(
                            id,
                            name,
                            category,
                            price,
                            quantity
                    );

                    try {
                        inventory.addProduct(product);
                        System.out.println("Product added successfully.");
                    } catch (DuplicateProductException e) {
                        System.out.println(e.getMessage());
                    }

                    break;


                case 2:

                    System.out.println("\n========== ALL PRODUCTS ==========");
                    inventory.viewProducts();

                    break;


                case 3:

                    System.out.print("Enter Product ID to search: ");
                    int searchId = sc.nextInt();

                    Product searchedProduct = inventory.searchProduct(searchId);

                    if (searchedProduct != null) {
                        System.out.println(searchedProduct);
                    }

                    break;


                case 4:

                    System.out.print("Enter Product ID: ");
                    int sellId = sc.nextInt();

                    System.out.print("Enter Quantity to sell: ");
                    int sellQuantity = sc.nextInt();

                    try {
                        inventory.sellProduct(sellId, sellQuantity);
                    } catch (InsufficientStockException e) {
                        System.out.println(e.getMessage());
                    }

                    break;


                case 5:

                    System.out.print("Enter Product ID: ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter New Quantity: ");
                    int newQuantity = sc.nextInt();

                    inventory.updateStock(updateId, newQuantity);

                    break;


                case 6:

                    System.out.print("Enter Product ID to delete: ");
                    int deleteId = sc.nextInt();

                    inventory.deleteProduct(deleteId);

                    break;
                case 7:

                    System.out.println("\n========== SALES HISTORY ==========");
                    inventory.viewSales();

                    break;


                case 8:

                    System.out.println("Thank you for using Inventory Management System!");
                    sc.close();
                    return;


                default:

                    System.out.println("Invalid choice! Please enter 1 to 9.");
            }
        }
    }
}