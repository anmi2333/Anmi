package com.hspedu.generic_.customgeneric;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class CustomGeneric {
    public static void main(String[] args) {

    }
}

//解读
//1.Tiger 后面泛型，所以我们把Tiger 就称为自定义泛型类
class Tiger<T, R, M> {
    String name;
    R r;
    M m;
    T t;
}