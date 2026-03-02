public class Exercise3_25 {
    public static void main(String[] args) {
        // Pattern size: 8 rows and 8 columns
        for (int row = 1; row <= 8; row++) {
            for (int col = 1; col <= 8; col++) {
                // Alternate between asterisk and space
                if ((row + col) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Newline at the end of each row
        }
    }
}