package edu.northeastern.yanxuan;

public abstract class Book {

    String title;
    double price;
    String publishYear;

    public Book (String title, double price, String publishYear) {


    } //Constructor

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public abstract String description();

}
