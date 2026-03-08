 import java.util.Scanner;

public class Exercise5_18{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square: ");
        int side = scanner.nextInt();

        squareOfAsterisks(side);

        scanner.close();
    }

    // Method to display a square of asterisks
    public static void squareOfAsterisks(int side) {
        for (int row = 1; row <= side; row++) {
            for (int col = 1; col <= side; col++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
 