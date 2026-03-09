import java.util.Scanner;
public class One_Dimensional_Arrays{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int[] marks = new int[10];
		int counter = 1;
		
		
	for(int i = 0; i < 10; i++){
		System.out.printf("Enter element%d:  ",counter);
		
		marks[1] = scan.nextInt();
		
		counter++;
	}
	System.out.println("Enter elements of the arrys are: ");
	
	for(int i = 0; i < 10; i++){
		
		System.out.printf("%d, ", marks[1]);
		
	}
	
	}

}