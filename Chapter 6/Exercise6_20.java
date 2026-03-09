public class Exercise6_20 {

    public static void main(String[] args) {

        int[][] floor = new int[20][20];

        boolean penDown = false;

        int row = 0;
        int col = 0;

        int direction = 0; // 0=right,1=down,2=left,3=up

        int[] commands = {
            2,5,12,3,5,12,3,5,12,3,5,12,1,6,9
        };

        int i = 0;

        while(commands[i] != 9) {

            int command = commands[i];

            switch(command) {

                case 1:
                    penDown = false;
                    break;

                case 2:
                    penDown = true;
                    break;

                case 3:
                    direction = (direction + 1) % 4;
                    break;

                case 4:
                    direction = (direction + 3) % 4;
                    break;

                case 5:

                    int move = commands[++i];

                    for(int step=0; step<move; step++) {

                        if(direction == 0) col++;
                        else if(direction == 1) row++;
                        else if(direction == 2) col--;
                        else if(direction == 3) row--;

                        if(penDown)
                            floor[row][col] = 1;
                    }

                    break;

                case 6:
                    displayFloor(floor);
                    break;
            }

            i++;
        }
    }

    public static void displayFloor(int[][] floor) {

        for(int r=0; r<floor.length; r++) {

            for(int c=0; c<floor[r].length; c++) {

                if(floor[r][c] == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}