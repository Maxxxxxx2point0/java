package java_programs;
import java.util.Scanner;
public class machine {
	public static void main(String[] args) {
		//Create an object of scanner to get input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("WHat city is the capital of North Dakota");
		keyboard.next();
		
		System.out.print("6 multiplied by 7");
		keyboard.nextInt();
		
		System.out.println("Enter a number between 0.0 and 1.0");
		keyboard.nextDouble();
		
		System.out.println("Is there anything else you want to type?");
		keyboard.next();
	}
}
