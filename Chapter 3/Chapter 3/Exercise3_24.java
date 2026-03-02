import java.util.Scanner;

public class Exercise3_24 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;

        System.out.print("Enter 1 or 2: ");
        choice = input.nextInt();

        while (choice != 1 && choice != 2) {
            System.out.println("Invalid input. Please enter 1 or 2.");
            System.out.print("Enter 1 or 2: ");
            choice = input.nextInt();
        }

        System.out.println("You entered valid input: " + choice);

        input.close();
    }
}