package java_programs;
import java.util.Scanner;
public class agemessages {
	public static void main(String[] args) {
	//if statements
	Scanner keys = new Scanner(System.in);
	int age;
	
	System.out.print("How old are you? ");
	age = keys.nextInt();
	
	System.out.print("you are: ");
	//desicions
	if (age < 13) {
		System.out.println("\ttoo young for Fortnite, Steam, and Facebook");
	}
	if (age < 16) {
		System.out.println("\ttoo young to get a driver's license");
	}
	if (age <18) { 
		System.out.println("\ttoo young to get a tatto, or a lottery ticket");
	}
	if(age < 21) {
		System.out.println("\tto young to purchase alcohol or enter a casino");
	}
	if(age<35) {
		System.out.println("\tto young to run for president");
	}
	else {
		System.out.print("\tGood for you, you are old.");
	}
}
}
