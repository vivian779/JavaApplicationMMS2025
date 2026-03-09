import java.util.Scanner;

public class Exercise6_29 {

    // Part (a) - using int
    public static int fibonacciInt(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    // Part (c) - using double
    public static double fibonacciDouble(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        double a = 0, b = 1, c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.println("Fibonacci using int: " + fibonacciInt(n));
        System.out.println("Fibonacci using double: " + fibonacciDouble(n));
    }
}
 
