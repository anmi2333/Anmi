package com.hspedu.list_;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Jige {
    public static void main(String[] args) {
        int tmp = 0;
        int j = 0;
        for (int i = 0; i < 100; i++) {
             j = j + 1;
            tmp += j;
        }

        System.out.println("结果" + tmp);
    }
}
