 import java.util.Scanner;

public class Exercise5_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read side lengths from user
        System.out.print("Enter length of side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter length of side 2: ");
        double side2 = scanner.nextDouble();

        // Calculate hypotenuse
        double hypotenuse = hypotenuse(side1, side2);
        System.out.printf("The hypotenuse is: %.2f%n", hypotenuse);

        scanner.close();
    }

    // Method to calculate hypotenuse
    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        // Alternatively, could use Math.hypot(side1, side2)
    }
}
 