 import java.util.Random;

public class Exercise6_25 {
    static int[] board = new int[8];
    static Random rand = new Random();

    public static void main(String[] args) {

        while (!placeQueens()) {
            // try again if failed
        }

        printBoard();
    }

    static boolean placeQueens() {
        for (int i = 0; i < 8; i++) {
            board[i] = rand.nextInt(8);

            for (int j = 0; j < i; j++) {
                if (board[i] == board[j] ||
                    Math.abs(board[i] - board[j]) == Math.abs(i - j)) {
                    return false;
                }
            }
        }
        return true;
    }

    static void printBoard() {
        for (int i = 0; i < 8; i++)
            System.out.println("Row " + i + " Column " + board[i]);
    }
}
 
