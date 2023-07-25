package com.hspedu.enum_.homework;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Homework06 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", new Horse());
        tang.common();//一般情况下
        tang.passRiver();//过河
    }
}
