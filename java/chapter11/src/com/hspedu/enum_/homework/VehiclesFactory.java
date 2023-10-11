package com.hspedu.enum_.homework;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class VehiclesFactory {
    private static Horse horse = new Horse();//饿汉式
    //创建交通工具工厂类
    //这里 我们将方法做成
    private VehiclesFactory(){}
    public static Horse getHorse (){
        return new Horse();
    }
    public static Boat getBoat() {
        return new Boat();
    }
}
