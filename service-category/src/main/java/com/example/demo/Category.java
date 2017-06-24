package com.example.demo;

public class Category {

    private final Integer id;
    private final String name;

    public Category(Integer id, String name) {

        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
