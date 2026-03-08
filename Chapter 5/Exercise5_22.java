 public class Exercise5_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Menu:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            int fahrenheitTemp = scanner.nextInt();
            System.out.println(fahrenheitTemp + "°F is " + celsius(fahrenheitTemp) + "°C");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
		int celsiusTemp = scanner.nextInt();
		    System.out.println(celsiusTemp + "°C is " + fahrenheitTemp) +  "°F");
		}else{
			System.out.println("Invalid choice.");
		}
	     scanner.close();
	}
	 public static int celsius(int fahrenheit) {
		 return (int) (5.0 / 9.0 * (fahrenheit - 32));
	 }
	 
	 public static int fahrenheit(int celsius){
		 return (int) (9.0 / 5.0 * celsius + 32));
	 
		

		
		}
		
	}
