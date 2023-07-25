package com.dreaMTank;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Cat {
    private String name;
    public int age = 10;
    public Cat() {}
    public Cat(String name) {
        this.name = name;
    }
    public void hi () {
       // System.out.println("1" + name);
    }
    public void cry() {
        System.out.println("2" + name);
    }
}
