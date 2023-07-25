package com.hspedu.math_;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class MathMethod {
    public static void main(String[] args) {

        int b = 1;
        for (int i = 0; i <= 100; i++) {
            double a = Math.random() * 10;
            if (a < 7 && a > 2) {
                System.out.println((int)a);
            }
//            else {
//                System.out.println("非理论第" + b + "次= " + a);
//            }
            b++;
        }
    }
}
