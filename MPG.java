package java_programs;
import java.util.Scanner;
public class MPG {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		//Variables
		double milesdriven, gcost, wslfup, driveestamate=0, mpg, h, z;
		int tanksize;
		
		//Gather Data
		System.out.println("Time to calculate how much money you will spend on gas over the next month!");
		System.out.println("How many weeks are in between each fill up?");
		wslfup = kboard.nextDouble();
		
		System.out.println("How many miles have you driven in between each fill up?");
		milesdriven = kboard.nextDouble();
		
		System.out.println("How many gallons do you put in you gas tank? Round to a whole number");
		tanksize = kboard.nextInt();
		
		System.out.println("How much does gas cost right now?");
		gcost = kboard.nextDouble();
		
		//determining how many week are between each fill up
		if (wslfup == 1){
			driveestamate = milesdriven * 4;
		}
		if(wslfup == 2){
			driveestamate = milesdriven * 2;
		}
		if(wslfup == 3) {
			driveestamate = (milesdriven / 3) * 4;
		}
		if(wslfup == 4) {
			driveestamate = milesdriven *1;
		}
		
		mpg = milesdriven/tanksize; // calculating the mpg of the vehicle
		h = driveestamate/mpg;
		z = h*gcost; // calculating total cost of gas for one month
		
		System.out.println("Here is your estamated cost for fuel during the next month: $"+ z);

	}
}
