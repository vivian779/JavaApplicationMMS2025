public class LocalVariable{
	public static void main(String[] args){
		double price = 23.65;
		int quantity = 12;
		String productName = "Laptop";
		
		
		
		double total = price * quantity;
		
		System.out.printf("The total amount of the %s is $%.2f",productName,total);
	}
	
	
}
