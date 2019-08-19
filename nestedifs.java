package java_programs;
import java.util.Scanner;
public class nestedifs {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String title;
		
		System.out.print("First name: ");
		String first = kb.next();
		
		System.out.print("Last name: ");
		String last = kb.next();
		System.out.print("Gender (m/F)");
		String gender = kb.next();
		
		System.out.print("Age: ");
		int age = kb.nextInt();
		
		if (age<20) {
			title = first;
		} else {
			if (gender.equals("f")) {
				System.out.print("Are you married, "+first+"? (Y/N)");
				String married = kb.next();
					if (married.equals("Y")) {
						title = "Mrs.";
					} else {
						title = "Ms.";
					}
				
			}else {
				title = "Mr.";
			}
		}
		System.out.println("\n"+title+ " "+ last);
	}
}
