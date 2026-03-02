 import java.util.Scanner;

public class Exercise3_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;

        while (true) {
            System.out.print("Enter miles driven (or -1 to quit): ");
            int miles = scanner.nextInt();

            if (miles == -1) {
                break; // Exit the loop if user enters -1
            }

            System.out.print("Enter gallons used: ");
            int gallons = scanner.nextInt();

            if (gallons == 0) {
                System.out.println("Gallons used cannot be zero. Please re-enter the trip data.");
                continue; // Skip to the next iteration
            }

            // Calculate miles per gallon for this trip
            double mpg = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", mpg);

            // Update totals
            totalMiles += miles;
            totalGallons += gallons;
            // Calculate and display the overall miles per gallon
            double overallMpg = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon: %.2f%n%n", overallMpg);
        }

        // Final output if no trips were entered
        if (totalGallons == 0) {
            System.out.println("No trip data entered.");
        } else {
            double overallMpg = (double) totalMiles / totalGallons;
            System.out.printf("Total miles driven: %d%n", totalMiles);
            System.out.printf("Total gallons used: %d%n", totalGallons);
            System.out.printf("Overall miles per gallon: %.2f%n", overallMpg);
        }

        scanner.close();
    }
}