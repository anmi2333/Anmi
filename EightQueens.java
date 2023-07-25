public class EightQueens {
    private int[] rows = new int[8];

    public void placeQueens() {
        placeQueens(0);
    }

    private void placeQueens(int row) {
        if (row == 8) {
            printQueens();
            return;
        }

        for (int col = 0; col < 8; col++) {
            if (isValid(row, col)) {
                rows[row] = col;
                placeQueens(row + 1);
            }
        }
    }

    private boolean isValid(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (rows[i] == col || Math.abs(rows[i] - col) == row - i) {
                return false;
            }
        }
        return true;
    }

    private void printQueens() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (rows[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        EightQueens solver = new EightQueens();
        solver.placeQueens();
    }
}
