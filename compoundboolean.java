package java_programs;
import java.util.Scanner;
public class compoundboolean {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		double responsible, income;
		boolean allowed;
		
		System.out.print("Enter your age: ");
		age = keyboard.nextInt();
		System.out.print("Enter your yearly income: ");
		income = keyboard.nextDouble();
		System.out.print("How responsible are you, on a scale from 0.0 to 10.0?");
		responsible = keyboard.nextDouble();
		
		allowed = (age > 30 && age < 36 && (income > 50000 || responsible > 9.0));
		System.out.println("Allowed to date my daughter? " + allowed); //&& both have to be true & has to be true
																		// || or income is greater than 50000 or responsible greater than 9
	}
}
