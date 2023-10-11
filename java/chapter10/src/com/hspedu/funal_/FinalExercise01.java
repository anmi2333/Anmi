package com.hspedu.funal_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.printf("面积= " + circle.calArea());
    }
}

class Circle {
    public double radius;
    public final double PI;//= 3.14;
    //构造器

    public Circle(double radius) {
        this.radius = radius;
        PI = 3.14;
    }
    public double calArea(){
        return PI * radius * radius;
    }
}
