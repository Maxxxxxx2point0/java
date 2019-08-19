package java_programs;
import  java.util.Scanner;
import static java.lang.System.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter; //write to files
public class gettingfromfile {
	public static void main(String[] args) throws Exception{
		Scanner filein = new Scanner(new File("stuff.txt"));
		PrintWriter fileout;
		
		String name;
		int a, b, c, sum;
		
		out.println("Getting name and three numbers from file");
		
		//pull some data from the file
		name = filein.nextLine();
		a = filein.nextInt();
		b = filein.nextInt();
		c = filein.nextInt();
		
		//close the file
		filein.close();
		
		out.println("done");
		out.println("Your name is " + name);
		sum = a + b + c;
		out.println(a + "+" + b + "+" + c + "=" + sum);
		
	}
}
