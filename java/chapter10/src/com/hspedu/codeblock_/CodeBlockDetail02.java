package com.hspedu.codeblock_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {

    }
}

class A {
    private static int n1 = getN1();
    static {
        System.out.println("A静态代码块01");
    }

    public static int getN1(){
        System.out.println("getN1");
        return 100;
    }
}
