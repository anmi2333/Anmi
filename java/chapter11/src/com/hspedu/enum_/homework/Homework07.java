package com.hspedu.enum_.homework;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Homework07 {
    public static void main(String[] args) {
        Car2 car2 = new Car2(60);
        car2.getAir().flow();
    }
}
/**
 * Car类 有属性temperature(温度) 车内有Air(空调)类 有吹风的功能flow
 * */
class Car2 {
    private double temperature;

    public Car2(double temperature) {
        this.temperature = temperature;
    }

    //Air 成员内部类
    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("温度大于40 空调吹冷气...");
            } else if (temperature < 0) {
                System.out.printf("温度小于0 空调吹暖气...");
            } else {
                System.out.println("温度正常 关闭空调");
            }
        }
    }
        public Air getAir() {
            return new Air();
        }
}
