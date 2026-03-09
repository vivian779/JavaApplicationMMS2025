public class Exercise6_21 {

    public static void main(String[] args) {

        int[][] board = new int[8][8];

        int[] horizontal = {2,1,-1,-2,-2,-1,1,2};
        int[] vertical   = {-1,-2,-2,-1,1,2,2,1};

        int currentRow = 0;
        int currentColumn = 0;

        board[currentRow][currentColumn] = 1;

        int moveCount = 2;

        while(moveCount <= 64) {

            boolean moved = false;

            for(int move=0; move<8; move++) {

                int newRow = currentRow + vertical[move];
                int newColumn = currentColumn + horizontal[move];

                if(newRow >= 0 && newRow < 8 &&
                   newColumn >= 0 && newColumn < 8 &&
                   board[newRow][newColumn] == 0) {

                    currentRow = newRow;
                    currentColumn = newColumn;

                    board[currentRow][currentColumn] = moveCount;

                    moveCount++;
                    moved = true;
                    break;
                }
            }

            if(!moved)
                break;
        }

        for(int r=0; r<8; r++) {
            for(int c=0; c<8; c++) {
                System.out.printf("%3d ", board[r][c]);
            }
            System.out.println();
        }

        System.out.println("Total moves: " + (moveCount-1));
    }
}