import java.util.Random;
import java.util.Scanner;

public class Exercise5_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int difficultyLevel = 0;
        int problemType = 0;

        // Get difficulty level from user
        System.out.print("Enter difficulty level (1 for single-digit numbers, 2 for two-digit numbers, etc.): ");
        difficultyLevel = scanner.nextInt();

        // Validate difficulty level
        while (difficultyLevel < 1) {
            System.out.println("Difficulty level must be 1 or greater. Please try again.");
            System.out.print("Enter difficulty level (1 for single-digit numbers, 2 for two-digit numbers, etc.): ");
            difficultyLevel = scanner.nextInt();
        }

        // Get problem type from user
        System.out.println("Choose a problem type:");
        System.out.println("1. Addition problems only");
        System.out.println("2. Subtraction problems only");
        System.out.println("3. Multiplication problems only");
        System.out.println("4. Division problems only");
        System.out.println("5. Random mixture of all types");
        System.out.print("Enter problem type (1, 2, 3, 4 or 5): ");
        problemType = scanner.nextInt();

        // Validate problem type
        while (problemType < 1 || problemType > 5) {
            System.out.println("Problem type must be 1, 2, 3, 4 or 5. Please try again.");
            System.out.println("Choose a problem type:");
            System.out.println("1. Addition problems only");
            System.out.println("2. Subtraction problems only");
            System.out.println("3. Multiplication problems only");
            System.out.println("4. Division problems only");
            System.out.println("5. Random mixture of all types");
            System.out.print("Enter problem type (1, 2, 3, 4 or 5): ");
            problemType = scanner.nextInt();
        }

        // Loop until user chooses to quit
        while (true) {
            // Generate problem
            int num1 = generateNumber(difficultyLevel, random);
            int num2 = generateNumber(difficultyLevel, random);
            int num3 = generateNumber(difficultyLevel, random);

            // Determine problem type based on user's choice
            int result = 0;
            switch (problemType) {
                case 1: // Addition
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " =?");
                    break;
                case 2: // Subtraction
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " =?");
                    break;
                case 3: // Multiplication
                    result = num1 * num2;
                    System.out.println(num1 + " × " + num2 + " =?");
                    break;
                case 4: // Division
                    if (num2!= 0) {
                        result = num1 / num2;
                        System.out.println(num1 + " ÷ " + num2 + " =?");
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    break;
                case 5: // Random mixture
                    int operation = random.nextInt(4);
                    switch (operation) {
                        case 0: // Addition
                            result = num1 + num2;
                            System.out.println(num1 + " + " + num2 + " =?");
                            break;
                        case 1: // Subtraction
                            result = num1 - num2;
                            System.out.println(num1 + " - " + num2 + " =?");
                            break;
                        case 2: // Multiplication
                            result = num1 * num2;
                            System.out.println(num1 + " × " + num2 + " =?");
                            break;
                        case 3: // Division
                            if (num2!= 0) {
                                result = num1 / num2;
                                System.out.println(num1 + " ÷ " + num2 + " =?");
                            } else {
                                System.out.println("Error: Division by zero is not allowed.");
                                continue;
                            }
                            break;
                    }
                    break;
            }

            // Get user's answer
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            // Check if user's answer is correct
            if (userAnswer == result) {
                System.out.println("Correct!");
            } else {
                System.out.println("Sorry, that's incorrect. The correct answer is " + result + ".");
            }

            // Ask user if they want to continue
            System.out.print("Do you want to continue? (yes/no): ");
            String response = scanner.next().toLowerCase();
            if (!response.equals("yes")) {
                break;
            }
        }

        scanner.close();
    }

    private static int generateNumber(int difficultyLevel, Random random) {
        int maxNum = (int) Math.pow(10, difficultyLevel);
        return random.nextInt(maxNum);
    }
}
