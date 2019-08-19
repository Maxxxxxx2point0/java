package java_programs;
import java.util.Scanner;
import static java.lang.System.*;
public class methodthings {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		double number;
		out.println("what is your favorite number?");
		number = keys.nextInt();
		
		out.println("Your number squared is " + square(number));
		
		out.println("Your number divided by 6 is " + divide(number));
		
		out.println("Your number turned into a cypher is " + cypher(number));
	}
	public static double square( double number) {
		double squared = number * number;
		return squared;
	}
	public static double divide(double number) {
		double divided = number / 6;
		return divided;
	}
	public static String cypher(double number) {
		String cyphers = null;
		if (number < 10) {
			cyphers = "This means that it is almost time for lunch";
		}
		else if (number <= 20 && number >10) {
			cyphers = "This means that is is close to lunch, just not yet";
		}
		else if (number <= 30 && number >20) {
			cyphers = "This means that lunch is still far enough away to be longing for it";
		}
		else if (number <= 40 && number > 50) {
			cyphers = "Well, lunch is far away somewhere in the fourth dimension";
		}
		else {
			cyphers = "Lunch is hidden in a dark place, why would you choose this number?";
		}
		return cyphers;
	}
}