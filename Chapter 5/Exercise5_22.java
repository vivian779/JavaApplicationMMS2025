 import java.util.Scanner;

public class Exercise5_22  {

    // Method to convert Fahrenheit to Celsius
    public static int celsius(int fahrenheit) {
        return (int) ((5.0 / 9.0) * (fahrenheit - 32));
    }

    // Method to convert Celsius to Fahrenheit
    public static int fahrenheit(int celsius) {
        return (int) ((9.0 / 5.0) * celsius + 32);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.println("Enter 1 to convert Fahrenheit to Celsius");
        System.out.println("Enter 2 to convert Celsius to Fahrenheit");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter Fahrenheit temperature: ");
            int fahrTemp = scanner.nextInt();
            int celsiusTemp = celsius(fahrTemp);
            System.out.println(fahrTemp + "°F is approximately " + celsiusTemp + "°C");
        } else if (choice == 2) {
            System.out.print("Enter Celsius temperature: ");
            int celsiusTemp = scanner.nextInt();
            int fahrenTemp = fahrenheit(celsiusTemp);
            System.out.println(celsiusTemp + "°C is approximately " + fahrenTemp + "°F");
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
