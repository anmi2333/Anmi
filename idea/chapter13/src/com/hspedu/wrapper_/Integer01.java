package com.hspedu.wrapper_;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Integer01 {
    public static void main(String[] args) {
        //演示int <--> Integer 的装箱和拆箱
        //jdk5前是手动装箱和拆箱
        //手动装箱
        int n1 = 100;
      //  Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //手动拆箱
        //Integer -> int
        //int i = integer.intValue();
    }
}
