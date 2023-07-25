package com.hspedu.codeblock_;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        //
        //进行类的加载
        //创建对象
        new B02();//对象
    }
}

class  A02{

}

class B02 extends A02 {

}

class C02 {
    private int n1 = 100;
    private static int n2 = 200;

    private void m1() {

    }
    static {
        System.out.println(n2);//ok
    }
}
