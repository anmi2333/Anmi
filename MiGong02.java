public class MiGong02 {
    private static final int ROWS = 8;
    private static final int COLS = 8;

    private int[][] maze = {
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 0, 1, 0, 1},
            {1, 0, 0, 1, 0, 1, 0, 1},
            {1, 0, 1, 1, 0, 1, 0, 1},
            {1, 0, 1, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1}
    };

    private int[][] solution = new int[ROWS][COLS];

    public void solve() {
        if (solve(1, 1)) {
            printSolution();
        } else {
            System.out.println("No solution.");
        }
    }

    private boolean solve(int row, int col) {
        if (maze[row][col] == 0 && solution[row][col] == 0) {
            solution[row][col] = 1;

            if (row == ROWS - 2 && col == COLS - 2) {
                return true;
            }

            if (solve(row + 1, col)) {
                return true;
            }
            if (solve(row, col + 1)) {
                return true;
            }
            if (solve(row - 1, col)) {
                return true;
            }
            if (solve(row, col - 1)) {
                return true;
            }

            solution[row][col] = 0;
        }
        return false;
    }

    private void printSolution() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (maze[row][col] == 1) {
                    System.out.print("# ");
                } else if (solution[row][col] == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MiGong02 solver = new MiGong02();
        solver.solve();
    }
}
