import java.util.Random;
import java.util.Scanner;

public class Exercise5_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int bankBalance = 1000;

        System.out.println("Welcome to Craps!");

        boolean continuePlaying = true;

        while (bankBalance > 0 && continuePlaying) {
            System.out.println("Your current bank balance is $" + bankBalance);
            int wager = 0;

            // Prompt for a valid wager
            do {
                System.out.println("Enter your wager:");
                wager = scanner.nextInt();
                if (wager > bankBalance || wager <= 0) {
                    System.out.println("Invalid wager. Please enter a wager less than or equal to your current balance.");
                }
            } while (wager > bankBalance || wager <= 0);

            // Chat message before game
            chatter();

            boolean playerWins = playCraps(rand);

            if (playerWins) {
                bankBalance += wager;
                System.out.println("You win! Your new balance is $" + bankBalance);
                // Additional chatter if up big
                if (bankBalance > 1500) {
                    System.out.println("You're up big. Now's the time to cash in your chips!");
                }
            } else {
                bankBalance -= wager;
                System.out.println("Sorry. You lost. Your new balance is $" + bankBalance);
                if (bankBalance == 0) {
                    System.out.println("Sorry. You busted!");
                } else {
                    // Additional chatter if losing
                    System.out.println("Aw c'mon, take a chance!");
                }
            }

            // Ask if user wants to continue
            if (bankBalance > 0) {
                System.out.println("Do you want to play again? (yes/no)");
                String response = scanner.next();
                continuePlaying = response.equalsIgnoreCase("yes");
            } else {
                continuePlaying = false;
            }
        }

        System.out.println("Thanks for playing!");

        scanner.close();
    }

    // Method to play a game of craps, returns true if player wins
    public static boolean playCraps(Random rand) {
        int sum = rollDice(rand);
        if (sum == 7 || sum == 11) {
            return true;
        } else if (sum == 2 || sum == 3 || sum == 12) {
            return false;
        } else {
            int point = sum;
            while (true) {
                sum = rollDice(rand);
                if (sum == point) {
                    return true;
                } else if (sum == 7) {
                    return false;
                }
            }
        }
    }

    // Method to simulate rolling two dice
    public static int rollDice(Random rand) {
        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        return die1 + die2;
    }

    // Method to display random chatter messages
    public static void chatter() {
        String[] messages = {
            "Oh, you're going for broke, huh?",
            "Aw c'mon, take a chance!",
            "You're up big. Now's the time to cash in your chips!",
            "Feeling lucky today?",
            "Let's see if fortune favors you!"
        };
        Random rand = new Random();
        int index = rand.nextInt(messages.length);
        System.out.println(messages[index]);
    }
}