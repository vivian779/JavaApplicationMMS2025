import java.util.Scanner;

public class Exercise3_18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter account number (or -1 to quit): ");
            int accountNumber = scanner.nextInt();

            if (accountNumber == -1) {
                break;
            }

            System.out.print("Enter beginning balance: ");
            int beginningBalance = scanner.nextInt();

            System.out.print("Enter total charges: ");
            int charges = scanner.nextInt();

            System.out.print("Enter total credits: ");
            int credits = scanner.nextInt();

            System.out.print("Enter credit limit: ");
            int creditLimit = scanner.nextInt();

            int newBalance = beginningBalance + charges - credits;

            System.out.println("New balance: " + newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }

            System.out.println();
        }

        scanner.close();
    }
}