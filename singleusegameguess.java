package java_programs;
import java.util.Scanner;
import static java.lang.System.*;
public class singleusegameguess {
	public static void main(String[] args) {
		//scanner and variables
		Scanner keys = new Scanner(System.in);
		int a, b;
		
		out.println("Guess the number");
		//declare variable
		a = 1+(int)(29*Math.random());
		//if statements
		if (a<=10) {
			out.println("The number is less than 10");
			if (a<=5) {
				out.println("The number is less than 5");
			} else {
				out.println("the number is bigger than 5");
			}
		}
		else if (a<15 && a>10) {
			out.println("The number is less than 15 but bigger than 10");
		}
		else if (a>15 && a<20) {
			out.println("The number is greater than 15, but less than 20");
		}
		else if (a>20 && a<30) {
			out.println("The number is bigger than 20, but less than 30");
		}
		out.println("Can you guess the number?\n Input here:");
		b = keys.nextInt();
		if (a==b) {
			out.println("You guessed it right! Good for you!\n the number is infact "+a);
		}
		else {
			out.println("NOPE, you guessed wrong, try again later.\nThe number is "+a);
		}
		
	}
}
