package java_programs;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static java.lang.System.*;
public class RandomIdeas {
	public static void main(String[] args) {
		//varables
		Scanner keys = new Scanner(System.in);
		String answer;
		
		out.println("Hello there");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("This is some randomness.");
				//telling the program to wait
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//System.exit(0);
				//exits the program
				out.println("Do you want to find out about power? (y/n) ");
		//calling for a method
		unrecognised();
		out.println("Lets check that. Want to learn about power?");
		answer = keys.nextLine().toLowerCase();
		if (answer.equals("y")) {
			//calling for a method
			power();
		}
		else if (answer.equals("n")) {
			out.println("Hmmm, Ok. How about Haribo sugar free gummy bears? (y/n)");
			unrecognised();
			out.println("Lets check that. Want to learn about gummy bears?");
			answer = keys.nextLine().toLowerCase();
			if (answer.equals("y")) {
				out.println("OK, Great!");
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("Well... not really.\n"
						+ "A word from a random guy who reviewed them.");
				out.println("It's long, but funny");
				//calling for a method
				haribo();
			}else {
				out.println("Hmmmm, Ok. Guess you are going to have to \n"
						+ "learn about the reproductive system of Humans!");
				try {
					TimeUnit.SECONDS.sleep(4);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("Just kidding, this is pre ACPS not health. \n"
						+ "You can learn how to start a minecraft server at home.");
				//calling for a method
				minecraft();
			}
			
		}
	}
	//Creating methods
	public static void unrecognised() {
		//more variable
		String answer;
		int no;
		Scanner keys = new Scanner(System.in);
//		getting input from user
		answer = keys.nextLine().toLowerCase();
		if (answer.equals("y") || answer.equals("n")) {
			no = 0;
		}else {
			no = 1;
		}
		//while loop for wrong input
		while (no !=0) {
			out.println("Operation not recognised. Try again?");
			answer = keys.nextLine().toLowerCase();
			if (answer.equals("y") || answer.equals("n")) {
				no = 0;
			}
		}
	}

	public static void power() {
		out.println("It is time for power!\n"
				+ "And now, a word from a random guy on Amazon.");
		//program is sleeping for 1 second
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//printing text
		out.println("Some one asks about power on Amazon\n");
		out.println("Can a flux compacitor be wired in series to increase the wattage up to the giggawattage range?\n" +  
				"Definitely not. Well actually its just impracticable. You would need a left handed transdimensional\n"
				+ "smoke changer as both the polarity of the magic smoke and its transdimensional frequecy are wrong\n"
				+ "for the task. Besides, who uses flux capaciters these days when dilithium forced singularities are available.");
		
	}

	public static void haribo() {
		out.println("My flight was leaving at 8 in the morning. After awaking and trying to get to the airport,\n"
				+ " I forgot to grab something to eat. I usually take my time and do things in order, but not this \n"
				+ "day. I was traveling from Boston to LA coming home from a work trip. I do it regularly so nothing \n"
				+ "was new to me. I stayed in the same hotel and knew the time I needed to leave to get to the airport \n"
				+ "on time. During my work trip, I stopped at a convenience store and saw these gummy bears and thought \n"
				+ "they would be a perfect gift for my son Charlie. He loves gummy bears and gummy worms. So the morning \n"
				+ "I was to head back to LA, I slept through my alarm. That never happens. I rushed to get out of the \n"
				+ "hotel and threw those gummies in my carry on bag to make it on time to the airport. After speeding and \n"
				+ "filling up gas in the rental, I made it to my gate as they were boarding.\n" + 
				"\n" + 
				"I get on the plane and head down the aisle to find my window seat near the middle of the plane. I asked \n"
				+ "politely for the two adorable older ladies siting in the middle and aisle seats if I could pass by to \n"
				+ "my seat. They obliged. The lady in the middle must have been around 80 years old so it took her some t\n"
				+ "ime to get up and make sure she was holding on to something so she didn't fall as she stepped \n"
				+ "into the aisle. I thanked them as I sat and settled into my seat.\n" + 
				"\n" + 
				"Fast forward 20 minutes as we reach our cruising altitude of around 30,000 feet in the air.\n"
				+ " As I reach into my carry on bag to grab my headphones, I see the gummy bears. Since I am \n"
				+ "hungry and need something, I decided to open them up and just have a few to hold me over \n"
				+ "until we land. I wanted to save some for my son so I maybe had 4 or 5. But I had 4 or 5 too \n"
				+ "many because once the bears had a few minutes to adjust to their new home, they began to work.\n" + 
				"\n" + 
				"It started out with a little cramp. Which is normal with gassing on a plane. You do not want \n"
				+ "to fart on a plane so you hold it in. It is airplane etiquette. It would come and go over a \n"
				+ "few minutes so I thought nothing of it. Then it got worse. The cramps intensified, the sweating \n"
				+ "started, and I began to notice the older ladies looking over at me. About 30 minutes into eating \n"
				+ "these bears, my thinking went from, \"Oh these are just farts, I can hold them,\" to \"Oh dear God \n"
				+ "not here.\" I have been a Christian my whole life and this is the test. If there is a God, please \n"
				+ "help me leave this plane with my dignity intact.\n" + 
				"\n" + 
				"After waiting for the intense cramp wave to pass, I stood up and jump over those two women. I could \n"
				+ "not wait for them to stand so I stood up, (my back facing them) and tried to shimmy pass them. \n"
				+ "I think a toot came out cause I heard one say, \"Oh Lord, was that you?\" After reaching the aisle, \n"
				+ "I waddled to the back of the plane where the least amount of risk would be. To my dismay, it was in use. \n"
				+ "That left one bathroom left in the front. I looked down the aisle and saw my Mt. Everest. I had to somehow \n"
				+ "keeps my wet cheeks tighter than Fort Knox whilst waddling forward, whilst praying no one gets out of their seats.\n" + 
				"\n" + 
				"After 5 minutes of stop and go, I made it to the bathroom and was pulling my pants down as I entered the \n"
				+ "bathroom. The door was still unlocked as the sweet release was underway. I thought I died. I thought \n"
				+ "this was it. Even though I was on the throne confessing my sins, I thought my time was called. I lost \n"
				+ "count on how many knocks at the door there was. I must have been in there for 45 minutes, but I made it.\n" + 
				"\n" + 
				"I washed my hands, and threw water in my face to calm me down. Opening the door, I saw the faces looking \n"
				+ "back at me. Apparently the seal to the bathroom was not air tight. Letting just the slightest airflow \n"
				+ "from that bathroom to the main cabin possible. These were daughters, mothers, and children looking at me. \n"
				+ "I could feel their questions and comments. \"What have you done?\" \"We still have 2 hours left.\" \"Please \n"
				+ "divert this plane.\"\n" + 
				"\n" + 
				"As I began walking down, the man in the first row of first class grabbed my arm. He said, \"Hey man, where is \n"
				+ "your seat?\" Confused, I told him and he said, \"Go get your stuff and come back and sit here, you need this \n"
				+ "more then me.\" I was embarrassed and ashamed. I had a family at home waiting for me.\n" + 
				"\n" + 
				"I recommend theses bears to anyone. But please eat them responsibly.");
	}
	public static void minecraft() {
		out.println("What you need in advance:\n"
				+ "A machine with at least 4GB of ram and a dual core processor, Debian or Ubunter server or two linux OS's that are preferred.\n"
				+ "Especially when processor and ram is lower end. This tutorial is done in debian\n\n"
				+ "After you have linux installed and running go over to the web browser and google minecraft server download.\n"
				+ "Go to the minecraft.net website, mincraft server java edition is what the page should say. Download the server.jar file.\n"
				+ "there is a command you can use in the terminal to download the file, but the repositories for the server files are still out of date.\n"
				+ "Since you are probably setting this up on a new machine you need to install a few programs.\n"
				+ "First you need the newest java jre(java runtime enviroment). To do this go to the terminal and enter\n"
				+ "su (hit enter)\n"
				+ "This will bring you into the super user terminal after you enter the root password.\n"
				+ "Next enter apt-get update (enter)\n"
				+ "apt-get install default-jre (enter)\n"
				+ "apt-get install default-jdk (enter)\n"
				+ "During install the terminal will ask you if you want to continue type \"y\" and hit enter for both.\n"
				+ "Next enter apt-get install screen (enter y enter)\n"
				+ "This will allow you to run ther server without being logged in to the server.\n"
				+ "Next you need to make a new folder and move the server.jar to it.\n"
				+ "you can do this through the gui or through the terminal by first typing in mkdir minecraft\n"
				+ "then using cd to enter a folder, cd.. to go back one folder, and mv to move the server.jar file\n"
				+ "Enter the minecraft folder that you made and type java -Xms1G -Xmx1G -jar minecraft_server.jar nogui\n"
				+ "this will start the minecraft server. You should get an error and the server will shutdown.\n"
				+ "This is because you need to accept the EULA.txt. Type ls in the terminal while in the minecraft folder.\n"
				+ "you will see added files in it. You should see a eula.txt in there. Type nano eula.txt. \n"
				+ "This will open the file for editing. go to the last line, it should say false at the end of the line.\n"
				+ "Change that to true. hit ctrl + x and then y and enter. Now type in screen -S minecraft\n"
				+ "This will make a screen that will run in the background. After typing the command you should enter the screen\n"
				+ "automatically, you can tell by seeing the name of the screen behind the cursor in the terminal. If it didn't enter\n"
				+ "you can type screen -r to enter the screen. Now type java -Xms3G -Xmx3G -jar minecraft_server.jar nogui\n"
				+ "This starts the server. Once it says done at in the terminal hit ctrl + a the release ctrl and hit d. This will bring\n"
				+ "out of the screen while keeping the server running. now type ip address into the terminal and look for the ipv4 address.\n"
				+ "Open minecraft on your laptop or desktop and add a new server. In the address area enter the ipv4 address with :25565 at the end.\n"
				+ "The server should pop up and you should enter you new minecraft server. If it doesn't work then that sucks, email me.");
	}
}
