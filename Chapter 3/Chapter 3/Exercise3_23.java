import java.util.Scanner;

public class Exercise3_23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int largest;
        int secondLargest;

        System.out.print("Enter integer 1: ");
        largest = input.nextInt();
        secondLargest = largest;

        while (counter < 10) {

            System.out.print("Enter integer " + (counter + 1) + ": ");
            number = input.nextInt();

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            }
            else if (number > secondLargest) {
                secondLargest = number;
            }

            counter++;
        }

        System.out.println("Largest number is: " + largest);
        System.out.println("Second largest number is: " + secondLargest);

        input.close();
    }
}