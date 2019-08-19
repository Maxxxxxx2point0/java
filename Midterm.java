package java_programs;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static java.lang.System.*;
public class Midterm {
	public static void main(String[] args) {
		//getting scanner and declaring variables
		Scanner keys = new Scanner(System.in);
		String answer, needs, needstwo, needsthree, needsfour, needsfive, printstuff;
		int no, sleeping, budget, thing;
		boolean going = true;
		
		
		do {
		out.println("Want to build a computer? (y/n)");
		//setting what the conditions are 
		needs = "y";
		needstwo = "n";
		needsthree = null;
		needsfour = null;
		needsfive = null;
		printstuff = "";
		//getting input from user
		answer = keys.nextLine().toLowerCase();

		//calling for a method and getting a variable from it
		//method unrecognised is a while loop for wrong input
		answer = unrecognised(needs, needstwo, answer, needsthree, needsfour, needsfive, printstuff);
		if (answer.equals("y")) {
			needs = "gaming";
			needstwo = "a pc at a business";
			needsthree = "light gaming, but also for work";
			needsfour = "cad";
			needsfive = "video editing";
			out.println("Ok, lets start off with what the main purpose of the computer is.");
			printstuff = "What are you going to use it for?\n"
					+ needs + "\n"
					+ needstwo + "\n"
					+ needsthree + "\n"
					+ needsfour + "\n"
					+ needsfive;

			
			out.println(printstuff);
			//getting input and checking for error
			answer = keys.nextLine().toLowerCase();
			answer = unrecognised(needs, needstwo, answer, needsthree, needsfour, needsfive, printstuff);
			if (answer.equals(needs) || answer.equals(needstwo) || answer.equals(needsthree) || answer.equals(needsfour) || answer.equals(needsfive)) {
				//no loop
				no = 0;
			}else {
				//loop
				no = 1;
			}
			answer = unrecognised(needs, needstwo, answer, needsthree, needsfour, needsfive, printstuff);
			 if (answer.equals(needs)) {
				 sleeping = 1;
				 time(sleeping);
				 out.println("Ok, so you want to build a computer for " + needs +
						 "\nYou will need some higher end equipment.");
				 out.println("What is your budget?");
				 //getting input from user
				 budget = keys.nextInt();
				 //ending the line
				 keys.nextLine();
				 //deciding what to do with the input
				 compbudget(budget, answer, needs, needstwo, needsthree, needsfour, needsfive, printstuff);
				 
				 
			 }
			 else if (answer.equals(needstwo)) {
				 sleeping = 1;
					time(sleeping);
				 out.println("Ok, so you want to build a computer for " + needstwo);
				 out.println("What is your budget?");
				 //getting input from user
				 budget = keys.nextInt();
				 //ending the line
				 keys.nextLine();
				//deciding what to do with the input
				 compbudget(budget, answer, needs, needstwo, needsthree, needsfour, needsfive, printstuff);
			 }
			 else if (answer.equals(needsthree)) {
				 sleeping = 1;
					time(sleeping);
				 out.println("Ok, so you want to build a computer for " + needsthree);
				 out.println("What is your budget?");
				 //getting input from user
				 budget = keys.nextInt();
				 //ending the line
				 keys.nextLine();
				//deciding what to do with the input
				 compbudget(budget, answer, needs, needstwo, needsthree, needsfour, needsfive, printstuff);
			 }
			 else if (answer.equals(needsfour)) {
				 sleeping = 1;
					time(sleeping);
				 out.println("Ok, so you want to build a computer for " + needsfour);
				 out.println("What is your budget?");
				 //getting user input
				 budget = keys.nextInt();
				 //ending line
				 keys.nextLine();
				//deciding what to do with the input
				 compbudget(budget, answer, needs, needstwo, needsthree, needsfour, needsfive, printstuff);
			 }
			 else if (answer.equals(needsfive)) {
				 sleeping = 1;
					time(sleeping);
				 out.println("Ok, so you want to build a computer for " + needsfive);
				 out.println("What is your budget?");
				 //getting input from user
				 budget = keys.nextInt();
				 //ending line
				 keys.nextLine();
				//deciding what to do with the input
				 compbudget(budget, answer, needs, needstwo, needsthree, needsfour, needsfive, printstuff);
			 }
			 //asking more stuff
			printstuff = "How confident are you in building a computer?\n"
					+ "not very\n"
					+ "adequate\n"
					+ "confident\n"
					+ "expert\n"
					+ "not sure\n";
			needs ="not very";
			needstwo = "adequate";
			needsthree = "confident";
			needsfour = "expert";
			needsfive = "not sure";
			out.print(printstuff);
			//input from user
			answer = keys.nextLine().toLowerCase();
			//checking for issues
			answer = unrecognised(needs, needstwo, answer, needsthree, needsfour, needsfive, printstuff);
			//implementing logic
			if (answer.equals(needs)){
				sleeping = 3;
				time(sleeping);
				out.println("OK, you should probably have me build it.");
			}
			else if (answer.equals(needstwo)) {
				sleeping = 3;
				time(sleeping);
				out.println("OK, you should watch some videos, good luck.");
			}
			else if (answer.equals(needsthree)) {
				sleeping = 3;
				time(sleeping);
				out.println("Good, it shouldn't be too hard then.");
			}
			else if (answer.equals(needsfour)) {
				sleeping = 3;
				time(sleeping);
				out.println("OK, don't need no help with building it.");
			}
			else if (answer.equals(needsfive)) {
				out.println("Ok, I will make a guess for you then.");
				sleeping = 2;
				time(sleeping);
				thing = 1 + (int)(Math.random()*10);
				if (thing <6) {
					out.println("Looks like I will be building your computer, give me money");
				}
				else {
					out.println("OK, you can try to build your computer, watch some videos, good luck.");
				}
			}
			//checking if program end is near
			out.println("Need anymore help? (y/n)");
			needs = "y";
			needstwo = "n";
			needsthree = null;
			needsfour = null;
			needsfive = null;
			printstuff = "";

			//calling for a method and getting a variable from it
			//method unrecognised is a while loop for wrong input
			answer = keys.nextLine().toLowerCase();
			answer = unrecognised(needs, needstwo, answer, needsthree, needsfour, needsfive, printstuff);
			if (answer.equals(needs)) {
				out.println("OK");
			}else {
				out.println("OK, have fun blowing stuff up");
				going = false;
			}
			
		}else {
			out.println("Well that sucks. What did the unbuilt computer do to you?");
			going = false;
		}
	
		}while (going);
		
		
		
		
		
		
	}
	public static String unrecognised(String needs, String needstwo, String answer, String needsthree, String needsfour, String needsfive, String printstuff) {
		//more variable
		int no;
		Scanner keys = new Scanner(System.in);

		if (answer.equals(needs) || answer.equals(needstwo) || answer.equals(needsthree) || answer.equals(needsfour) || answer.equals(needsfive)) {
			no = 0;
		}else {
			no = 1;
		}
		//while loop for wrong input
		while (no !=0) {
			out.println("Operation not recognised. Try again?");
			if (!printstuff.equals("")) {
				out.println(printstuff);
			}
			answer = keys.nextLine().toLowerCase();
			if (answer.equals(needs) || answer.equals(needstwo) || answer.equals(needsthree) || answer.equals(needsfour) || answer.equals(needsfive)) {
				no = 0;
			}
		}
		return answer;
	}
	public static void time(int sleeping) {
		//time
		try {
			TimeUnit.SECONDS.sleep(sleeping);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void compbudget(int budget, String answer, String needs, String needstwo, String needsthree, String needsfour, String needsfive, String printstuff) {
		//this is basically a method with filled with text and some logic
		if(budget <400 && answer.equals(needs)) {
			out.println("You need more money");
			out.println("These are some of the parts you can get with a little more:\n"
					+ "450 watt power supply, Asrock pro4 motherboard or similar, \n"
					+ "AMD 2200G processor, 250GB samsung evo ssd, windows home off of ebay, \n"
					+ "8GBs of DDR4 ram, optional: GTX 1050Ti or rx 450 GPU, 1TB HDD");
		}
		else if (budget < 800 && budget > 400 && answer.equals(needs)) {
			out.println("That is a decent amount, you can get some of these parts:\n"
					+ "550 watt power supply, asrock gaming k4 motherboard or similar, \n"
					+ "Ryzen 5 1600X or similar, 500GB ssd, windows home off of ebay, 16 - 32GBs of ram, \n"
					+ "nvidia 1060, 1070, 2060, 1660, rx 480, 570, 580, 1 TB HDD");
		}
		else if (budget > 800 && answer.equals(needs)) {
			out.println("OK, that should be enough money to make a pretty good rig.\n"
					+ "Good parts:\n"
					+ "650 - 1200 watt power supply, asrock gaming k6 motherboard or similar,\n"
					+ "Ryzen 7 - Threadripper or intel equivalent, 500GB - 1TB samsung 860 evo or 970 evo ssd,\n"
					+ "1TB HDD, 2080/ti's or vega 56/64's");
		}
		else if (budget < 400 && answer.equals(needstwo)) {
			out.println("You can make a decent machine, but should get more money");
			out.println("These are some of the parts you can get with a little more:\n"
					+ "450 watt power supply, Asrock pro4 motherboard or similar, \n"
					+ "AMD 2200G processor, 250GB samsung evo ssd, windows home off of ebay, \n"
					+ "8GBs of DDR4 ram, 1TB HDD, optional: GTX 1050 or rx 450 GPU");
		}
		else if (budget < 800 && budget > 400 && answer.equals(needstwo)) {
			out.println("That is a decent amount, you can get some of these parts:\n"
					+ "550 watt power supply, asrock gaming k4 motherboard or similar, \n"
					+ "Ryzen 5 2600X or similar, 500GB ssd, windows home off of ebay, 16 - 32GBs of ram, \n"
					+ "nvidia 1050ti, rx 480, 570, 1-2TB HDD");
		}
		else if (budget > 800 && answer.equals(needstwo)) {
			out.println("OK, that should be enough money to make a pretty good rig.\n"
					+ "Good parts:\n"
					+ "650 - 1200 watt power supply, asrock gaming k6 motherboard or similar,\n"
					+ "Ryzen 7 - Threadripper or intel equivalent, 500GB - 1TB samsung 860 evo or 970 evo ssd,\n"
					+ "16-32GBs or ram, 1-2 TB HDD, GTX 1080ti, rtx 2080, 2070/ti, or rx vega 56 or 64");
		}
		else if (budget < 400 && answer.equals(needsthree)) {
			out.println("You will possibly have issues playing some Half Life 2, but work will be ok.\n"
					+ "You should get more money.");
			out.println("These are some of the parts you can get with a little more:\n"
					+ "450 watt power supply, Asrock pro4 motherboard or similar, \n"
					+ "AMD Ryzen 5 2400G processor, 250GB samsung evo ssd, windows home off of ebay, \n"
					+ "4GBs of DDR4 ram, 1TB HDD, optional: GTX 1050 or rx 450 GPU");
		
		}
		else if (budget < 800 && budget > 400 && answer.equals(needsthree)) {
			out.println("That is a decent amount, you can get some of these parts:\n"
					+ "550 watt power supply, asrock gaming k4 motherboard or similar, \n"
					+ "Ryzen 5 2600X or similar, 500GB ssd, windows home off of ebay, 16 - 32GBs of ram, \n"
					+ "nvidia 1050ti, rx 480, 570, 1-2TB HDD");
		}
		else if (budget > 800 && answer.equals(needsthree)) {
			out.println("OK, that should be enough money to make a pretty good rig.\n"
					+ "Good parts:\n"
					+ "650 - 1200 watt power supply, asrock gaming k6 motherboard or similar,\n"
					+ "Ryzen 7 - Threadripper or intel equivalent, 500GB - 1TB samsung 860 evo or 970 evo ssd,\n"
					+ ", 16 - 32GBs or ram, 1-2 TB HDD, GTX 1060 3GB, 1660, rtx 2060, or rx vega 56, 570/80");
		}
		else if (budget < 300 && answer.equals(needsfour)) {
			out.println("The computer will be ok, not good. Don't try to make a big object");
			out.println("These are some of the parts you can get with a little more:\n"
					+ "450 watt power supply, Asrock pro4 motherboard or similar, \n"
					+ "AMD Ryzen 3 2200G processor, 250GB samsung evo ssd, windows home off of ebay, \n"
					+ "8GBs of DDR4 ram, 1TB HDD, optional: GTX 1050 or rx 450, 550 GPU");
			out.println("You really should get a rx 550 for the vram, but that is also half your budget.");
		}
		else if (budget < 800 && budget > 400 && answer.equals(needsfour)) {
			out.println("That is a decent amount, you can get some of these parts:\n"
					+ "550 watt power supply, asrock gaming k4 motherboard or similar, \n"
					+ "Ryzen 5 2600X or similar, 500GB ssd, windows home off of ebay, 16 - 32GBs of ram, \n"
					+ "nvidia 1050ti, rx 570, 580, 1-2TB HDD");
		}
		else if (budget > 800 && answer.equals(needsfour)) {
			out.println("OK, that should be enough money to make a pretty good rig.\n"
					+ "Good parts:\n"
					+ "650 - 1200 watt power supply, asrock gaming k6 motherboard or similar,\n"
					+ "Ryzen 7 - Threadripper or intel equivalent, 500GB - 1TB samsung 860 evo or 970 evo ssd,\n"
					+ ", 16 - 32GBs or ram, 1-2 TB HDD, GTX 1060 6GB, 1660, rtx 2060, or rx vega 56, 570/80");
		}
		else if (budget < 300 && answer.equals(needsfive)) {
			out.println("Considering GPU is what you should be using, get more money.");
			out.println("These are some of the parts you can get with more:\n"
					+ "450 watt power supply, Asrock pro4 motherboard or similar, \n"
					+ "AMD Ryzen 3 2200G processor, 250GB samsung evo ssd, windows home off of ebay, \n"
					+ "8GBs of DDR4 ram, 1TB HDD, GTX 1050 or rx 550 GPU");
		}
		else if (budget < 800 && budget > 400 && answer.equals(needsfive)) {
			out.println("That is a decent amount, you can get some of these parts:\n"
					+ "550 watt power supply, asrock gaming k4 motherboard or similar, \n"
					+ "Ryzen 3 2200G or similar, 500GB ssd, windows home off of ebay, 16 - 32GBs of ram, \n"
					+ "nvidia 1050ti, 2060, rx 570, 580, 1-2TB HDD");
		}
		else if (budget > 800 && answer.equals(needsfive)) {
			out.println("OK, that should be enough money to make a pretty good rig.\n"
					+ "Good parts:\n"
					+ "650 - 1200 watt power supply, asrock gaming k6 motherboard or similar,\n"
					+ "Ryzen 7 - Threadripper or intel equivalent, 500GB - 1TB samsung 860 evo or 970 evo ssd,\n"
					+ ", 16 - 32GBs or ram, 1-2 TB HDD, GTX 1060 6GB, 1660, rtx 2060, or rx vega 56, 570/80");
			out.println("If you want really good export performance try the trx titan, 24GB of ddr6 vram\n"
					+ " with a price of around $1500");
		}
	}
}
