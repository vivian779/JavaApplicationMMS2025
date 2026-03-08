import java.util.Random;
import java.util.Scanner;

public class Exercise5_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        boolean playAgain;

        do {
            int numberToGuess = rand.nextInt(1000) + 1;
            System.out.println("Guess a number between 1 and 1000:");

            while (true) {
                int guess = scanner.nextInt();

                if (guess == numberToGuess) {
                    System.out.println("Congratulations. You guessed the number!");
                    break;
                } else if (guess > numberToGuess) {
                    System.out.println("Too high. Try again:");
                } else {
                    System.out.println("Too low. Try again:");
                }
            }

            System.out.println("Play again? (yes/no):");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");

        } while (playAgain);

        scanner.close();
    }
}
 
