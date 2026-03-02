import java.util.Scanner;

public class Exercise3_20 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.println("Employee " + i);

            System.out.print("Enter hours worked: ");
            double hours = input.nextDouble();

            System.out.print("Enter hourly rate: ");
            double rate = input.nextDouble();

            double grossPay;

            if (hours <= 40) {
                grossPay = hours * rate;
            } else {
                grossPay = (40 * rate) + ((hours - 40) * rate * 1.5);
            }

            System.out.println("Gross pay: $" + grossPay);
            System.out.println();
        }

        input.close();
    }
}