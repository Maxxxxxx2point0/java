/* This is a game that is based off of Borderlands 1 and 2
 * There are over a billion guns in the remastered verson,
 * but this is a knockoff.Yeah THere is a file you need to run it.*/

package java_programs;

import java.util.ArrayList;
import  java.util.Scanner;
import static java.lang.System.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter; //write to files
import java.util.concurrent.TimeUnit;
import javax.swing.*;
//import the event package
import java.awt.event.*;
import java.awt.*;

class Final extends JFrame implements KeyListener{
	//create objects
	JPanel pnl = new JPanel();
	JTextField field = new JTextField(38);
	JTextArea area = new JTextArea(5, 39);
	//constructor
	public Final() {
		//creating window
		super("Spring Final");
		setSize(500, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//objects
		add(pnl);
		pnl.add(area);
		pnl.add(field);
		
		//addlister
		field.addKeyListener(this);
		setVisible(true);
		
		
		
	}
	
	
	
	
	@Override
	public void keyPressed(KeyEvent ke) {
		// TODO Auto-generated method stub
		area.setText("Key pressed ");
	}

	@Override
	public void keyReleased(KeyEvent ke) {
		// TODO Auto-generated method stub
		int keyCode = ke.getKeyCode();
		area.append("\nKey Code: " + ke.getKeyCode());
		area.append("\n Key Text: " + ke.getKeyText(keyCode));
	}

	@Override
	public void keyTyped(KeyEvent ke) {
		// TODO Auto-generated method stub
		area.append("\rCharacter: " + ke.getKeyChar());
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		//bringing in arrays, variables, and scanner
		Scanner keys = new Scanner(System.in);
		String [] smg = {"Trance", "Burny", "Shocky", "Venom", "Kindle", "Transmurdera"};
		String [] rifle = {"Cannon", "Gatling Gun", "Lance", "Rifle", "Blasster", "Renegade"};
		String [] shotgun = {"Oberkill!", "Skatergun", "Longrider", "Bangstick", "Shotgun Supreme!", "Projectile Diversification"};
		String [] sniper = {"Transaction", "Callipeen", "Harrorshow", "Droog", "Policy", "Jericho"};
		String [] pistol = {"Iron", "Pepperbox", "Hole Puncher", "Apparatus", "Peacemaker", "Negotiator"};
		String [] rocketlaunchers = {"Boom", "Vanquisher", "Area efect", "Prowler", "Bombabarbardeer", "PRAZMA CANON"};
		String [] characters = {"Axton", "Maya", "Salvador", "Zer0"};
		String [] guns = {null, null, null, null};
		String savefilename = "Borderlandsmockup.txt",name, character = null;
		int level, lives = 3, guntype = 1, classes = 5, timeforsleep = 2;
		boolean completed = true;
		//getting a file for user
		File f = new File(savefilename);
			//pulling save file or creating a new file
			if(f.exists() && f.length() > 0) {
				Scanner input = new Scanner(f);
				name = input.next();
				level = input.nextInt();
				character = input.next();
				guns[0] = input.next();
				guns[1] = input.next();
				guns[2] = input.next();
				guns[3] = input.next();
				input.close();
				out.println("Highest Level is " + level);
				out.println( name + " is sitting at this level\n"
						+ "with " + guns[0] + guns[1] + guns[2] + guns[3] + 
						" \nas their weapons");
			}
			else {
				//creating a save file if there is none
				out.println("File doesn't exist\n"
						+ "Creating Profile");
				level = 1;
				name = "";
				character = null;
				guns[0] = null;
				guns[1] = null;
				guns[2] = null;
				guns[3] = null;
			}
			//getting a file that has character descriptions in it
		Scanner fin = new Scanner(new File("characterprofile.txt")).useDelimiter("\n");
		//having player choose the character
		out.println("Choose your character:");
		while (fin.hasNext()) {
			String description = fin.next();
			out.println(description);
		}
		fin.close();
		//making sure that the character selected is an actual character
		boolean run = true;
		while(run) {
			character = keys.next().toLowerCase();
			keys.nextLine();
			if (character.equals("axton") || character.equals("maya") || character.equals("salvador") || character.equals("zer0")) {
				run = false;
			}
			else {
				
				out.println("That is not one of the characters");
			}
		}
		//making the first letter of the name of the chosen character capitalized
		String charactercap = character.substring(0,1).toUpperCase() + character.substring(1); 
		//starting the game
		out.println("Welcome " + charactercap + "!\n"
				+ "You are currently on the planet Pandora.\n"
				+ "Bandits, Skags, Gangs, and LowLifes are lurking\n"
				+ "around the world, hunting for a treasure that is\n"
				+ "guarded by a monster.");
		//pausing the program
		time(timeforsleep);
		//giving the user a weapon randomly
		guns[0] = gunchooser(smg, rifle, shotgun, sniper, pistol, rocketlaunchers, guntype, classes);
		guns[1] = null;
		guns[2] = null;
		guns[3] = null;
		out.println("You have recieved your first weapon! The " + guns[0] + " is how you will survive for now.");
//		setting the number of tries beofre restarting level
		lives = 3;
		//pausing game
		time(timeforsleep);
		out.println("You start out with 3 lives, you can gain lives by finding \n"
				+ "them in the game and you can also lose them by dieing, have fun!");
		//setting the level
		level = 3;
		//making one of the while loops go
		boolean completedstop = true;
		if (level == 1) {
		    //level 1
			//making another loop go again
			completed = true;
			//entering a while loop
			while (completed) {
				//and another
				while (completedstop) {
					//setting the amount the program sleeps
					timeforsleep = 5;
					//method for the sleep
					time(timeforsleep);
					//printing
					out.println("Welcome to level 1!\n"
							+ "Right now you are in Firestone, CLP-Tr4p has given you a hud.\n"
							+ "You turn around and bandits are attacking!");
					//setting sleep time again
					timeforsleep = 8;
					//method for sleep
					time(timeforsleep);
					out.println("Win 5 rounds of black jack in a row to kill the bandits");
					//starting the challenge of the first level
					//making it so that if the life counter in blackjack reaches a certain 
					//amount then it will make the player dead and restart the level
					if (blackjack(lives) <= 0) {
						out.println("You are now dead, better luck next time.");
						//time for sleep
						timeforsleep = 4;
						//method for sleeping
						time(timeforsleep);
						//trying to get the level to restart and it acutally worked.
						//the only reason I did this was because I didn't want the code after the loops to run and just restart
						break;
					}else {
						//making it so that when blackjack is won the rest of the code runs and the loops quit
						out.println("The bandits at the table are confused on how you are so good at blackjack.\n"
								+ "They decide that you are cheating your way to beat them. They get ready to \n"
								+ "jump you and take your money and your life. In self defense you take out your \n"
								+ guns[0] + " as they make their way towards you. A few shots are fired from across\n"
								+ "the table, you fire back, here a splat and a drop. You nailed one in the head\n"
								+ "and it blew up. Another one sneaks up behind you, trying to take you by suprise. \n"
								+ "A knife goes past your head into the table, you turn around and see the bandit. \n"
								+ "You shoot him in the knee, grab the knife and throw it into his hand. The knife \n"
								+ "goes through it into the floor. The last bandit sees what you have done and starts \n"
								+ "shooting randomly. One, two, three shots fired and he is on the ground. You look \n"
								+ "at the bodies and see a weapon you like. ");
						//setting the number of classes of weapons can be choosed from
						classes = 6;
						//running a method to randomly choose another weapon for the player to have
						guns[1] = gunchooser(smg, rifle, shotgun, sniper, pistol, rocketlaunchers, guntype, classes);
						out.println("you received the " + guns[1] + " you also found a health pack on one of the other \n"
								+ "bandits. You have gained a life and a weapon.");
						//sleeping time set
						timeforsleep = 30;
						//method for sleeping
						time(timeforsleep);
						out.println("congratulations! You made it past the first level!");
						//setting the level to 2 and quiting the other two loops
						level = 2;
						completed = false;
						completedstop = false;
					}
				}
			}
		}
		//checking to make sure the level is 2
		if(level == 2) {
			//level 2
			//making the while loop runable
			completed = true;
			//while loop to allow for the level to restart whithout the game restarting
			while (completed) {
				//making another while loop runable
				completedstop = true;
				//while loop for the main challenge in level 2
				while (completedstop) {
					//displaying number of lives
					out.println("Welcome to level 2! You currently have " + lives + " lives");
					//sleep time
					timeforsleep = 3;
					//sleep method
					time(timeforsleep);
					//creating the array of words for the password.
					/*originally i was going to have a list of 230 words in a file and then bring them into the program in into an array
					 * it was taking too much of my time because I was trying to work with how someone elses code does it and morph it 
					 * into my own version of it. i got it to import and pring the words, I just wasn't able to import them into an array*/
					String [] wordlist = {"telescope", "swimming", "insect", "printer", "weapon", "balloon", "album", "water", "school", "drum", "computer"};
					//choosing the word for the player to guess
					String Password = wordlist[(int)(Math.random()*11)];
					out.println("\nAfter fighting the bandits off and gain a \n"
							+ "new weapon you saw a piece of paper on one of\n"
							+ "the bandits. While taking a closer look you \n"
							+ "see that the paper is a map to a random cave. \n"
							+ "You decide it wouldn't hurt to go check it out \n"
							+ "you go through the desert into the jungle and \n"
							+ "up a mountain. During that trip you find a few \n"
							+ "grenades and some more ammo. After fighting off \n"
							+ "a  few hundred spiderants, phsycos, and bullymongs \n"
							+ "you finally made it to the top and find the cave. \n"
							+ "While traveling into the cave you find some food, \n"
							+ "water, ammo, and another grenade. You are about to \n"
							+ "leave when something else catches your eye. Something \n"
							+ "shiny in a corridor. You walk over to it and see that \n"
							+ "it's a vault, not one that is guarded by a monster. \n"
							+ "the password is unknown and you don't have any equipment\n"
							+ "to hack or cut your way in. You will have to guess the \n"
							+ "guess the password. Good luck");
					//sleeping time
					timeforsleep = 30;
					//method for sleeping
					time(timeforsleep);
					//creating the integer i
					int i = 0;
					int g = 0;
					//making the loop able to run
					boolean stillgoing = true;
					while(stillgoing) {
						//increasing i for a number of tries counter
						i++;
						//increasing g for the total number of tries
						g++;
						
						//giving part of the password
						out.println("The password starts with a " + Password.charAt(0) + " and ends with a " + Password.substring(Password.length()-1) + " the word is " + Password.length() + " characters long.");
						out.println("The password  is only lowercase letters, What is the password?");
						//if the tries are greater than two then it will give the player some characters of the password if it is more than 2 character long
						if (i >2) {
							out.println("If the word has four letters then other characters of the word are " + Password.charAt(1) + " " + Password.charAt(2) );
							out.println("These might be the only letters or not, good luck.");
						}
						//making it give the user more characters if the word is longer than 4 characters long and tries is more than 2
						if (Password.length()>4 && i > 2) {
							out.println("The word has a " + guns[4] + " " + Password.charAt(5) +  " in it,");
						}
						//making the player guess the password
						String guess = keys.next().toLowerCase();
						
						//closing the scanner for the next one
						keys.nextLine();
						//if the number of tries goes to 5 then the player loses a life because, well read the print statement
						if (i == 5) {
							//taking a life
							lives -=1;
							//telling the reason why life was taken
							out.println("you took too many tries and got shot in the back by a bandit.\n"
									+ "You lose a life. Life count is " + lives);
							//resetting the number of tries
							i = 0;
						}
						//making the player restart if their lives are nonexistent
						if (lives < 1) {
							out.println("You are now dead, restarting level");
							lives = 3;
							//making the while loop stop and restarting the level, not the game
							break;
						}
						//checking to see if the guess matches the password
						if (guess.equals(Password)){
							//not being supprised by the number of tries
							out.println("Wow! Try number " + g + " it's about time.");
							stillgoing = false;
							completedstop = false;
							
						}else {
							//if the password is incorrect then this runs
							out.println("Nope! That's not it, guess you will have to guess again. \n"
									+ "Just watch your back.");
						}
						
					}
				}
				//after the player actually passes then this code runs
				//chooses another gun for the player to have
					guns[2] = gunchooser(smg, rifle, shotgun, sniper, pistol, rocketlaunchers, guntype, classes);
					//congradulating the player on passing level 2
					out.println("Hey, look at that, you got past the password.");
					out.println("You go into  the vault and find loads of cash, ammo, and some guns.\n"
							+ "While you were searching through the shelves of guns you saw one that \n"
							+ "caught your eye. You hear a crash behind you and you see a pile of guns \n"
							+ "with a knocked over shelf. A bandit runs to a corner, you pick up the gun \n"
							+ "a few shots come your way and into the wall. You fire back and silence falls \n"
							+ "you have now recieved another gun, the " + guns[2] + " has been added to your\n"
									+ "armory, congrats.");
					//time for sleep
						timeforsleep = 25;
						//sleeping
						time(timeforsleep);
						//timersleep
						level = 3;
						//setting level
						out.print("Level three is just around the corner.");
						completed = false;
						completedstop = false;
						//stopping the while loops
		}
	}
		if (level == 3) {
			boolean allowed = false;
			//level 3
			//setting the while loop variabls to run
			completedstop = true;
			completed = true;
			//first while loop
			while(completed) {
					out.println("Welcome to level 3!");
					out.println("You currently have " + lives + " lives.\n"
							+ "The life of a vault hunter is very active and never boring, \n"
							+ "everything you do is part of your consequences in the future. \n"
							+ "Thousands of bandits, skags, spiderants, threshers, bullymongs, \n"
							+ "and other creatures from Pandora lye in a grave made by you. \n"
							+ "Handsome Jack is still looking for you, now more than ever. \n"
							+ "One of the Vaults on Pandora is neer, within sight of those\n"
							+ "who want to see it. Clp-Tr4p stops you at a gate\n"
							+ "saying you must answer some riddles to pass the gate.\n"
							+ "So, I guess you need to do what he says. When he asks\n"
							+ "you a riddle, answer it with the correct answer. \n"
							+ "Every wrong answer makes you lose a life, hope \n"
							+ "you stocked up!");
					//sleeping time
					timeforsleep = 28;
					//method for sleep
					time(timeforsleep);
					//arrays for riddles and the answers
					String [] riddles = {"What has many ears but cannot hear?", "What is stronger than steel but cowers from the sun?", "What word is said too much, yet not enough?", "What stays where it is when it goes off?"};
					String [] answers = {"cornfield", "ice", "love", "alarmclock"};
					out.println("Now! Time for your fist riddle");
					//setting some integers
					int i = 0;
					int correct = 0;
					//second while loop
					while (completedstop) {
						//counter
						
						//printing the riddle
						out.println(riddles[i]);
						out.println("Format is ANSWER, that is it no letters or words before or after it\n"
								+ " Answer: ");
						//getting the answer from the user
						
						String guess = keys.nextLine().toLowerCase();
						keys.nextLine();
						//making sure the answer matches the riddle answer
						if (guess.equals(answers[i])) {
							out.println("Look at that you got it!");
							correct +=1;
							lives +=1;
							out.println("You gained a life!");
							i++;
						}else {
							out.println("Nope! You lose a life!");
							//slowly killing the player
							lives -= 1;
						}
						if (lives < 1 ) {
							out.print("You are now dead, restarting level");
							break;
							//making the player restart the level
							
						}
						if(correct == 4) {
							//checking to see if the riddles are correct
							out.println("You got them all right! Good Job!\n"
									+ "Level four complete!");
							completedstop = false;
							allowed = true;
						}
						
					}
					if (allowed) {
						//giving the user another gun
						guns[3] = gunchooser(smg, rifle, shotgun, sniper, pistol, rocketlaunchers, guntype, classes);
						out.println("CLP-Tr4p finally lets you through the gate, and on the other side is the vault you have been waiting for.\n"
								+ "You walk over to it, CLP-Tr4p opens it up and guns fall out. You see one you like and you pick it up.\n"
								+ "You now have the " + guns[3] + " at your disposal!.");
						//stopping while loop
						completed = false;
						//time for sleeping
						timeforsleep = 15;
						//method for sleep
						time(timeforsleep);
					}
					

			}
		}
		//displaying characters earned guns and character name
				out.println("Congrats! You beat the game with the guns " + guns[0] + ", " + guns[1] + ", " + guns[2] + ",and " + guns[3]);
				out.println("while playing as " + character);
				
			
		//getting players name
		out.println("Name:");
		name = keys.next();
		
		
		
//		ending program and saving file
//		save name and high score
		PrintWriter out = new PrintWriter(f);
		out.println(name);
		out.println(level);
		out.println(character);
		out.println(guns[0]);
		out.println(guns[1]);
		out.println(guns[2]);
		out.println(guns[3]);
		out.close();
		
		out.println("Game now over.");
		out.println("One more thing.");
		//pulling graphics method
		Final stuff = new Final();
	}
	//method for randomly choosing a gun
	public static String gunchooser(String[] smg, String[] rifle, String[] shotgun, String[]sniper, String[]pistol, String[] rocketlaunchers, int guntype, int classes ) {
		//setting chooser integer
		int chooser = -1;
		//variable for the gun that is chosen
		String recievedgun = null;
		//choosing the class
		chooser = guntype + (int)(Math.random() * classes);
		//checking which class gets picked
		if (chooser == 1) {
			//choosing which gun within the class the player gets
			recievedgun = rocketlaunchers[(int)(Math.random()*5)];
		}
		else if (chooser == 2) {
			recievedgun = smg[(int)(Math.random()*5)];
		}
		else if (chooser == 3) {
			recievedgun = rifle[(int)(Math.random()*5)];
		}
		else if (chooser == 4) {
			recievedgun = shotgun[(int)(Math.random()*5)];
		}
		else if (chooser == 5) {
			recievedgun = sniper[(int)(Math.random()*5)];
		}
		else if (chooser == 6) {
			recievedgun = pistol[(int)(Math.random()*5)];
		}
		//returning the gun picked
		return recievedgun;
		
	}
	public static void time(int timeforsleep) {
		//time
		try {
			TimeUnit.SECONDS.sleep(timeforsleep);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static int blackjack(int lives) {
		//blackjack method
		//creating variables and scanner
		Scanner keys = new Scanner(System.in);
		String choice = null;
		int win = 0, best, bank = 1000, total, totaldealer, cardone = 0, cardtwo = 0, dealercardone = 0, dealercardtwo = 0, game = 0, bet, timeforsleep = 2, anothercard = 0, secondbank = 0;
		boolean play = true, hit = true, issues = true, doubleup = true;
		//beginning of game
		out.println("Welcome to BlackJack!\n"
				+ "Currently Shuffling!");
	//time method of pausing program
		time(timeforsleep);
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
				time(timeforsleep);
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
			time(timeforsleep);
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
				win += 1;
				out.println("You gain a life because you got 21");
				lives += 1;
			}
			else if (total <= 21 & totaldealer < total){
				bank += bet * 2;
				out.println("Round Won! New bank total is $" + bank);
				out.println("Dealer total is " + totaldealer + " and your total is " + total);
				win += 1;
			}
			else if (total < totaldealer & totaldealer <= 21) {
				out.println("Dealer Wins! Better luck next time");
				out.println("Dealer total is " + totaldealer + " and your total is " + total);
				win = 0;
			}
			else if (total > 21) {
				out.println("You lose a life because you overshot");
				out.println("Dealer total is " + totaldealer + " and your total is " + total);
				win = 0;
				lives -=1;
			}
			else if (totaldealer > 21) {
				out.println("You win!");
				out.println("Dealer total is " + totaldealer + " and your total is " + total);
				bank += bet *2;
				win += 1;
			}
			//checking to see if the players bank went to low
			if (bank < 2) {
				out.println("You lose a life because bank went too low");
				//slowly killing the player
				lives-= 1;
				//reseting level
				win = 0;
				bank = 1000;
			}
			out.println("You have won " + win + " rounds in a row.");
			//getting the player out of the blackjack game if they are dead
			if (lives <=0) {
				win = 5;
			}
			//getting the player out of the game because they either won or died
			if (win == 5) {
				play = false;
			}
	}
		//returning the number of lives the player has left
		return lives;
	}
	
	
	
	
	
	
	
	
}
