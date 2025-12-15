package org.example.model;

import java.util.UUID;

public class Product {
    private int id;
    private String name;
    private double price;
    private int categoryId;

    public Product() {
        this.id = UUID.randomUUID().hashCode();
    }

    public Product(String name, double price, int categoryId) {
        this.id = UUID.randomUUID().hashCode();
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
