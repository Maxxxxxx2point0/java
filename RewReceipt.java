package java_programs;
import static java.lang.System.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter; //write to files
public class RewReceipt {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter fileout = new PrintWriter("receipt.txt");
		fileout.println("+____________________________________+");
		fileout.println("||");
		fileout.println("|Corner Store|");
		fileout.println("|2019-03-28|");
		fileout.println("some Gas|");
		
		//important
		fileout.close(); //save the contents to the file so uou can't write to it anymore
		
	}
}
