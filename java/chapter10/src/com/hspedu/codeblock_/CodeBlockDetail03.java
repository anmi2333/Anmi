package com.hspedu.codeblock_;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        BBB bbb = new BBB();
    }
}
class AAA {

    public AAA() {
        System.out.println("AAA() 构造器被调用");
    }
}

class BBB extends AAA {
    {
        System.out.println("BBB() 的普通代码块");
    }
    public BBB() {
        //super
        //调用本类
        System.out.println("BBB() 构造器被调用");
    }
}
