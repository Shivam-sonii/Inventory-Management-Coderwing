package com.coderwing.inventory;

import java.util.Scanner;

import com.coderwing.inventory.Product.Product;
import com.coderwing.inventory.inventory.InventoryService;

public class App {

    public static InventoryService service = new InventoryService();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n \n--- CoderWing Inventory System ---");
            System.out.println("1. Add Product\n2. View All\n3. Update Quantity\n4. Remove Product\n5. Exit");
            System.out.print("Select an option: ");

            int input = scanner.nextInt();
            switch (input) {
                case 1->
                    create();
                case 2->
                    read();
                case 3->
                    update();
                case 4->
                    delete();
                case 5->
                    System.exit(0);
            }
        }
    }

    private static void create() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Qty: ");
        int qty = scanner.nextInt();

        service.addProduct(new Product(id, name, qty));
        System.out.println("Success: Product added.");
    }

    private static void read() {
        if (service.getAllProducts().isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            service.getAllProducts().forEach(System.out::print);
        }
    }

    private static void update() {
        System.out.print("Enter ID to update: ");
        int id = scanner.nextInt();
        System.out.print("Enter new quantity: ");
        int qty = scanner.nextInt();
        if (service.updateQuantity(id, qty)) {
            System.out.println("Updated!"); 
        }else {
            System.out.println("ID not found.");
        }
    }

    private static void delete() {
        System.out.print("Enter ID to remove: ");
        int id = scanner.nextInt();
        if (service.deleteProduct(id)) {
            System.out.println("Removed!"); 
        }else {
            System.out.println("ID not found.");
        }
    }
}
