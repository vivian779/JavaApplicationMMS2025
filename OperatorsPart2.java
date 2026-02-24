public class OperatorsPart2{
	public static void main(String[] args) {
		int num1 = 70;
		int num2 = 50;
		int num3 = 120;
	
	    //Logicial Operators(&&,||,!)
	    // AND(&&)
		boolean andResult = (num1 > num2) && (num1 > num3);
		System.out.printf("The result is %b",andResult);
		
		boolean andResults = (num1 > num2) && (num1 != num3);
		System.out.printf("The AND result is %b%n",andResults);
		
		// OR
		boolean orResult = (num1 > num2) || (num1 == num3);
		System.out.printf("The OR result is %b%n",orResult);
		
		// Not
		boolean notResult = !((num1 > num2) || (num1 == num3));
		System.out.printf("The NOT result is %b%n",notResult);
		
		//Unary Operators(++,--)
		int x = 5;
		int y = ++x;
		
		System.out.println("The value of x is " + x);
		System.out.println("The value of y is "+ y);
		
		int s = 5;
		++s;
		++s;
		
		int z = ++s;
		System.out.println("The value of s is " + s);
		System.out.println("The value of z is " + z);
		
		x = 5;
		y = x++;
		System.out.println("The value of x is "+ x);
		System.out.println("The value of y is "+ y);
		
		//Unary Decreament operator
		--x;
		--x;
		 y = ++x;
		
		System.out.println("The value of decreament x is "+ x);
		System.out.println("The value of decreament y is "+ y);
		
		
		
		
		
	}
}