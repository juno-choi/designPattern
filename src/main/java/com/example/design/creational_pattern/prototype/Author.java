package com.example.design.creational_pattern.prototype;

public class Author {
    private String author;
    private String company;

    public Author(String author, String company) {
        this.author = author;
        this.company = company;
    }

    public String getAuthor() {
        return author;
    }

    public String getCompany() {
        return company;
    }

    public void changeAuthor(String author, String company){
        this.author = author;
        this.company = company;
    }
}
