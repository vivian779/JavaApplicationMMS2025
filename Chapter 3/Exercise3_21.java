import java.util.Scanner;

public class Exercise3_21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int largest;

        // Input first number
        System.out.print("Enter integer 1: ");
        largest = input.nextInt();

        // Process remaining 9 numbers
        while (counter < 10) {

            System.out.print("Enter integer " + (counter + 1) + ": ");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.println("The largest number is: " + largest);

        input.close();
    }
}