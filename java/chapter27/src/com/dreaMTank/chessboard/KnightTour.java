package com.dreaMTank.chessboard;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class KnightTour {
    private static final int BOARD_SIZE = 8; // 棋盘大小
    private static final int[] MOVE_X = {2, 1, -1, -2, -2, -1, 1, 2}; // 马在x轴方向的可移动步长
    private static final int[] MOVE_Y = {1, 2, 2, 1, -1, -2, -2, -1}; // 马在y轴方向的可移动步长

    private static int[][] board; // 棋盘
    private static int totalVisited; // 已访问的格子数量

    public static void main(String[] args) {
        board = new int[BOARD_SIZE][BOARD_SIZE];
        totalVisited = 0;

        // 从(0, 0)位置开始
        int startX = 0;
        int startY = 0;

        if (solveKnightTour(startX, startY, 1)) {
            printBoard();
        } else {
            System.out.println("未找到解决方案！");
        }
    }

    private static boolean solveKnightTour(int x, int y, int moveNumber) {
        // 记录当前位置已访问
        board[x][y] = moveNumber;
        totalVisited++;

        // 已经遍历了所有格子
        if (totalVisited == BOARD_SIZE * BOARD_SIZE) {
            return true;
        }

        // 尝试下一步的所有移动方向
        for (int i = 0; i < MOVE_X.length; i++) {
            int nextX = x + MOVE_X[i];
            int nextY = y + MOVE_Y[i];

            // 检查下一步是否合法
            if (isValidMove(nextX, nextY) && board[nextX][nextY] == 0) {
                if (solveKnightTour(nextX, nextY, moveNumber + 1)) {
                    return true; // 找到解决方案
                }
            }
        }

        // 回溯，将当前位置标记为未访问
        board[x][y] = 0;
        totalVisited--;

        return false; // 未找到解决方案
    }

    private static boolean isValidMove(int x, int y) {
        return x >= 0 && x < BOARD_SIZE && y >= 0 && y < BOARD_SIZE;
    }

    private static void printBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.printf("%2d ", cell);
            }
            System.out.println();
        }
    }
}

