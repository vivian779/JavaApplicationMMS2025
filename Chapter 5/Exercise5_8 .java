 import java.util.Scanner;
 
public class Exercise5_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalReceipts = 0.0;
        String continueInput;

        do {
            System.out.print("Enter hours parked for the customer: ");
            double hours = scanner.nextDouble();

            double charge = calculateCharges(hours);
            totalReceipts += charge;

            System.out.printf("Charge for this customer: $%.2f%n", charge);
            System.out.printf("Total receipts so far: $%.2f%n", totalReceipts);

            System.out.print("Enter another customer? (yes/no): ");
            continueInput = scanner.next();

        } while (continueInput.equalsIgnoreCase("yes"));
		
		System.out.printf("Total receipts for the day: $%.2f%n", totalReceipts);
        scanner.close();
    }

    public static double calculateCharges(double hours) {
        double charge = 2.00; // base fee
        if (hours > 3) {
            double extraHours = hours - 3;
            // charge $0.50 for each hour or part thereof
            charge += Math.ceil(extraHours * 2) * 0.25; // because 0.50 per hour, so 0.25 per half-hour
        }
        if (charge > 10.00) {
            charge = 10.00; // maximum charge
        }
        return charge;
    }
}
