package com.hspedu.enum_.homework;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver() {
        //先得到船
        if (!(vehicles instanceof Boat)){
            vehicles = VehiclesFactory.getBoat();
        }

        vehicles.work();
    }
    public void common() {
        //判断一下,当前的vehicles 属性是null 就获取一匹马
        if (vehicles != null){
            vehicles = VehiclesFactory.getHorse();
        }
        //得到马儿
        vehicles.work();
    }
}
