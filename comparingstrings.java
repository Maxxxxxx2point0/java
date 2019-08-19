package java_programs;
import java.util.Scanner;
public class comparingstrings {
 public static void main(String[] args) {
	 //comparing strings
	 Scanner keyboard = new Scanner(System.in);
	 //variables
	 String word;
	 boolean yep, nope;
	 System.out.println("Type the word \"waffle\", please");
	 word = keyboard.next();
	 
	 yep = word.equals("waffle");
	 nope =! word.equals("waffle");
	 
	 System.out.println("you typed what was asked of you: "+yep);
	 System.out.println("You ignored intructions: " + nope);
 }
}
