 import java.util.Random;

public class Exercise6_28 {

    public static void main(String[] args) {

        Random rand = new Random();

        int tortoise = 1;
        int hare = 1;

        System.out.println("BANG !!!!!");
        System.out.println("AND THEY'RE OFF !!!!!");

        while (tortoise < 70 && hare < 70) {

            int i = rand.nextInt(10) + 1;

            // Tortoise move
            if (i <= 5)
                tortoise += 3;
            else if (i <= 7)
                tortoise -= 6;
            else
                tortoise += 1;

            if (tortoise < 1)
                tortoise = 1;

            // Hare move
            int j = rand.nextInt(10) + 1;

            if (j <= 2)
                hare += 0;
            else if (j <= 4)
                hare += 9;
            else if (j == 5)
                hare -= 12;
            else if (j <= 8)
                hare += 1;
            else
                hare -= 2;

            if (hare < 1)
                hare = 1;

            // Display race track
            for (int k = 1; k <= 70; k++) {

                if (k == tortoise && k == hare)
                    System.out.print("OUCH!!!");
                else if (k == tortoise)
                    System.out.print("T");
                else if (k == hare)
                    System.out.print("H");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        // Winner
        if (tortoise >= 70 && hare >= 70)
            System.out.println("It's a tie.");
        else if (tortoise >= 70)
            System.out.println("TORTOISE WINS!!! YAY!!!");
        else
            System.out.println("Hare wins. Yuch.");
    }
}
 
