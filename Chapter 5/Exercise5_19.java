import java.util.Scanner;

public class Exercise5_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the square: ");
        int side = input.nextInt();

        System.out.print("Enter the character to fill the square: ");
        char fillCharacter = input.next().charAt(0);

        squareOfCharacter(side, fillCharacter);

        input.close();
    }

    // Method to display a square of specified character
    public static void squareOfCharacter(int side, char fillCharacter) {
        for (int row = 1; row <= side; row++) {
            for (int col = 1; col <= side; col++) {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }
}
 