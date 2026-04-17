package com.coderwing.inventory.inventory;

import java.util.ArrayList;
import java.util.List;

import com.coderwing.inventory.Product.Product;

public class InventoryService {
    private List<Product> products = new ArrayList<>();

    
    public void addProduct(Product product) {
        products.add(product);
    }

    
    public List<Product> getAllProducts() {
        return products;
    }

    
    public boolean updateQuantity(int id, int newQty) {
        for (Product p : products) {
            if (p.getId() == id) {
                p.setQuantity(newQty);
                return true;
            }
        }
        return false;
    }

    
    public boolean deleteProduct(int id) {
        return products.removeIf(p -> p.getId() == id);
    }
}