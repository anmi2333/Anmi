package com.hspedu.static_;

public class StaticDetail {
    public static void main(String[] args) {
        B b = new B();
        //System.out.println(B.n1);
        System.out.println(B.n2);
        System.out.println(C.n3);
    }
}

class B {
    public int n1 = 100;
    public static int n2 =200;
}

class C {
    public static String n3 = "beijing";
}