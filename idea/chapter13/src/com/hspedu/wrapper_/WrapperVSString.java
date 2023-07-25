package com.hspedu.wrapper_;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class WrapperVSString {
    public static void main(String[] args) {
        //包装类
        Integer i = 100;//自动装箱
        //方式1
        String str1 = i + "";
        //2
        String str2 = i.toString();
        //3
        String str3 = String.valueOf(i);
        //String -> 包装类(Integer)
        String str4 = "12345";
        Integer i2 = Integer.parseInt(str4);//使用到自动装箱
        //Integer integer = new Integer(str4);
        //构造器
    }
}
