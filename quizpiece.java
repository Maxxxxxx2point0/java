package java_programs;
import java.util.Scanner;
import static java.lang.System.*;
public class quizpiece {
	public static void main(String[] args) {
		int number;
		String name;
		Scanner keys = new Scanner(System.in);
		
		out.println("Give me a number: ");
		number = keys.nextInt();
		out.println("Give me your first and last name: ");
		name = keys.nextLine();
		out.println("hello "+ name);
		
		
		
		
	}
}
