package com.qa;

import java.util.Arrays;

public class Book {

    private String name;
    private String[] authors;
    private double price;

    public Book(String name, String[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String[] getAuthors() {
        return authors;
    }

    private void setAuthors(String[] authors) {
        this.authors = authors;
    }

    private double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Book [name=" + name + ", authors=" + Arrays.toString(authors) + ", price=" + price + "]";
    }
}
