package java_programs;
import static java.lang.System.*;
public class Lottonumber {
	public static void main(String[] args) {
		out.print("Your lotto numbers are: ");
		out.print(lotto() + " ");
		out.print(lotto() + " ");
		out.print(lotto() + " ");
		out.print(lotto() + " ");
		out.print(lotto() + " ");
		out.print(powerball() + " ");
		powerball();
	}
	public static int lotto() {
		int lottonumber = 1 + (int)(Math.random() * 36);
		return lottonumber;
	} 
	public static int powerball() {
		int powerballnumber = 1 + (int)(Math.random() * 15);
		return powerballnumber;

	}
}
