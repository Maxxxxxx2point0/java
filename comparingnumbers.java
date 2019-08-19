package java_programs;
import java.util.Scanner;
public class comparingnumbers {
	public static void main(String[] agrs) {
		Scanner kb = new Scanner(System.in);
		double first, second;
		
		System.out.print("Give me two numbers. First: ");
		first = kb.nextDouble();
		System.out.print("Second: ");
		second = kb.nextDouble();
		// compare the numbers
		if (first < second) {
			System.out.println(first + " is less than "+ second);
		}
		if (first <= second) {
			System.out.println(first + " is less than/equal to " + second);
		}
		if (first >= second) {
			System.out.println(first + " is greater than/equal to " + second);
		}
		if (first > second) {
			System.out.println(first + " is greater than " + second);
		}
		if (first == second) {
			System.out.println(first + " is equal to " + second);
		}
		if (first != second) {
			System.out.println(first + " is not equal to " + second);
		}
	}
}
