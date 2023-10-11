package com.hspedu.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
@SuppressWarnings({"all"})
public class MapExercise {
    public static void main(String[] args) {
        //完成代码
        Map hashMap = new HashMap();
        //添加对象
        hashMap.put(1, new Emp("jack", 30000, 1));
        hashMap.put(2, new Emp("tom", 1000, 2));
        hashMap.put(3, new Emp("milan", 12000, 3));
        //遍历
        //第一种
        Set keySet = hashMap.keySet();
//        for (Object key : keySet) {
//            //先获取工资
////            Emp emp = hashMap.get(key);
////            if (emp.getSal() > 18000) {
////                System.out.printf(emp);
//            }
       // }
        //第二种
//        Set entrySet = hashMap.entrySet();
//        Iterator iterator = entrySet.iterator();
//        while (iterator.hasNext()) {
//            Map.Entry entry = (Map.Entry)iterator.next();
//            Emp emp = (Emp) entry.getValue();
//            if (emp.getSal() > 18000) {
//                System.out.printf(emp);
//            }
//        }

    }
}

class Emp {
    private String name;
    private  double sal;
    private int id;

    public Emp(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}
