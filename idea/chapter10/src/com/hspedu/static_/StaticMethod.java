package com.hspedu.static_;

public class StaticMethod {
    public static void main(String[] args) {

    }
}

class Stu {
    private String name;//普通成员
    //定义静态变量 累计学费
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }
    public void payFee(double fee) {
        Stu.fee += fee;
    }
}
