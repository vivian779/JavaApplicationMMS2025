import java.util.Scanner;

public class Exercise6_33{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Topics array - replace with causes important to you
        String[] topics = {
            "Climate Change",
            "Education Reform",
            "Healthcare Access",
            "Animal Welfare",
            "Human Rights"
        };

        int[][] responses = new int[topics.length][10]; // 5 topics x 10 ratings
        int numberOfRespondents;

        System.out.print("Enter number of respondents: ");
        numberOfRespondents = input.nextInt();

        // Collect responses
        for (int r = 0; r < numberOfRespondents; r++) {
            System.out.println("\nRespondent #" + (r + 1));
            for (int t = 0; t < topics.length; t++) {
                int rating;
                do {
                    System.out.print("Rate \"" + topics[t] + "\" (1-10): ");
                    rating = input.nextInt();
                } while (rating < 1 || rating > 10);

                responses[t][rating - 1]++; // Store response in column 0-9
            }
        }

        // Display tabular report
        System.out.println("\n\nSurvey Summary:");
        System.out.print(String.format("%-20s", "Topic"));
        for (int i = 1; i <= 10; i++)
            System.out.print(String.format("%4d", i));
        System.out.println("   Avg");

        double[] averages = new double[topics.length];
        int[] totals = new int[topics.length];

        for (int t = 0; t < topics.length; t++) {
            System.out.print(String.format("%-20s", topics[t]));
            int sum = 0;
            int count = 0;

            for (int r = 0; r < 10; r++) {
                System.out.print(String.format("%4d", responses[t][r]));
                sum += (r + 1) * responses[t][r]; // Multiply rating by frequency
                count += responses[t][r];
            }

            double avg = (count == 0) ? 0 : (double) sum / count;
            averages[t] = avg;
            totals[t] = sum;
            System.out.printf("%7.2f\n", avg);
        }

        // Find highest and lowest point totals
        int highestIndex = 0;
        int lowestIndex = 0;

        for (int i = 1; i < topics.length; i++) {
            if (totals[i] > totals[highestIndex])
                highestIndex = i;
            if (totals[i] < totals[lowestIndex])
                lowestIndex = i;
        }

        System.out.println("\nHighest point total: " + topics[highestIndex] + " = " + totals[highestIndex]);
        System.out.println("Lowest point total: " + topics[lowestIndex] + " = " + totals[lowestIndex]);
    }
}
