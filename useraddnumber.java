package java_programs;

import  java.util.Scanner;
import static java.lang.System.*;

public class useraddnumber {
	public static void main(String[] args) {
		Scanner keys  = new Scanner(System.in);
		
		out.print("Give me number: ");
		int a = keys.nextInt();
		int b = 0;
		for (int i = 1; i <= a; i++) {
			
			b = b + i;
			
		}
		out.println(b);
	}
}
