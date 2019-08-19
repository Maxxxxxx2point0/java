package java_programs;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static java.lang.System.*;
public class Runningtotal {
 public static void main(String[] args) {
	 Scanner keys = new Scanner(System.in);
	 
	 int current, total = 0;
	 
	 out.println("Type in a bunch of values and i'll add them\n"
	 		+ "I'll stop when zero");
	 
	 do {
		 out.print("Value: ");
		 current = keys.nextInt();
		 keys.nextLine();
		 total += current;
		 //total = total + current
		 out.println("The total so far is: " + total);
	 }while (current != 0);
	 out.print("The final value is " + total);
 }
}
