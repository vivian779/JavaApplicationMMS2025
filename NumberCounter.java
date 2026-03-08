import java.util.Scanner;

public class NumberCounter{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int negative = 0, positive = 0, zero = 0;
		
		while(true){
			System.out.print("Enter any number execept -1: ");
			int num = input.nextInt();
			
			if(num == -1){
				break;
			
		   }
		  if(num > 0){
			  positive++;
		  }
		  else if(num < 0){
			  negative++;
		  }
		  else{
			  zero++;
		}
		
		}
		System.out.printf("Count of positive numbers is %d%n",positive);
		System.out.printf("Count of negative numbers is %d%n",negative);
		System.out.printf("Count of zero numbers is %d%n",zero);
		
	}
		
}
		