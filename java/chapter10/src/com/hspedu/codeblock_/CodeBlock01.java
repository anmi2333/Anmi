package com.hspedu.codeblock_;

public class CodeBlock01 {

}

class Movie {
    private String name;
    private double price;
    private String director;

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }

    public Movie(String name) {
        this.name = name;


    }
}