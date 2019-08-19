package java_programs;
import  java.util.Scanner;
import static java.lang.System.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter; //write to files
import java.util.concurrent.TimeUnit;
public class blackjack {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner keys = new Scanner(System.in);
		String savefilename = "BlackJackScore.txt", bestname, choice = null;
		int best, bank = 1000, total, totaldealer, cardone = 0, cardtwo = 0, dealercardone = 0, dealercardtwo = 0, game = 0, bet, timeforsleep = 2, anothercard = 0, secondbank = 0;
		boolean play = true, hit = true, issues = true, doubleup = true;
		File f = new File(savefilename);
		//pulling highscore or creating a new file
		if(f.exists() && f.length() > 0) {
			Scanner input = new Scanner(f);
			bestname =input.next();
			best = input.nextInt();
			input.close();
			out.println("High score is $" + best);
			out.println( bestname + " got the highscore");
		}
		else {
			out.println("Creating Profile");
			best = -1;
			bestname = "";
		}
		//beginning of game
		out.println("Welcome to BlackJack!\n"
				+ "Currently Shuffling!");
	//time method of pausing program
		sleeping(timeforsleep);
//main while loop for the game 
		while (play) {
			//round counter
			game++;
			//shuffling some numbers around
			for (int i = 0; i<=10; i++) {
				cardone = (int)(Math.random()*11 +1);
				cardtwo = (int)(Math.random()*11 +1);
				dealercardone = (int)(Math.random()*11 +1);
				dealercardtwo = (int)(Math.random()*11 +1);
				}
			total = cardone + cardtwo;
			totaldealer = dealercardone + dealercardtwo;
			//getting bank amout and how much the player wants to bet
			out.println("Round " + game);
			out.println("You have $" + bank + ". How much do you want to bet?");
			bet = keys.nextInt();
			keys.nextLine();
			//figuring out if the bet is too low 
			issues = true;
			while (issues) {
				secondbank = bank;
				secondbank = bank - bet;
			if (bet > 0) {
				issues = false;
			}else {
				out.println("Bet too low\n"
						+ "Try again");
				bet = keys.nextInt();
				keys.nextLine();
			}
			if (secondbank > 0) {
				issues = false;
			}else {
				out.println("Bet too low\n"
						+ "Try again");
				bet = keys.nextInt();
				keys.nextLine();
			}
			}
			//taking the players money
			bank -= bet;
			//telling player new bank and one of the dealers cards
			out.println("You now have $" + bank);
			out.println("Your cards are " + cardone + " and " + cardtwo + ".\n"
					+ "Your total is " + total);
			out.println("One of the Dealer cards is a " + dealercardone);
			//making hit true and waiting until the player stands or total is over 21
			hit = true;
			doubleup = true;
			while (hit) {
			if (total < 21) {
				out.println("Do you want to hit or stand? (h/s)");
				choice = keys.next().toLowerCase();
				keys.nextLine(); 
				//makng sure there are not issues with the users input
			issues = true;
			while(issues) {
				
			if (choice.equals("h") || choice.equals("s")) {
				issues = false;
			}else {
				out.println("Input not recognized, try again: ");
				out.println("Do you want to hit or stand? (h/s)");
				choice = keys.next().toLowerCase();
				keys.nextLine();
			}
			}
			//hit for the player
			if (choice.equals("h")) {
				anothercard = (int)(Math.random()*10 + 1);
				total += anothercard;
				out.println("You got a " + anothercard + "!\n"
						+ "Your new total is " + total);
				if (bet*2 < bank) {
				sleeping(timeforsleep);
				//asking to double up
				out.println("Want to double up? New bet would be $" + bet*2 + " (y/n)");
				choice = keys.next();
				keys.nextLine();
				issues = true;
				while(issues) {
					
				if (choice.equals("y") || choice.equals("n")) {
					issues = false;
				}else {
					out.println("Input not recognized, try again: ");
					out.println("Do you want to douoble up? (y/n)");
					choice = keys.next().toLowerCase();
					keys.nextLine();
				}
				}
				if (doubleup) {
				if (choice.equals("y")) {
					bank -= bet;
					bet = bet*2;
					doubleup = false;
					out.println("New bank total is $" + bank);
				}}}
			} else {
				hit = false;
			}
			}
				else {
					hit = false;
			}
			sleeping(timeforsleep);
			//the dealer is playing now
			if (total != 21 & choice.equals("s")) {
				out.println("The other dealers card is " + dealercardtwo
						+ "\nnew dealer total is " + totaldealer);
				//waiting until the dealer reaches 17
				while (totaldealer <= 17) {
					anothercard = (int)(Math.random()*10 + 1);
					totaldealer += anothercard;
					out.println("The dealer got a " + anothercard + "!\n"
							+ "Dealers new total is " + totaldealer);
				}
			}
			}
			//running if statements to decide who wins
			if (total == 21) {
				bank += bet * 2;
				out.println("Round Won! New bank total is $" + bank);
				out.println("Dealer total is " + totaldealer + " and your total is " + total);
			}
			else if (total <= 21 & totaldealer < total){
				bank += bet * 2;
				out.println("Round Won! New bank total is $" + bank);
				out.println("Dealer total is " + totaldealer + " and your total is " + total);
			}
			else if (total < totaldealer & totaldealer <= 21) {
				out.println("Dealer Wins! Better luck next time");
				out.println("Dealer total is " + totaldealer + " and your total is " + total);
			}
			else if (total > 21) {
				out.println("You lose");
				out.println("Dealer total is " + totaldealer + " and your total is " + total);
			}
			else if (totaldealer > 21) {
				out.println("You win!");
				out.println("Dealer total is " + totaldealer + " and your total is " + total);
				bank += bet *2;
			}
			//asking to play again
				out.println("Want to play again? (y/n)");
				choice = keys.next().toLowerCase();
				keys.nextLine();
				issues = true;
				while(issues) {
					
				if (choice.equals("y") || choice.equals("n")) {
					issues = false;
				}else {
					out.println("Input not recognized, try again: ");
					out.println("Do you want to play again? (y/n)");
					choice = keys.next().toLowerCase();
					keys.nextLine();
				}
				}
				//no play again
				if (choice.equals("n")) {
					if (bank > 1000) {
					out.println("Congradulations! You made some cash! Your total cash is $" + bank);
					play = false;
					}else {
						out.println("Sorry about your losses. Your new cash total is $" + bank);
						play = false;
					}
				}else {
					out.println("Great! Starting BlackJack again");
					hit = false;
				}
			}
		//figuring out if there is a new highsore and if there is then getting info
		if (bank > best) {
			out.println("That's a new high score");
			out.print("Your name: ");
			bestname = keys.next();
			best = bank;
		} else {
			out.println("You will have to do better than that to make a new record");
		}
//		ending program and saving file
		//save name and high score
		PrintWriter out = new PrintWriter(f);
		out.println(bestname);
		out.println(best);
		out.close();
	}
	public static void sleeping(int timeforsleep) {
		//time
		try {
			TimeUnit.SECONDS.sleep(timeforsleep);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
