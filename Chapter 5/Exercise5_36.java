 import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise5_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        System.out.println("Let's practice multiplication!");

        generateQuestion(random);

        while (true) {
            int answer = scanner.nextInt();
            int correctAnswer = currentNum1 * currentNum2;

            if (answer == correctAnswer) {
                // Correct response variation
                int responseIndex = 1 + random.nextInt(4); // 1-4
                switch (responseIndex) {
                    case 1:
                        System.out.println("Very good!");
						break;
                    case 2:
                        System.out.println("Excellent!");
                        break;
                    case 3:
                        System.out.println("Nice work!");
                        break;
                    case 4:
                        System.out.println("Keep up the good work!");
                        break;
                }
                generateQuestion(random);
            } else {
                // Incorrect response variation
                int responseIndex = 1 + random.nextInt(5); // 1-5
                switch (responseIndex) {
                    case 1:
                        System.out.println("No. Please try again.");
                        break;
                    case 2:
                        System.out.println("Wrong. Try once more.");
                        break;
                    case 3:
                        System.out.println("Don't give up! No.");
                        break;
                    case 4:
                        System.out.println("Keep trying.");
                        break;
                }
            }
        }
    }

    static int currentNum1;
    static int currentNum2;

    // Method to generate a new question
    public static void generateQuestion(SecureRandom random) {
        currentNum1 = 1 + random.nextInt(9);
        currentNum2 = 1 + random.nextInt(9);
        System.out.printf("How much is %d times %d?%n", currentNum1, currentNum2);
    }
}
          
 