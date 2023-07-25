package com.hspedu.homework;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        String name = "Han shun Ping";
        printName(name);
    }
    /**
     * 编写方法：完成输出格式要求的字符串
     * */
    public static void printName(String str) {
        if (str == null) {
            System.out.println("str 不能为空");
            return;
        }
        String[] names = str.split(" ");
        if (names.length != 3) {
            System.out.println("输入的字符串格式不对");
            return;
        }
        String format = String.format("%s,%s .%c", names[2], names[0].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
