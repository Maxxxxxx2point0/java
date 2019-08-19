package java_programs;
import java.util.Scanner;
public class guessinggame {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String guess;
		
		System.out.println("Guess the word i am thinking of");
		System.out.println("it starts with p");
		System.out.println("it ends with n");
		System.out.println("it has t and h in it");
		System.out.println("What is the word?");
		guess = kb.next();
		
		if((guess.equals("python")) || (guess.equals("Python")) || (guess.equals("PYTHON"))){
			System.out.println("look at that, you guessed the word");
		}
		else {
			System.out.println("NOPE! you got it wrong");
		}
	
		
	}
}
