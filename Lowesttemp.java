package java_programs;
import  java.util.Scanner;
import static java.lang.System.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter; //write to files
import java.util.concurrent.TimeUnit;
public class Lowesttemp {
	public static void main(String[] args) throws Exception {
		double [] temps;
		double lowest = 9999.99;
		
		//read values from local file
		Scanner fin = new Scanner(new File("avg-daily-temps-atx.txt"));
		temps = new double[fin.nextInt()];
		
		out.println(temps.length + " tempatures in database.");
		
		for (int i = 0; i<temps.length; i++) {
			temps[i] = fin.nextDouble();
			
		}
		
		for (int i = 0; i< temps.length; i++) {
			if (temps[i] < lowest) {
				lowest = temps[i];
			}
		}
		out.print("THe lowest average daily temperature was ");
		out.println(lowest + "F (" + FToC(lowest) + "C)");
	}

	private static double FToC(double f) {
		// TODO Auto-generated method stub
		return (f-32)*5/9;
	}
}
