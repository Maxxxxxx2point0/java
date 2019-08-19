package java_programs;
import java.util.Scanner;
import static java.lang.System.*;
public class numberguessinggame {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		int secret, guess;
		
		//create random number
		secret = 1+ (int)(100*Math.random());
		
		out.println("I'm thinking  of a number between 1-100");
			out.println("Try to guess it");
			out.println("> ");
			guess = keys.nextInt();
			//go to their guess
			
			while(secret != guess) {
				//everything inside of this loop will run until the condition changes
				if (guess < secret) {
					out.print("Sorry your guess is too low.");
					out.print("Try again\n");
					guess = keys.nextInt();
				}
				else if(guess > secret) {
					out.print("Sorry, your guess is too high.");
					out.print("Try again \n");
					guess = keys.nextInt();
				}
				
				
			}
			out.print("You guessed it! WHat are the ods?!");
	}
}
