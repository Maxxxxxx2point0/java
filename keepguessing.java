package java_programs;
import java.util.Scanner;
import static java.lang.System.*;
public class keepguessing {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		int secret, guess;
		
		secret = 1 + (int)(Math.random()*10);
		out.println("I've chosen a number between 1-10\n your guess.");
		guess = keys.nextInt();
		
		while (secret != guess) {
			out.println("That's a good guess. Guess again\n Guess again");
		}
		out.println("That's right! your're a good guesser");
	}
}
