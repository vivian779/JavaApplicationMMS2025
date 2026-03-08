 import java.security.SecureRandom;
 import java.util.Scanner;

public class Exercise5_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        while (true) { // Loop to allow multiple students
            int correctCount = 0;
            int totalResponses = 0;

            System.out.println("Let's practice multiplication! Answer 10 questions.");

            generateQuestion(random);

            while (totalResponses < 10) {
                int answer = scanner.nextInt();
                int correctAnswer = currentNum1 * currentNum2;
                totalResponses++;

                if (answer == correctAnswer) {
                    correctCount++;
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
                } else {
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
                if (totalResponses < 10) {
                    generateQuestion(random);
                }
            }

            // After 10 responses, evaluate performance
            double percentageCorrect = (correctCount / 10.0) * 100;

            if (percentageCorrect >= 75) {
                System.out.println("Congratulations, you are ready to go to the next level!");
            } else {
                System.out.println("Please ask your teacher for extra help.");
            }

            System.out.println(); // Blank line before next student
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
 