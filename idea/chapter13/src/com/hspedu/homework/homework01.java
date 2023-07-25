package com.hspedu.homework;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class homework01 {
    public static void main(String[] args) {

        String str = "abcdef";
        System.out.println(str);
        str = reverse(str,1,4);
        System.out.println(str);

    }
        /**
         *1 方法
         *2 思路 把String转成 char[] .因为 char[]的元素可以交换
         *3
         * */
     public static String reverse(String str, int start , int end) {


         char[] chars = str.toCharArray();
         char temp = ' ';//辅助交换变量
         for(int i = start, j = end; i < j; i++, j--) {
                temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
         }
         return new String(chars);
     }

}
