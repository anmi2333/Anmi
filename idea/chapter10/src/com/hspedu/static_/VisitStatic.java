package com.hspedu.static_;

public class VisitStatic {
    public static void main(String[] args) {
        //类名 类变量
        System.out.println(A.name);
    }
}

class A {
    //类变量
    public static String name = "王";
}