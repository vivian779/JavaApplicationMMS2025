import java.util.Random;

public class Exercise6_17 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] frequency = new int[13];

        for(int roll = 1; roll <= 36000000; roll++)
        {
            int die1 = 1 + random.nextInt(6);
            int die2 = 1 + random.nextInt(6);

            int sum = die1 + die2;

            frequency[sum]++;
        }

        System.out.println("Sum\tFrequency");

        for(int sum = 2; sum <= 12; sum++)
        {
            System.out.println(sum + "\t" + frequency[sum]);
        }
    }
}