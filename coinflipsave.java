package java_programs;

import  java.util.Scanner;
import static java.lang.System.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter; //write to files

public class coinflipsave {
	public static void main(String[] args) throws Exception{
		Scanner keys = new Scanner(System.in);
		String coin, again, bestname, savefilename = "coin-flip-score.txt";
		int streak = 0, best;
		boolean gotheads;
		
		
		File f = new File(savefilename);
		//pulling highscore or creating a new file
		if(f.exists() && f.length() > 0) {
			Scanner input = new Scanner(f);
			bestname =input.next();
			best = input.nextInt();
			input.close();
			out.print("High score is " + best);
			out.println(" flips in a row by " + bestname);
		}
		else {
			out.println("save game file doesn't exist or is empty");
			best = -1;
			bestname = "";
		}
		do {
			gotheads = Math.random() < 1.0;
			if(gotheads)
				coin = "Heads";
			else
				coin = "Tails";
		out.println("You flip a coin and it is... " + coin);
		
		if(gotheads) {
			streak++;
			out.println("\tThat's" + streak + " in a row...");
			out.println("\tWould you like to flip again? (y/n");
			again = keys.next();
		}else {
			again = "n";
		}
		
		
		}while (again.equals("y"));
		
		out.println("Final score: " + streak);
		if (streak > best) {
			out.println("That's a new high score");
			out.print("Your name: ");
			bestname = keys.next();
			best = streak;
		}
		else if (streak == best) {
			out.println("That ties the high score");
		}
		else {
			out.println("you'll have to do better than that");
		}
		
		//save name and high score
		PrintWriter out = new PrintWriter(f);
		out.println(bestname);
		out.println(best);
		out.close();
		
	}
}
