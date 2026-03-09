import java.util.Random;

public class Exercise6_22 {

    public static void main(String[] args) {

        int[][] board = new int[8][8];

        int[] horizontal = {2,1,-1,-2,-2,-1,1,2};
        int[] vertical   = {-1,-2,-2,-1,1,2,2,1};

        Random random = new Random();

        int row = 0;
        int col = 0;

        board[row][col] = 1;

        int move = 2;

        while(move <= 64) {

            int moveNumber = random.nextInt(8);

            int newRow = row + vertical[moveNumber];
            int newCol = col + horizontal[moveNumber];

            if(newRow >=0 && newRow <8 &&
               newCol >=0 && newCol <8 &&
               board[newRow][newCol] == 0) {

                row = newRow;
                col = newCol;

                board[row][col] = move;
                move++;
            }
        }

        for(int r=0;r<8;r++) {
            for(int c=0;c<8;c++)
                System.out.printf("%3d",board[r][c]);
            System.out.println();
        }

        System.out.println("Tour length: " + (move-1));
    }
}