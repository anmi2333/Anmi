package com.hspedu;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Cpu {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        int cpuNums = runtime.availableProcessors();
        System.out.println("当前电脑有cpu 个数=" + cpuNums);
    }
}
