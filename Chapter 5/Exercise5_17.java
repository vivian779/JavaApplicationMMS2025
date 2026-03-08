import java.util.Scanner;

public class Exercise5_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        do {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            if (isEven(number)) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }

            System.out.print("Do you want to check another number? (yes/no): ");
            continueInput = scanner.next();

        } while (continueInput.equalsIgnoreCase("yes"));

        scanner.close();
    }

    // Method to check if number is even
    public static boolean isEven(int number) {
        return (number % 2) == 0;
    }
}