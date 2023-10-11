package com.hspedu.interface_;

public class Interface01 {
    public static void main(String[] args) {

        Phone phone = new Phone();
        //创建计算机
        Computer computer = new Computer();
        computer.work(phone);
    }
}
