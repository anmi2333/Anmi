package com.hspedu.generic_.improve;

import java.util.ArrayList;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
@SuppressWarnings("all")
public class Generic02 {
    public static void main(String[] args) {
        ArrayList<Dog> dogList = new ArrayList<Dog>();
        dogList.add(new Dog("旺财",10,'公'));
        dogList.add(new Dog("阿黄",8,'母'));

//        dogList.add(new Cat("阿黄",8,'母'));
        System.out.println(dogList);
    }
}

class Dog {
    private String name;
    private int age;
    private char gen;
    public Dog(String name, int age,char gen) {
        this.name = name;
        this.age = age;
        this.gen = gen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGen() {
        return gen;
    }

    public void setGen(char gen) {
        this.gen = gen;
    }
}

class Cat {
    private String name;
    private int age;
    private char gen;
    public Cat(String name, int age,char gen) {
        this.name = name;
        this.age = age;
        this.gen = gen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGen() {
        return gen;
    }

    public void setGen(char gen) {
        this.gen = gen;
    }
}