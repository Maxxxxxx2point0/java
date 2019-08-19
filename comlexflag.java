package java_programs;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static java.lang.System.*;
public class comlexflag {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		
		printtophalf();
		print48colons();
		print48ohs();
		print48colons();
		print48ohs();
		print48colons();
		print48ohs();
		
		
	}

	private static void print48ohs() {
		// TODO Auto-generated method stub
		out.println("|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|");
	}

	private static void print48colons() {
		// TODO Auto-generated method stub
		out.println("|::::::::::::::::::::::::::::::::::::::::::::::::|");
	}
	public static void print29colons(){
		out.println("|::::::::::::::::::::::::::::|");
	}
	public static void printpledge() {
		out.println("I pledge allegiance to the flag");
	}
	public static void print29ohs() {
		out.println("OOOOOOOOOOOOOOOOOOOOOOOOOO");
	}
	public static void print6stars() {
		out.println("|******");
	}
	public static void print5stars() {
		out.println("|*****");
	}
	public static void printsixstarline() {
		print5stars();
		print29ohs();
	}
	public static void printfivestarline() {
		print5stars();
		print29colons();
	}
	private static void printtophalf() {
		// TODO Auto-generated method stub
		out.println(" ________________________________________________");
		printsixstarline();
		printfivestarline();
		printsixstarline();
		printfivestarline();
		printsixstarline();
		printfivestarline();
		printsixstarline();
	}
}
