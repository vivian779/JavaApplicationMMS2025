import java.util.Scanner;

public class Exercise3_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input current world population
        System.out.print("Enter current world population: ");
        double currentPopulation = scanner.nextDouble();

        // Input annual growth rate (percentage)
        System.out.print("Enter annual growth rate (percentage, e.g., 1.2): ");
        double growthRatePercent = scanner.nextDouble();

        // Convert percentage to decimal
        double growthRate = growthRatePercent / 100.0;

        double population = currentPopulation;
        double doublePopulation = currentPopulation * 2;

        int yearOfDoubling = -1;

        System.out.println("\nYear\tPopulation\tIncrease");
        for (int year = 1; year <= 75; year++) {
            double previousPopulation = population;
            // Calculate next year's population
            population += population * growthRate;
            double increase = population - previousPopulation;

            // Print the table row
            System.out.printf("%d\t%.0f\t\t%.0f\n", year, population, increase);

            // Check if population has doubled
            if (population >= doublePopulation && yearOfDoubling == -1) {
                yearOfDoubling = year;
            }
        }

        if (yearOfDoubling != -1) {
            System.out.println("\nThe population will double in year: " + yearOfDoubling);
        } 
		else {
            System.out.println("\nThe population does not double within 75 years at this growth rate.");
        }
    }
}