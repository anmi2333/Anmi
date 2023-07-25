package com.dreaMTank.reflection;

import com.dreaMTank.Cat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Reflection02 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        m1();
        m2();
    }
    public static void m1() {
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i <  90000000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法m1调用hi 耗时" + (end - start));
    }

    public static void m2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("com.dreaMTank.Cat");//1
        Object o = cls.newInstance();//2
        Method hi = cls.getMethod("hi");//3
        long start = System.currentTimeMillis();
        for (int i = 0; i <  90000000; i++) {
            hi.invoke(o);//4
        }
        long end = System.currentTimeMillis();
        System.out.println("反射方法m2调用hi 耗时" + (end - start));
    }
}
