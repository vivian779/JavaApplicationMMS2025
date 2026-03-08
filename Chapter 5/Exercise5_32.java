 import java.util.Scanner;

public class Exercise5_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x1:");
        double x1 = scanner.nextDouble();

        System.out.println("Enter y1:");
        double y1 = scanner.nextDouble();

        System.out.println("Enter x2:");
        double x2 = scanner.nextDouble();

        System.out.println("Enter y2:");
        double y2 = scanner.nextDouble();

        double distance = distance(x1, y1, x2, y2);
        System.out.printf("Distance between (%.2f, %.2f) and (%.2f, %.2f) is %.4f%n",
                x1, y1, x2, y2, distance);

        scanner.close();
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}