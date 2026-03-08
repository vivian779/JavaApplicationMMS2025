import java.util.Scanner;

public class CandidateTestCheck{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your full name: ");
		String fullName = scan.nextLine();
		
		System.out.print("Enter your English Score: ");
		int english = scan.nextInt();
		
		System.out.print("Enter your Ict Score: ");
		int ict = scan.nextInt();
		
		System.out.print("Enter your Maths Score: ");
		int maths = scan.nextInt();
		
		double average = (english + ict + maths)/3;
		if(english >70 && average >=80){
			System.out.println("Employment letter sent");
		}
		else{
			System.out.println("Rejection letter sent");
		}
	}
		}
	

				
	
		
	