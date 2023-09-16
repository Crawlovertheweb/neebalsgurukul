package com.service;

import com.model.Product;

public class ProductService {
    public Product increasePriceByCategory(Product product) {
        double increment = 0.0;
        String category = product.getCategory().toLowerCase();

        if (category.equals("mobiles")) {
            increment = product.getPrice() * 0.02; // Increase by 2%
        } else if (category.equals("laptops")) {
            increment = product.getPrice() * 0.01; // Increase by 1%
        }

        product.setPrice(product.getPrice() + increment);
        return product;
    }

    public double computeTotalPrice(Product[] products) {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void computeGreaterPrice(Product product1, Product product2) {
        if (product1.getPrice() > product2.getPrice()) {
            System.out.println(product1.getTitle() + " has a greater price.");
        } else if (product2.getPrice() > product1.getPrice()) {
            System.out.println(product2.getTitle() + " has a greater price.");
        } else {
            System.out.println("Both products have the same price.");
        }
		
    }
}
