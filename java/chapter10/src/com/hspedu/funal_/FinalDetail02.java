package com.hspedu.funal_;

public class FinalDetail02 {
    public static void main(String[] args) {

    }
}

class BBB {
    public final  static int num = 10000;
    static {
        System.out.println("BBB 静态代码块被执行");

    }
}
class AAA {
    public final void cry() {

    }
}