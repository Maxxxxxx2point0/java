package java_programs;
import java.util.Scanner;
import static java.lang.System.*;
public class collegeadmin {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int math;
		String again;
		out.println("welcome to CSU Admisions interface!");
		out.println("Please enter your ACT score (0-35)");
		math = kb.nextInt();
		out.println();
		out.println();
		
		if(math >=35) {
			out.println("Certain");
		}
		else if (math >= 28) {
			out.println("safe");
		}
		else if (math >= 25) {
			out.println("Probable");
		}
		else if (math >= 21) {
			out.println("uncertain");
		}
		else if (math >= 18) {
			out.println("unlikely");
		}
		else {
			out.println("denied");
		}
		out.println("need to go again?");
		again = kb.next();
		if (again.equals("no")) {
		}
		
	}
}
