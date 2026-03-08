 import java.util.Scanner;

public class Exercise4_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Number of inputs must be positive.");
            return;
        }

        System.out.print("Enter number 1: ");
        int smallest = scanner.nextInt();

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int current = scanner.nextInt();
            if (current < smallest) {
                smallest = current;
            }
        }

        System.out.println("The smallest value is: " + smallest);
        scanner.close();
    }
}
 