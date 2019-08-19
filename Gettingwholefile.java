package java_programs;

import  java.util.Scanner;
import static java.lang.System.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter; //write to files

public class Gettingwholefile { 
	public static void main(String[] args) throws Exception{
		int fourletter = 0;
		int caps = 0;
		
		String fn1 = "morestuff.txt";
		String fn2 = "/home/matthew/eclipse-workspace/java_programs/src/java_programs/Gettingwholefile.java";
		
		Scanner wordReader = new Scanner(new File(fn1));
		
		while(wordReader.hasNext()) {
			String w = wordReader.next();
			if(w.length() == 4) {
				fourletter++;
			}
		}
		wordReader.close();
		
		Scanner selfinput = new Scanner(new File(fn2));
		
		while(selfinput.hasNext()) {
			String token = selfinput.next();
			if(Character.isUpperCase(token.charAt(0))) {
				caps++;
			}
		}
		selfinput.close();
		out.println(fourletter + " four-letter word in" + fn1);
		out.println(caps + "words that start with capitals in "+ fn2);
	}
}
