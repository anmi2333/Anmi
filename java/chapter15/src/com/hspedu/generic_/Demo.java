package com.hspedu.generic_;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        String loop = "";
           for (int i = 1; i < 5; i++) {

               for (int j = 1; j <= i; j++) {
                   loop += "*" + "\t";
               }
               System.out.println(loop);
           }

//        for (int i = 1 ;i <= 5; i++) {
//            String loop = "";
//            for (int j = 1; j <= i; j++) {
//                loop += "*" + "\t";
//                }
//            System.out.println(loop);
//        }
//
//        for (int i = 1 ;i <= 10; i++) {
//            String loop = "";
//            for (int j = 10; j <= i; j--) {
//                loop += "*" + "\t";
//            }
//            System.out.println(loop);
//        }

//        int loop = 5;
//        for (int i = 1; i <= loop; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//        for (int i = loop; i >= 0 ; i--) {
//            for (int j = 1; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
       }
    }

