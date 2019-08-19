package java_programs;
import java.util.Scanner;
public class Sequence {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		double price=0, salesTax, total;
		

		
		System.out.print("How much is the purchase price?");
		price = kboard.nextDouble();
		
		salesTax = price *0.0825;
		total = price + salesTax;
		
		System.out.println("Item price: \t" +price);
		System.out.println("Sales tax: \t" +salesTax);
		System.out.println("Total Cost: \t" + total);
		
	}
}
