package org.example.dto;

import org.example.model.Product;

public class ProductDTO extends Product {
    private String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
