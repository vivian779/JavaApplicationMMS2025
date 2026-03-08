 import java.util.Scanner;

public class Exercise5_28{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student average: ");
        double average = scanner.nextDouble();
        int points = qualityPoints(average);
        System.out.println("Quality points: " + points);
        scanner.close();
    }

    public static int qualityPoints(double average) {
        if (average >= 90 && average <= 100) {
            return 4;
        } else if (average >= 80 && average < 90) {
            return 3;
        } else if (average >= 70 && average < 80) {
            return 2;
        } else if (average >= 60 && average < 70) {
            return 1;
        } else {
            return 0;
        }
    }
}
