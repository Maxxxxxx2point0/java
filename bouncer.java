package java_programs;

public class bouncer {
	public static void main(String[] args) {
		int age = 20;
		boolean onguestlist = false;
		double groom = 7.5;
		String gender = "F";
		
		if(onguestlist == true || age >=21 || (gender.equals("F") && groom >= 8)){
			System.out.println("Your are allowed to enter the club");
		}
		else {
			System.out.println("you are not allowed to enter the club");
		}
	}
}
