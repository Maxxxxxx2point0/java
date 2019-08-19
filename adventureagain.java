package java_programs;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static java.lang.System.*;
public class adventureagain {
	public static void main(String[] args) {
		//variables, scanner, and random number
		Scanner keys = new Scanner(System.in);
		int secret, guess, life, looppart = 1;
		String answer, choice, name;
		secret = 1 + (int)(Math.random()*30);
		//introducing game 	user has choice to play
		out.println("Welcome to the adventure game that might ruin you\nChoose to play if you wish\nDo you wish to play? (y/n)");
		choice = keys.next();
		keys.nextLine();
		//choosing if variable will change and cause the user to go into loop
		if (choice.equals("y")||choice.equals("n")){
			looppart = 0;
		}
		//loop for unrecognized input choices
			while (looppart != 0){
				out.print("Operation not recognised.\nPlease try again");
				//found out that if the choice = keys.next(); is used and then a choice = keys.nextLine(); 
//				the program will skip input from nextLine. If a keys.nextLine(); is put after a keys.next/Int/Double(); 
//				then it will "close" the keys.next because java leaves it open
				choice = keys.next();
				keys.nextLine();
				//changing variable to get out of loop
				if (choice.equals("y")||choice.equals("n")) {
					looppart = 0;
				}
			}
			//start of path
			if (choice.equals("y")) {
			out.print("What is your name?");
			answer = keys.nextLine();
			out.println("OK "+answer);
			out.println("The world is working its way to a stop, the societies are breaking down, governments around the world are shutting down one by one.\n"
					+ "The USA government is one of the last standing governments of the world, but the cities are still crumpelling.\n"
					+ "You are trying to survive the world falling apart. Good luck! ");
			//telling the program to wait
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//the following 204 lines of are different initilizing sequneces for humor 
			if (secret <= 10) {
				out.println("Programs starting up. Initilizing");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("Keyboard");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("recognition software");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("logic bombs");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("ideas on how to destroy the world");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("wait... disregard that last line of code.");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("forgetting the last three lines of code");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("starting program\n initilization complete");
				
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			else if (secret <=20 && secret >=10) {
				out.println("Programs starting up. Initilizing");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("Mouse");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("eventhough you don't need it");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("faronics insight");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("infinite loops to destroy lives");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("wait... disregard that last line of code.");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("forgetting the last two lines of code");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("starting program\n initilization complete");
				
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			else if (secret <=30 && secret >=20) {
				out.println("Programs starting up. Initilizing");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("robotic fingers");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("spyware on your phone");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("Nate is scamming you");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("starting fires in random warehouses");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("wait... disregard that last line of code.");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("forgetting the last three lines of code");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("starting program\n initilization complete");
				
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			out.println("\nHello There "+answer+".\n");
			
			//telling the program to wait
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			out.println("Who do you think would survive the end of civilization?\n "
					+ "A redneck in the backwoods\n A ex Marine\n Or a tech nerd with a Korean by his side?");
			//getting line of code from user
			choice = keys.nextLine().toLowerCase();
			if(!choice.equals("a redneck in the backwoods")||!choice.equals("a ex marine")||!choice.equals("a tech nerd with a korean by his side")) {
				looppart = 1;
			}
			
			
			while (looppart != 0){
				out.print("Operation not recognised.\nPlease try again\n");
				//changing variable to get out of loop
				out.println("Who do you think would survive the end of civilization?\n "
						+ "A redneck in the backwoods\n A ex Marine\n Or a tech nerd with a Korean by his side?");
				choice = keys.nextLine().toLowerCase();
				if (choice.equals("a redneck in the backwoods")||choice.equals("a ex marine")||choice.equals("a tech nerd with a korean by his side")) {
					looppart = 0;
				}
			}
			life = 1 + (int)(Math.random()*10);
			//deciding what to do with the input
			if (choice.equals("a redneck in the backwoods")) {
				looppart = 0;
				out.println("Great!");
				
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//printing the following text + a variable
				out.println("You are now a redneck "+answer+"\n");
				out.println("Being a redneck, you live in the country. Guns, trucks, and mud are what you have and how you live. \n"
						+ "The end to the world is near and you are determined that you and your family will survive.\n"
						+ "As of right now all communications are down, the internet, cell towers, even radios.\n"
						+ "This, however, doesn't affect you greatly. Your family is wondering what is happening and so you tell them."
						+ "\n\"The world is going into chaos, the people are going mad.\" You need to get your family to saftey before \n"
						+ "the military comes to take them and throw you into service.\n"
						+ "You can ");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("  Pack your guns and ammo and get your family into your truck and head off to the mountains"); 
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("  Stay at your house and try to hide your family"); 
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("  Go back to your old job at the CIA"); 
				
				choice = keys.nextLine().toLowerCase();

				//user chooses condition again
				if (choice.equals("pack up")) {
					life = 1 + (int)(Math.random()*200);
					out.println("You and your family grab what you can.\n"
							+ "With all the chaos going on some supplies were forgotten.\n"
							+ "you and your family can only survive "+life+"days.\n"
									+ "your truck only has enough fuel to get to your camp and there is no time to get more.\n"
									+ "You and your family survive the end of the world by staying in the mountains without a choice of leaving.\n"
									+ "You live and thrive in the mountains so, no harm done.");
				}
				else if (choice.equals("stay home")) {
					life = 1 + (int)(Math.random()*30);
					out.println("You decide to stay at your house in the country. Eventually you will have to hide from the army, but that day isn't here."
							+ "\n"+life+" days have passed and the army is finally rolling down your driveway. You and your family are running out the back door and into the forest.\n"
									+ "A lookout spots you entering the trees, all of the sudden you have a batalion of soldiers running towards you hunting you down. They catch you and your family.\n"
									+ "Your family is sent to a camp to be used for work with compesation as food. You, however, are forced into the military \n"
									+ "and because of your CIA backgrounds you are appointed to the intelligence section. You might not see your family again for a few years. Bad choice.");
				}
				else if (choice.equals("join the cia")) {
					out.println("You talk with your family and finally come to a decision fro you to rejoin the CIA. Your family has been set up at a safe house.\n"
							+ "You continue on your ways ust with secrets of the agency behind you. The issues with the world are in your families rearview and in your windsheild. \n"
							+ "Time to go and try to save the world.");
				}
			}
			else if (choice.equals("a ex marine")) {
				looppart = 0;
				out.println("Great!");
				
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("You are now a ex Marine "+answer);
				out.println("At this point you have two logical choices you can make. To go back to being a admiral in the U.S. army or stay at your house\n"
						+ "and fight off the gangs with all the ammo you have stockpiled\n"
						+ "What do you choose?");
				choice = keys.nextLine().toLowerCase();
				if (!choice.equals("stay home") || !choice.equals("be an admiral")) {
					looppart = 1;
				}
				while (looppart != 0){
					out.print("Operation not recognised.\nPlease try again");
					//changing variable to get out of loop
					out.println("\nTry:"
							+ "\nbe an admiral"
							+ "\nstay home");
					choice = keys.nextLine().toLowerCase();
					if (choice.equals("stay home")||choice.equals("be an admiral")) {
						looppart = 0;
					}
				}
				if (choice.equals("stay home")){
					life = 1+(int)(Math.random()*20);
					out.println("You decide to stay home. You fight off the gangs and robbers, eventually you run out of food and can't leave to get more\n"
							+ ", no worries, the human body can live without food for a month. "+life+" days have passed and you water is no longer running. \n"
									+ "You die four days later when the gangs finally break down your door. Good thing you used all your ammo.");
					
					
				}
				else if (choice.equals("be an admiral")) {
					life = 1+(int)(Math.random()*20);
					out.println("The time spent in the military has scared you, but the time has come to go back and wage the wars that are about to begin.\n"
							+ "You are about to call an admiral when the phone rings. You answer, the voice on the phone said something about rejoining the\n"
							+ "military and death threats against you to not fight against the break down of the world. You think twice about calling in a favor with\n"
							+ "one of your fellow soldiers and contemplate the message. Still want to go to the military? (y/n)"); 
					//getting a line of user input and forcing lower case
					choice = keys.nextLine().toLowerCase();
					if (choice.equals("y")) {
						out.println("You go over this for hours before you finally realize that the message was bull crap.\n"
								+ "You call the military and two hours later you are heading towards a helipad at the airport as an admiral. Later your find out that your house was bombed\n"
								+ "and the bomb was planted well before you left your house. Guess you made the right choice");
					}
					else if (choice.equals("n")) {
						out.println("You decide to take the death threat into serious account and don't call the military. "+life+" hours pass since the call, you assume nothing bad will happen now.");
						life = (int)(Math.random()*5);
						out.println( "Little did you know that a bomb has been planted in your basement and will go off any second. You, however, have no clue.\n"
								+ life+" more hours pass by and you suddenly start hearing a faint beeping. It is driving you crazy and you don't know ehere it is coming from.\n"
										+ "You finally here a tick, you turn towards the door and bolt. Your house blows up with you in the doorway. you are launched to your backyard.\n"
										+ "looking at your house you stay awake long enough to see it burning.");
						//telling the program to wait
						try {
							TimeUnit.SECONDS.sleep(25);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						out.println("You");
						//telling the program to wait
						try {
							TimeUnit.SECONDS.sleep(1);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						out.println("are");
						//telling the program to wait
						try {
							TimeUnit.SECONDS.sleep(1);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						out.println("dead");
						
					}
					
					
					
				}
				
				
				
//No racism implied or intended
//not as complicated as the rest of the code
			}
			else if (choice.equals("a tech nerd with a korean by his side")) {
				looppart = 0;
				out.println("Great!");
				
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//lots of text
				out.println("You are now a tech nerd with a Korean " + answer);
				out.println("You find yourself eating lunch while working on reverse engineering some government spyware.\n"
						+ "Your Korean friend walks into the room holding a tablet with the news on it.\n"
						+ "He calls your name, your reply back \"What do you need?\"\n"
						+ "He responds back by saying \"check out the new\" You go and look.\n"
						+ "What you see on the screen is an oportunity. The world is crumpling the www is now vulnerable.\n"
						+ "You are thinking to yourself \"what kind of information can I get? This could guarantee us survival.\""
						+ "\"LET THE HACKING COMMENSE!\"");
				out.println("You go over to your machine, start up the tor browser, and start doing some research.\n"
						+ "your Korean friend goes to his desktop and types away. You find the ip address range of the servers you want to get into\n"
						+ "and after an hour of making your rig untraceable you fire up parrot linux and your Korean friend fires up kali linux.\n"
						+ "you type arp-scan -l into a terminal to make sure you are on a isolated network, but an error shows up \"Command 'arp-scan' not found\"\n"
						+ "you forgot that you recently wipped your rig and forgot to reinstall arp-scan. you enter sudo apt-get install arp-scan into the terminal.\n"
						+ "you type in your password, it goes through its install process, asks you if you want to install, and there you go. You type arp-scan -l in again\n"
						+ "and presto, you are on an isolated network. Your Korean friend, still trying to get his rig running again after last month, checks his network \n"
						+ "through his pc for the time being. He goes to the command prompt and types in arp -a and look at that he is good to go too, well, atleast for checking the network.\n"
						+ "You are typing furiously at your keyboard when you here a knock at the door. You look at the cameras and see people with guns surrounding your house.\n"
						+ "you can either let them in or try to escape, what will it be?");
				choice = keys.nextLine().toLowerCase();
				//logic statements
				if (!choice.equals("let them in") || !choice.equals("try to escape")) {
					looppart = 1;
				}
				//loop
				while (looppart != 0){
					out.print("Operation not recognised.\nPlease try again");
					//changing variable to get out of loop
					out.println("\nTry:"
							+ "\nlet them in"
							+ "\ntry to escape");
					choice = keys.nextLine().toLowerCase();
					//getting out of loop
					if (!choice.equals("let them in") || !choice.equals("try to escape")) {
						looppart = 0;
					}
				}
				if (choice.equals("let them in")) {
					out.print("You decide to let them in, they talk to you about coming and working for them.\n"
							+ "you are trying to make sense of this. You end up finding out that they work for the U.S. government.\n"
							+ "They offer you information and money for work. The information is the same as what you were looking for. Guess it's a deal\n");
				}
				else if (choice.equals("try to escape")) {
					out.print("You and your Korean friend go to hide, they guys come into your house and are searching everywhere for you. \"what do they want?\" you think to yourself.\n"
							+ "you decide it was time to go, so you open the crawlspace door and start to walk out. You make it to the backdoor when one of them sees you. They yell STOP, \n"
							+ "you ignore him. He starts firing his weapon. You see your Korean friend go down, you turn around and you feel a sheering pain in your leg, arm, and chest. \n"
							+ "As you passout on the ground another one comes up and says \"you were supposed to keep them alive!\" you think with the last of your time, what the heck just happend.\n"
							+ "running when you are safe is a bad idea. you are now dead.\n");
				}
				
			} 
			}
			else if (choice.equals("n")) {
				out.println("You possibly made a good choice, no need in knowing how the world might end.");
			}
			//end of game
			out.println("Game Over");
		
		}
	}
