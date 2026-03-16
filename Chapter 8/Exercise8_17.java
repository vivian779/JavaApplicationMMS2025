public class Exercise8_17 {

    enum Cell { X, O, EMPTY }

    private Cell[][] board = new Cell[3][3];

    public TicTacToe() {

        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                board[i][j] = Cell.EMPTY;
    }

    public void makeMove(int row,int col,Cell player) {

        if(board[row][col] == Cell.EMPTY)
            board[row][col] = player;
    }
}