package com.hspedu.exception_;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        //解读
        //1. num1 / num2 => 10 / 0
        //2. 当执行到 num1 / num2 因为 num2 = 0, 程序就会出现(抛出)异常 ArithmeticException
        //3.
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.printf(e.getMessage());//输出异常信息
        }
        System.out.println("程序继续运行...");
    }
}
