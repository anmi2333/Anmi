package com.hspedu.linkedhashset_;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
@SuppressWarnings({"all"})
public class LinkedHashExercise {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("奥拓",1000));//ok
        linkedHashSet.add(new Car("奥迪",300000));//
        linkedHashSet.add(new Car("法拉利",10000000));//
        linkedHashSet.add(new Car("奥迪",300000));//
        System.out.println("列表= " +linkedHashSet);
    }
}

class Car {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
