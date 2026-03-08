public class UserDefineMethod{
	public static String userName(String name){
		
		return name;
		
	}
	public static int checkAge(int age){
		if(age >= 18){
			System.out.println(UserDefineMethod.userName("Morrison Vivian ") + "You are an adult");
		}
		else{
			System.out.println(UserDefineMethod.userName("Morrison Vivian ") + "You are still a minor");
		}	
		return age;
	}
	
	public static void main(String[] args){
		System.out.println(UserDefineMethod.checkAge(25));	
	}
	
}

