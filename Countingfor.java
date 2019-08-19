package java_programs;

import  java.util.Scanner;
import static java.lang.System.*;
public class Countingfor {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		int n, usenumb;
		/*String message;
		out.println("Enter a message and I'll display it 5 times");
		out.print("message: ");
		message = keys.nextLine();
		
		for(n = 1; n <= 5; n++) {
			out.println(n + "." + message);
		}
		out.println("\n now I'll show you it ten times counting by 5s");
		for (n=5; n <= 50; n += 5) {
			out.println(n + "." + message);
		}
		out.println("three times counting backwards");
		for (n = 3; n> 0; n-=1) {
			out.println(n + "." + message);
		}*/
		
		out.print("Give me a number an I will count to it. Number: ");
		usenumb = keys.nextInt();
		for (n = 1; n <= usenumb; n++) {
			out.println(n + ".");
		}
	}
}
