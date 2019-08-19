package java_programs;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static java.lang.System.*;
public class piggame {
	public static void main(String[] args) {
		int number, total = 0, computer, computertotal = 0, compnumber = 0, again = 0;
		String choice;
		boolean game = false, compoption = true;
		Scanner keys = new Scanner(System.in);
		
		out.println("Time for Pig, play against the computer? (y/n)");
		choice = keys.nextLine();
		if (choice.equals("y")) {
			do {
				computer = 1 + (int)(Math.random() * 4);
				number = 1 + (int)(Math.random() * 6);
				if(choice.equals("y")){
				
				out.println("your number is: " + number);

				if(number !=1) {
					total += number;
					out.println("Your total is "+total);
					
				}else {
					out.println("Turn over");
				}}
				compnumber = 1 + (int)(Math.random() * 6);
				if (again == 1) {
					compnumber = 0;
					again = 0;
				}
				out.println("The computer's number is: " + compnumber);
				if (number != 1) {
					computertotal += compnumber;
					out.println("The computer's total is: " + computertotal);
					if (computer > 1) {
						choice.equals("y");
					}
					else {
						choice.equals("n");
						out.println("Computer doesn't want to go next round");
						again = 1;
					}
					if (number != 1) {
					out.println("go again? (y/n)");
					choice = keys.nextLine();
				}
				}else if(computertotal == 1){
					computertotal = 0;
					compoption = false;
				}
				if (computertotal >= 100) {
					game = true;
				}
				else if (total >= 100) {
					game = true;
				}
			}while (game == false) ;
			if(total > computertotal) {
				out.println("You win!");
			}
			else if (computertotal > total ) {
				out.println("The computer wins.\n"
						+ "Last score: " + total);
			}
			else if (computertotal >= 100 && total >= 100 && computertotal == total){
				out.println("it is a tie!");
			}

			
		}
			
		else {
		do {
			number = 1 + (int)(Math.random()*6);
			out.println("your number is: " + number);

			if(number !=1) {
				total = total + number;
				out.println("Your total is "+total+" go again? (y/n)");
				choice = keys.nextLine();
			}else {
				out.println("Turn over");
			}
		}while (choice.equals("y"));
		out.println("You got a one, that sucks.\n"
				+ "Final score: " + total);
		}
		
		
	}
}
