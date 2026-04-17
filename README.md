# Simple Inventory Management System

A lightweight, console-based Java application built with Maven to manage retail store inventory. This project demonstrates core Object-Oriented Programming (OOP) principles, including encapsulation and service-oriented logic.

## 🚀 Features

The system provides a streamlined interface to perform essential inventory operations:
* **Add Products:** Register new items into the store database.
* **Update Quantities:** Modify stock levels for existing products.
* **Remove Products:** Delete items from the inventory by their unique identifier.
* **View Inventory:** Display a comprehensive list of all products currently in stock.

## 🛠️ Tech Stack

* **Language:** Java
* **Build Tool:** Maven
* **Architecture:** Console-based CRUD (Create, Read, Update, Delete)

## 📁 Project Structure

The project consists of three primary Java files:
* `Product.java`: The Model class representing the data structure of an inventory item.
* `InventoryService.java`: The Logic layer containing methods to manipulate the product list.
* `App.java`: The Entry point containing the `main` method and user interface logic.

## ⚙️ Installation & Setup

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/Shivam-sonii/Inventory-Management-Coderwing.git](https://github.com/Shivam-sonii/Inventory-Management-Coderwing.git)
   # Clone the repositoryt

# Move into the repository folder
cd inventory

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
