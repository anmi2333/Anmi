package com.hspedu;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Jige02 {
    public static void main(String[] args) {


        for (int i = 1; i < 10; i++) {
            String loop = "";
            for (int j = 1;j <= i;j++ ) {
                loop += j + "*" + i + "=" + (i*j) + "\t";
            }
            System.out.println(loop);
        }
    }
}

