package java_programs;
import  java.util.Scanner;
import static java.lang.System.*;
public class Arrays {
	public static void main(String[] args) {
		/*
		//declar array
		String[] planets = {"Mercury", "Venus", "Earth", " Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"
		};
		for (String p : planets) {
			out.println(p + "\t" + p.toUpperCase()); 
		
		}*/
		//arraysearch();
		itemnotfound();
	}
	public static void arraysearch() {
		
		//searching arrays
		Scanner keys = new Scanner(System.in);
		int[] ordernumbers = {12345, 54321, 101010, 8675309, 31415, 271828, 3542, 6548233, 842551847, 2254, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int toFind;
		out.print("There are " + ordernumbers.length);
		//.lenght will cound the amount of entries in the array
		out.println(" orders in the database\n");
		out.print("Orders: ");
		for(int num : ordernumbers) {
			out.print(num + " ");
		}
		out.println("\nWhich order to find?");
		toFind = keys.nextInt();
		
		for(int num : ordernumbers) {
			if(num == toFind) {
				out.println(num + " found");
			}else {
				out.println("Number not found");
			}
			
		}
	}
	public static void itemnotfound() {
		Scanner keys = new Scanner(System.in);
		String[] heroes = {"hulk", "Thor", "IronMan", "Hawkeye", "BlackWidow", "CaptainAmerica", "Spiderman", "BlackPanther", "DoctorStrange", "AntMan", "fantasticfour",
				"Vision", "ultron", "Frodo", "Bilbo", "irongiant", "gamora", "groot", "frozone"
		};
		String guess;
		boolean found;
		
		out.println("Pop Quiz!");
		out.println("Name any important Marvel superhero");
		guess = keys.nextLine();
		found = false;
		for(String hero : heroes) {
			if(guess.equals(hero)) {
				out.println("That's one of them!");
				found = true;
			}
		}
		
		if(found == false) {
			out.println("No," + guess + " wasn't a Marvel superhero");
		}
		
		
		
		
	}
}
