 import java.util.Scanner;

public class Exercise5_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double number = scanner.nextDouble();

        System.out.printf("Original value: %.6f%n", number);
        System.out.printf("Rounded to integer: %d%n", roundToInteger(number));
        System.out.printf("Rounded to tenths: %.1f%n", roundToTenths(number));
        System.out.printf("Rounded to hundredths: %.2f%n", roundToHundredths(number));
        System.out.printf("Rounded to thousandths: %.3f%n", roundToThousandths(number));

        scanner.close();
    }

    public static int roundToInteger(double x) {
        return (int) Math.floor(x + 0.5);
    }

    public static double roundToTenths(double x) {
        return Math.floor(x * 10 + 0.5) / 10;
    }

    public static double roundToHundredths(double x) {
        return Math.floor(x * 100 + 0.5) / 100;
    }

    public static double roundToThousandths(double x) {
        return Math.floor(x * 1000 + 0.5) / 1000;
    }
}
 