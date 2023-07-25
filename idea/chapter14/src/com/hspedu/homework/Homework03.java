package com.hspedu.homework;

import java.util.HashMap;
import java.util.Set;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
@SuppressWarnings("all")
public class Homework03 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("jack",650);
        hashMap.put("tom",1200);
        hashMap.put("smith",2900);
        System.out.println(hashMap);
        hashMap.put("jack",2600);//替换
        System.out.println(hashMap);
        Set keySet = hashMap.keySet();
        for (Object key : keySet) {
            //更新
            hashMap.put(key,(Integer)hashMap.get(key) + 100);
        }
        System.out.println(hashMap);
    }
}

class Yuan {
    private String name;
    private double sal;

    public Yuan(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return  "Yuan{" +
                "name='" + name + '\'' + 
                ", sal=" + sal +
                '}';
    }
}
