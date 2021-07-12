package com.example.apidemo;

public class Product {
    int id;
    String title;
    int status;


    public Product(int id, String title, int status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
