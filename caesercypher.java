package java_programs;

import  java.util.Scanner;
import static java.lang.System.*;

public class caesercypher {
 /* returns the character shifted by the given number of letters*/
	
	public static char shiftLetter(char c, int n) {
		int u = c;
		if (!Character.isLetter(c))
			return c;
		
		u = u + n;
		if(Character.isUpperCase(c) && u > 'Z' || Character.isLowerCase(c) && u >'z'){
			u -=26;
			
		}
		if (Character.isUpperCase(c) && u < 'A' || Character.isLowerCase(c) && u < 'a'){
			u += 26;
		}
		
			
		return (char) u;
		
		
	}
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		String plaintext, cipher = "";
		int shift;
		out.print("Message: ");
		plaintext = keys.nextLine();
		out.print("Shift(0-26): ");
		shift = keys.nextInt();
		for (int i = 0; i< plaintext.length(); i++) {
			cipher += shiftLetter(plaintext.charAt(i), shift);
		}
		out.println(cipher);
	}
}

