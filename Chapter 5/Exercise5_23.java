 import java.util.Scanner;

public class Exercise5_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three floating-point numbers:");
        System.out.print("Number 1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Number 2: ");
        double num2 = scanner.nextDouble();
        System.out.print("Number 3: ");
        double num3 = scanner.nextDouble();

        double min = minimum3(num1, num2, num3);
        System.out.println("The smallest value is: " + min);

        scanner.close();
    }

    public static double minimum3(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }
}
 
