//Exercise 2.15
import java.util.Scanner;

public class ArithemeticOperations{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Enter first integer: ");
		num1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		num2 = input.nextInt();
		
		System.out.printf("Sum = %d%n", (num1 + num2));
		System.out.printf("Prodect = %d%n", (num1 * num2));
		System.out.printf("Difference = %d%n", (num1 - num2));
		System.out.printf("Quotine = %d%n", (num1 / num2));
		
		input.close();
		
		
	}
} 