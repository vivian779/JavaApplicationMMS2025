
 import java.util.Random;
import java.util.Scanner;

public class Exercise5_31{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        boolean playAgain;

        do {
            int numberToGuess = rand.nextInt(1000) + 1;
            int guessCount = 0;

            System.out.println("Guess a number between 1 and 1000:");

            while (true) {
                int guess = scanner.nextInt();
                guessCount++;

                if (guess == numberToGuess) {
                    System.out.println("Congratulations. You guessed the number!");

                    if (guessCount <= 10) {
                        System.out.println("Either you know the secret or you got lucky!");
                    } else if (guessCount == 10) {
                        System.out.println("Aha! You know the secret!");
                    } else {
                        System.out.println("You should be able to do better!");
                    }
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
 
		