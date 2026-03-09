 public class Exercise6_24 {
    static final int SIZE = 8;
    static int[] queens = new int[SIZE];

    public static void main(String[] args) {
        solve(0);
        printBoard();
    }

    static boolean solve(int row) {
        if (row == SIZE)
            return true;

        for (int col = 0; col < SIZE; col++) {
            if (isSafe(row, col)) {
                queens[row] = col;
                if (solve(row + 1))
                    return true;
            }
        }
        return false;
    }

    static boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            int qCol = queens[i];
            if (qCol == col || Math.abs(qCol - col) == Math.abs(i - row))
                return false;
        }
        return true;
    }

    static void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (queens[i] == j)
                    System.out.print("Q ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
    }
}
 
 