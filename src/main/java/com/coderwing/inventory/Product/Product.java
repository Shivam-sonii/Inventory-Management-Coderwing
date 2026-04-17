package com.coderwing.inventory.Product;

public class Product {

    private int id;
    private String name;
    private int quantity;
    

    public Product(int id, String name, int quantity ) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Qty: %d",
                id, name, quantity);
    }
}
