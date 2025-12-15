package org.example.model;

import java.util.UUID;

public class Category {
    private int id;
    private String name;

    public Category(){
        this.id = UUID.randomUUID().hashCode();
    }

    public Category(String name) {
        this.id = UUID.randomUUID().hashCode();
        this.name = name;
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

}
