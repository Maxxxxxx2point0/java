package java_programs;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static java.lang.System.*;
//square root program
public class SafSquareroot {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		
		double x, y;
		
		out.println("Give me a number and I'll find its square root. \n"
				+ "No negatives, please");
		x = keys.nextDouble();
		keys.nextLine();
		
		while (x<0) {
			out.println("I won't take the square root of a negative. \n"
					+ "New number, please.");
			x = keys.nextDouble();
			keys.nextLine();
		}
		y = Math.sqrt(x);
		out.println("The Square root of " +x + " is " + y);
		
		
		
		
	}
}
