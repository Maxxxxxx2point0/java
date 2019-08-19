package java_programs;
import java.util.Scanner;
import static java.lang.System.*;
public class chooseadventuregame {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//variables
		String choice;
		//choose mountains, beach, or Mars
		out.println("you have a choice to go to the mountains, the beach, or Mars. What is your choice?");
		choice = kb.next();
		if (choice.equals("mountains")) {
			//choose setup, find, or sleep
			out.println("Great choice! You got to the mountains and arrive at dark with no food or water; "
					+ "you need to choose to either setup camp, go find water and food, or sleep in your vehicle. What do you choose? ");
			choice = kb.next();
			if (choice.equals("setup")){
				out.println("you go out and find wood, put it all together, and start the fire.\n "
						+ "Out of exhaustion you fall asleep without clearing the pit of debris. You wake up because you can't breath.\n "
						+ "The forest has caught on fire and you are surrounded, cut off from your vehicle. \n"
						+ "You can only last a few more minutes before you collapse from the smoke. \n"
						+ "The forest service find your crispy body while searching for the source of the fire. Guess they found it.");
			}
			else if (choice.equals("find")) {
				out.println("The fake urgancy for food and water right now has go the better of you. The night is young and cold."
						+ " \nWhile looking for food and water you trip and stumble to the ground. "
						+ "\nYou lost your bearings and are now lost. All the equiment needed to survive the night is back at your truck.\n "
						+ "You curl up in a ball next to a tree and fall asleep. During the night you froze and are now dead. Good job.");
			}
			else if (choice.equals("sleep")) {
				out.println("You realize that food and water aren't necessary for tonight. \n"
						+ "You get out your sleeping bag get in and fall asleep. You wake up in the morning hungary and thirsty, but alive.");
			}
		}
		else if(choice.equals("beach")) {
			//choose sleep, restaurant, or swim
			out.println("Worse choice. After driving for atleast 15 hours you are very tired and ready to fall asleep. "
					+ "you need to decide if you are going to sleep, go to a restaurant, or go for a swim. What is your choice?");
			choice = kb.next();
			if(choice.equals("sleep")) {
				out.println("Good idea, now you won't drown or crash and die.");
			}
			else if (choice.equals("restaurant")) {
				out.println("You find that you are hungry and want food. You are driving to the nearest restaurant, during your commute you swerve of the road and flip your vehicle. \n"
						+ "The police found your bodie the next day. Don't drive when your exhausted.");
			}
			else if (choice.equals("swim")) {
				out.println("For some reason you though that swimming while falling asleep was a good idea. you last two minutes before falling asleep. \n"
						+ "The fish eat your remains and your skeleton washes up in cuba. Hint, your dead.");
			}
		}
		else if(choice.equals("Mars")){
			//choose wait, walk, or pilot
			out.println("It's Mars, the choice that will change your life. Time to choose if you are going to wait\n"
					+ " on the rocket until you get to mars, go for a space walk, or try to pilot the rocket ship.");
			choice = kb.next();
			if(choice.equals("wait")) {
				out.println("Well, the shuttle explodes with you and three other people in it. NASA doesn't know why it exploded. \n"
						+ "You just sent the mars mission back another fifty years. Thanks.");
			}
			else if (choice.equals("walk")) {
				out.println("The others are in their bunks and you find yourself bored. You think to yourself \"a space walk is in order.\" you are out in space when suddenly the rocket explodes.\n "
						+ "It launches you back and your are sent into space. Eventually you hit something and find out it is an alien space ship. They bring you aboard and start studying you. \n"
						+ "You live the rest of your life on the alien spaceship and become part of their crew. Told you it would change your life.");
			}
			else if(choice.equals("pilot")) {
				out.println("You think it is a good idea to try to fly the space shuttle. You climb into the cockpit and grab the controls. You are actually piloting the space shuttle. \n"
						+ "You bank hard and you hit the side and hit a few switches. The shuttle is now going at full thrust into the depths of space. \n"
						+ "An asteroid belt comes up on your left and the rocket goes towards it on its own. The rocket hits an asteroid and you die. ");
			}
			
		}
	}
}
