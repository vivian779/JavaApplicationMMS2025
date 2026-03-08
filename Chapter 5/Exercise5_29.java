  import java.util.Random;
 import java.util.Scanner;

public class Exercise5_29 {
    enum Coin { HEADS, TAILS }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int headsCount = 0;
        int tailsCount = 0;

        while (true) {
            System.out.println("Choose an option: 1. Toss Coin 2. Exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                Coin result = flip(rand);
                if (result == Coin.HEADS) {
                    System.out.println("It's Heads!");
                    headsCount++;
                } else {
                    System.out.println("It's Tails!");
                    tailsCount++;
                }
            } else if (choice == 2) {
                System.out.println("Results:");
                System.out.println("Heads: " + headsCount);
                System.out.println("Tails: " + tailsCount);
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }

    public static Coin flip(Random rand) {
        return rand.nextBoolean() ? Coin.HEADS : Coin.TAILS;
    }
}

