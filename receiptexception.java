package java_programs;

import static java.lang.System.*;
import java.io.IOException;
import java.io.PrintWriter; //write to files

public class receiptexception {
	public static void main(String[] args) {
		PrintWriter fileout;
		
		try {
				fileout = new PrintWriter("receipt.txt");
		} catch (IOException err) {
			out.println("Sorry, I can't open receipt.txt for writing\n"
					+ "Mayber the file exists and is read-only?");
			fileout=null;
			System.exit(1);
			
			
		}
		fileout.println("+_________________________rip___________+");
		fileout.println("||");
		fileout.println("|Corner Store|");
		fileout.println("|2019-03-28|");
		fileout.println("some Gas|");
		
		//important
		fileout.close(); //save the contents to the file so uou can't write to it anymore
	}
}
