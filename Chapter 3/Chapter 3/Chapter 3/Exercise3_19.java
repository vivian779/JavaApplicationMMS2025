import java.util.Scanner;

public class Exercise3_19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalSales = 0.0;
        double itemValue;

        System.out.println("Enter value of items sold (Enter 0 to finish): ");
        itemValue = input.nextDouble();

        while (itemValue != 0) {
            totalSales = totalSales + itemValue;

            System.out.print("Enter next item value (0 to finish): ");
            itemValue = input.nextDouble();
        }

        double earnings = 200 + (0.09 * totalSales);

        System.out.println("\nTotal Sales: $" + totalSales);
        System.out.println("Weekly Earnings: $" + earnings);

        input.close();
    }
}