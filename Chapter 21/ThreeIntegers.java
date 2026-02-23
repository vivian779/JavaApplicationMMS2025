//Exercise 2.17
import java.util.Scanner;

public class ThreeIntegers{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Enter frist integer: ");
		num1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		num2 = input.nextInt();
		
		System.out.print("Enter third integer: ");
		num3 = input.nextInt();
		
		int sum = num1 + num2 + num3;
		int average = sum / 3; // integer division
		int product = num1 * num2 * num3;
		
		int smallest = num1;
		int largest = num1;
		
		if (num2 < smallest) smallest = num2;
		if (num2 > smallest) smallest = num3;
		
		if (num2 < largest) largest = num2;
		if (num2 < largest) largest = num3;
		
		System.out.printf("Sum = %d%n", sum);
		System.out.printf("average = %d%n", average);
		System.out.printf("product = %d%n", product);
		System.out.printf("smallest = %d%n", smallest);
		System.out.printf("largest = %d%n", largest);
		
		input.close();
		
	}
}
