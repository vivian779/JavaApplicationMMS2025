public class OperatorsPart1{
	public static void main(String[] args){
		//assignment operator(=)
		int num = 50;
		System.out.printf("The value of num is %d%n",num);
		
		//Aritmetic Operators(+,-,*./,%)
		int num1 = 1000;
		int num2 = 500;
		
		int addition = num1 + num2;
		System.out.printf("The sum of %d and %d is %d%n",num1,num2,addition);
		
		int subtraction = num1 - num2;
		System.out.printf("The difference between %d and %d is %d%n",num1,num2,subtraction);
		
		int multiplication = num1 * num2;
		System.out.printf("The product of %d and %d is %d%n",num1,num2,multiplication);
		
		
		double quotient = (double)num1/num2;
		System.out.printf("The quotient of %d / %d is %f%n",num1,num2,quotient);
		
		int remainder = num1%num2;
		System.out.printf("The remainder between %d and %d is %d%n",num1,num2,remainder);
		
		//compound assignment operator
		num1+= num2;
		System.out.printf("The value of num1 is now %d%n",num1);
		
		num1 *= num2;
		System.out.printf("The value of num1 is now %d%n",num1);
		
		num1 -= num2;
		System.out.printf("The value of num1 is now %d%n",num1);
		
		num1 %= num2;
		System.out.printf("The value of num1 is now %d%n",num1);
		
		//Relational Operators(>,<,>=,!=,==)
		int nunber1 = 20, number2 = 50;
		
		boolean isGreater = nunber1 > number2;
		System.out.printf("Is %d > %d%n? %b",nunber1,number2,isGreater);
		
		boolean isLessThan = nunber1 < number2;
		System.out.printf("Is %d < %d? %b%n",nunber1,number2,isLessThan);
		
		boolean isGreaterOrEqualTo = nunber1 >= number2;
		System.out.printf("Is %d >= %d? %b%n",nunber1,number2,isGreaterOrEqualTo);
		
		boolean isLessThanOrEqualTo = nunber1 <= number2;
		System.out.printf("Is %d <= %d? %b%n",nunber1,number2,isLessThanOrEqualTo);
		
		boolean isNotEqualTo = nunber1 != number2;
		System.out.printf("Is %d != %d? %b%n",nunber1,number2,isNotEqualTo);
		
		boolean isEqualTo = nunber1 == number2;
		System.out.printf("Is %d == %d? %b%n",nunber1,number2,isEqualTo);
		
		
	}
}