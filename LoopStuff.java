package java_programs;
import java.util.Scanner;
import static java.lang.System.*;
public class LoopStuff {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		int pin, entry;
		
		pin = 13423;
		String password, secondentry;
		password = "password";
		secondentry = " ";
		
		
		
		
		out.println("Welcome to the RCS bank");
		out.println("Please, enter your password");
		secondentry = key.next().toLowerCase(); //.ToUppercase();
		
		while (!password.equals(secondentry)) {
			out.println("\n INCORRECT PASSWORD. TRY AGAIN");
			out.println("Please, enter your password");
			secondentry = key.next();
		}
		out.println("\n Password Accepted\nPlease enter your pin");
		entry = key.nextInt();
		
		while (entry != pin) {
			out.println("\n INCORRECT PIN. TRY AGAIN");
			out.println("Please, enter your pin");
			entry = key.nextInt();
			
		}
		out.println("\n PIN ACCEPTED. Bank account balance is 24000");
		
		//before ping ask for password
		//add second while loop before the first one
		//it loops as long as their answer
		//password 
	}
}
