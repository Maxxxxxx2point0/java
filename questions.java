package java_programs;
import java.util.Scanner;

public class questions {
	public static void main(String[] args) {
		//program that asks users questions
		//declare variables
		String name;
		int age;
		double weight, income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Hello, what is you name?");
		name = keyboard.next();
		System.out.println(" ");
		
		System.out.print("Hi, "+ name+"! How old are you?");
		age = keyboard.nextInt();
		System.out.println(" ");
		
		System.out.println("So, you're "+age+", eh? That's not very old");
		System.out.print("How much do you weigh,"+name+"?");
		weight = keyboard.nextDouble();
		System.out.println(" ");
		
		System.out.print("How much do you make, "+name+"?");
		income=keyboard.nextDouble();
		
		System.out.println(" ");
		System.out.println("So, let me get this right.....");
		System.out.println("Your name is "+name);
		System.out.println("you are "+age+" years old.");
		System.out.println("you are poor with your " +income+" Right?");
			
	}
}
