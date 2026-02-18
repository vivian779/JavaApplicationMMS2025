public class PrimitiveDataType{
	public static void main(String[] args){
		// whole number Primitive data type
		byte age = 30;
		System.out.printf("I am %d Year Old",age);
		
		short quantityOfBags = 10000;
		System.out.printf("The quantity of bags order is %d%n",quantityOfBags);
		
		int nigeriaPopulation = 2000000000;
		System.out.printf("The population of nigeria is %d%n",nigeriaPopulation);
		
		long worldsPopulation = 9000000000000L;
		System.out.printf("The worlds Population is %d",worldsPopulation);
		
		//float-point number Primitive data type
		float myBalance = 6945.6000057F;
		System.out.printf("My Account balance is %.2f%n",myBalance);
		
		double cBNBalance = 9874466464.904;
		System.out.printf("CBN account balance is %f%n",cBNBalance);
		
		// single character primitive datatype
		char symbol = '$';
		System.out.printf("My Account balance is %c%.2f%n",symbol,myBalance);
	}
}