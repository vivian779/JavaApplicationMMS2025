import java.util.Scanner;

public class Exercise6_19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[][] sales = new double[5][4];

        System.out.println("Enter sales data (-1 to stop)");

        while (true) {

            System.out.print("Salesperson (1-4): ");
            int person = input.nextInt();

            if (person == -1)
                break;

            System.out.print("Product (1-5): ");
            int product = input.nextInt();

            System.out.print("Amount: ");
            double amount = input.nextDouble();

            sales[product - 1][person - 1] += amount;
        }

        System.out.println("\nSales Table");

        for (int product = 0; product < 5; product++) {

            double rowTotal = 0;

            for (int person = 0; person < 4; person++) {

                System.out.printf("%8.2f", sales[product][person]);
                rowTotal += sales[product][person];
            }

            System.out.printf(" | %8.2f\n", rowTotal);
        }
    }
}