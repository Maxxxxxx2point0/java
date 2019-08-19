package java_programs;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static java.lang.System.*;
public class DoWhileLoop {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		
		String coin, again;
		int streak = 0;
		boolean gotHeads;
		
		do {
			gotHeads = Math.random() < 0.5;
				if (gotHeads) {
					coin = "HEADS";
				}
				else {
				coin = "Tails";
				}
				out.println("You flip a coin and you got " + coin);
				
				//maintains streak counter
				if(gotHeads) {
					streak++;// ++ = variable = variable + 1
					out.println("That's " + streak + " in a row\n"
							+ "Would you like to flip again? (y/n)");
					again = keys.nextLine();
				}else {
					out.println("You lose everything!\n"
							+ "should've quit while you where ahead");
					streak = 0;
					again = "n";
					
				}
				
			}while(again.equals("y")); 
				out.println("Final score: " + streak);
		
		
	}
}
