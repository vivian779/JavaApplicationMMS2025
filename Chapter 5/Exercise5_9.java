 import java.util.Scanner;

public class Exercise5_9  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        do {
            System.out.print("Enter a number: ");
            double x = scanner.nextDouble();

            int rounded = (int) Math.floor(x + 0.5);

            System.out.printf("Original number: %.2f%n", x);
            System.out.printf("Rounded number: %d%n", rounded);

            System.out.print("Process another number? (yes/no): ");
            continueInput = scanner.next();

        } while (continueInput.equalsIgnoreCase("yes"));

        scanner.close();
    }
}
 