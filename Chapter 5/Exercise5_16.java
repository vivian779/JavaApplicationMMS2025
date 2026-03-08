 import java.util.Scanner;

public class Exercise5_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        do {
            System.out.print("Enter the first integer: ");
            int first = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int second = scanner.nextInt();

            if (isMultiple(first, second)) {
                System.out.println(second + " is a multiple of " + first);
            } else {
                System.out.println(second + " is NOT a multiple of " + first);
            }

            System.out.print("Do you want to check another pair? (yes/no): ");
            continueInput = scanner.next();

        } while (continueInput.equalsIgnoreCase("yes"));

        scanner.close();
    }

    // Method to determine if second is a multiple of first
    public static boolean isMultiple(int first, int second) {
        if (first == 0) {
            return false; // Avoid division by zero
        }
        return (second % first) == 0;
    }
}
 