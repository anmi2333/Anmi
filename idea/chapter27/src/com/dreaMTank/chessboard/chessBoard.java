package com.dreaMTank.chessboard;

import java.util.Arrays;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
@SuppressWarnings("all")
public class chessBoard {
    public static void main(String[] args) {
        //Arrays[][] map = {
        // {0,0,0,0,0,0,0,0},
        // {0,0,0,0,0,0,0,0},
        // {0,0,0,6,0,6,0,0},
        // {0,0,6,0,0,0,6,0},
        // {0,0,0,0,1,0,0,0},
        // {0,0,6,0,0,0,6,0},
        // {0,0,0,6,0,6,0,0},
        // {0,0,0,0,0,0,0,0}
        // };
        // 创建一个8x8的二维数组
        int[][] twoDimensionalArray = new int[8][8];
        //int [i][j] ran = 1;//初始位置

        //[a - 2][b - 1] [a - 1][b - 2]
        //[a + 2][b + 1] [a + 1][b + 2]
        int i = 0;
        int j = 0;
        int a = 7;
        int b = 7;
        // 打印数组
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                twoDimensionalArray[i][j] = 0;
                System.out.print(twoDimensionalArray[i][j] + "\t");
                }
                System.out.println();
            }

        System.out.println("========初始化========");

        twoDimensionalArray[a][b] = 1;
        for (int k = 0; k < 10; k++) {
        if (twoDimensionalArray[a][b] == 1 || a >= 0 || b >= 0) {//1
                twoDimensionalArray[a - 2][b - 1] = 1;

            } else if (twoDimensionalArray[a - 2][b - 1] == 1 || a - 2 >= 0 || b - 1 >= 0
            || a - 2 <= 7 || b - 1 <= 8) {//2
                twoDimensionalArray[a - 1][b - 2] = 1;

            } else if (twoDimensionalArray[a - 1][b - 2] == 1 || a - 1 >= 0 || b - 2 >= 0
                || a - 1 <= 7 || b - 2 <= 8) {//3
                twoDimensionalArray[a + 2][b + 1] = 1;

            } else if (twoDimensionalArray[a + 2][b + 1] == 1 || a + 2 >= 0 || b + 1 >= 0
                || a + 2 <= 7 || b + 1 <= 8) {//4
                twoDimensionalArray[a + 1][b + 2] = 1;
            } else {
                System.out.println("游戏结束");
            }
        }

        System.out.println("========计算后========");

        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                System.out.print(twoDimensionalArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
