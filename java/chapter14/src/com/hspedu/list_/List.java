package com.hspedu.list_;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class List {
    public static void main(String[] args) {
        //list.get();
    }
}

class Big {
    private String name;
    private String author;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public Big(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;


    }
}
