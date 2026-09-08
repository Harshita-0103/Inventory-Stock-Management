# Inventory Stock Management System
A console-based Inventory Management System developed using Core Java.
The application helps manage products, stock, sales, and inventory operations
through a simple menu-driven interface.

## Project Overview
Managing inventory manually can lead to stock errors, duplicate products,
and difficulty in tracking sales.
This project provides a simple Java-based solution to:
- Add and manage products
- Search products using Product ID
- Update product stock
- Sell products and automatically reduce stock
- Track sales history
- Delete products
- Prevent duplicate Product IDs
- Handle insufficient stock using custom exceptions
The project is designed to demonstrate important Core Java concepts
through a real-world application.

## Features

### 1. Add Product
Users can add a new product by entering:
- Product ID
- Product Name
- Category
- Price
- Quantity
Duplicate Product IDs are not allowed.

### 2. View Products
Displays all products currently available in the inventory.

### 3. Search Product
Users can search for a product using its Product ID.

### 4. Sell Product
Users can sell a specified quantity of a product.

After a successful sale:
- Product stock is automatically reduced.
- Sale details are stored in sales history.
- Total sale amount is calculated automatically.

### 5. Update Stock
Users can update the available quantity of an existing product.

### 6. Delete Product
Products can be removed from the inventory using their Product ID.

### 7. Sales History
The system stores and displays:
- Sale ID
- Product ID
- Product Name
- Quantity Sold
- Total Amount
- Sale Date and Time

### 8. Exception Handling
The project uses custom exceptions to handle invalid inventory operations:
- DuplicateProductException`
- InsufficientStockException`

## Technologies Used
- Core Java
- Java Collections Framework
- Exception Handling
- Java Time API
- IntelliJ IDEA
- Git & GitHub

## Core Java Concepts Used
This project demonstrates:
- Classes and Objects
- Constructors
- Encapsulation
- ArrayList
- HashMap
- CRUD Operations
- Custom Exceptions
- Exception Handling
- Scanner
- `LocalDateTime`

## Collections Used
### ArrayList
Used to store and manage multiple Product and Sale objects.
### HashMap
Used to store products using Product ID as the key.

# Output
========================================
       INVENTORY MANAGEMENT SYSTEM
========================================
1. Add Product
2. View Products
3. Search Product
4. Sell Product
5. Update Stock
6. Delete Product
7. View Sales
8. Exit
========================================
Enter your choice: 1
Enter Product ID: 1001
Enter Product Name: TV
Enter Category: Electronics
Enter Price: 25000
Enter Quantity: 1
Product added successfully.

========================================
       INVENTORY MANAGEMENT SYSTEM
========================================
1. Add Product
2. View Products
3. Search Product
4. Sell Product
5. Update Stock
6. Delete Product
7. View Sales
8. Exit
========================================
Enter your choice: 1
Enter Product ID: 1002
Enter Product Name: Watch
Enter Category: Electronics
Enter Price: 10000
Enter Quantity: 1
Product added successfully.

========================================
       INVENTORY MANAGEMENT SYSTEM
========================================
1. Add Product
2. View Products
3. Search Product
4. Sell Product
5. Update Stock
6. Delete Product
7. View Sales
8. Exit
========================================
Enter your choice: 2

# Add product and View products 
<img width="384" height="103" alt="Screenshot 2026-09-08 214037" src="https://github.com/user-attachments/assets/03c8d778-41b9-489b-85cd-e3b36f2a5098" /></br>
# Search Product
<img width="370" height="73" alt="image" src="https://github.com/user-attachments/assets/bdc5213f-5e3f-4f5a-9be1-c34a8104d1c7" /></br>
# Sell Product
<img width="256" height="97" alt="image" src="https://github.com/user-attachments/assets/60161729-f2bc-454f-a2d8-babf0416f1da" /></br>
# Update Product
<img width="287" height="92" alt="image" src="https://github.com/user-attachments/assets/4aeb121b-5fce-4e1d-8eb1-ac345e49faf0" /></br>
<img width="383" height="101" alt="image" src="https://github.com/user-attachments/assets/7dd791df-fb8f-4362-8ab7-0afd48c7f739" />


