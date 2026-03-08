 import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise5_35{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        System.out.println("Let's practice multiplication!");

        generateQuestion(random);

        while (true) {
            int answer = scanner.nextInt();
            int correctAnswer = currentNum1 * currentNum2;

            if (answer == correctAnswer) {
                System.out.println("Very good!");
                generateQuestion(random);
            } else {
                System.out.println("No. Please try again.");
            }
        }
    }

    static int currentNum1;
    static int currentNum2;

    // Method to generate a new question
    public static void generateQuestion(SecureRandom random) {
        currentNum1 = 1 + random.nextInt(9); // 1-9
        currentNum2 = 1 + random.nextInt(9); // 1-9
        System.out.printf("How much is %d times %d?%n", currentNum1, currentNum2);
    }
}
 
