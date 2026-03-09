 public class Exercise6_26 {

    static int[] rowMove = {-2,-1,1,2,2,1,-1,-2};
    static int[] colMove = {1,2,2,1,-1,-2,-2,-1};

    static int startRow = 0;
    static int startCol = 0;

    public static boolean isClosedTour(int currentRow, int currentCol) {

        for(int i = 0; i < 8; i++) {

            int nextRow = currentRow + rowMove[i];
            int nextCol = currentCol + colMove[i];

            if(nextRow == startRow && nextCol == startCol) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int lastRow = 5; 
        int lastCol = 2; 

        if(isClosedTour(lastRow, lastCol))
            System.out.println("Closed Tour");
        else
            System.out.println("Open Tour");
    }
}

