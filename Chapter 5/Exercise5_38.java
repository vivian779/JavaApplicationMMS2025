 import java.util.Random;
import java.util.Scanner;

public class Exercise5_38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Get difficulty level from user
        System.out.print("Enter difficulty level (1 for single-digit numbers, 2 for two-digit numbers, etc.): ");
        int difficultyLevel = scanner.nextInt();

        // Validate difficulty level
        while (difficultyLevel < 1) {
            System.out.println("Difficulty level must be 1 or greater. Please try again.");
            System.out.print("Enter difficulty level (1 for single-digit numbers, 2 for two-digit numbers, etc.): ");
            difficultyLevel = scanner.nextInt();
        }

        int maxMultiplier = (int) Math.pow(10, difficultyLevel) - 1;

        while (true) {
            // Generate two random numbers
            int multiplier = random.nextInt(maxMultiplier + 1);
            int multiplicand = random.nextInt(maxMultiplier + 1);
            int product = multiplier * multiplicand;

            // Display problem to user
            System.out.println("What is " + multiplier + " x " + multiplicand + "?");

            // Get user's answer
            int userAnswer = scanner.nextInt();

            // Check user's answer
            if (userAnswer == product) {
                System.out.println("Correct!");
            } else {
                System.out.println("Sorry, that's incorrect. The correct answer is " + product);
            }

            // Ask user if they want to continue
            System.out.print("Do you want to continue? (yes/no): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}
