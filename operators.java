package java_programs;

public class operators {
	public static void main(String[] args) {
		int a;
		double d,t,c,g,h,z;
		String start, middle, end, vehicle, print;
		
		a=38;
		
		c=2.20;
		d=342.52434;
		
		start="Total Miles Per Gallon: ";
		middle="Vehicle Type: ";
		end="Total Cost:";
		vehicle="2000 GMC Sierra xlt z71";
		

		t=d/a; //mpg
		print=middle+vehicle;
		g=d*52; //miles for driven in a year
		h=g/t; //miles driven in year divided by mpg
		z=h/c; // miles driven/mpg divided by gas cost
		System.out.println("___________________________________________");
		System.out.println("|					  |");
		System.out.println("|     Miles Per Gallon off one Tank       |");
		System.out.println("|       Tank Size = "+a+" Gallons            |");
		System.out.println("|      Miles Driven = "+ d+" Miles     |");
		System.out.println("|           Cost of fuel = "+c+"            |");
		System.out.println("|					  |");
		System.out.println("|        "+start+"         |");
		System.out.println("|  "+print+"  |");
		System.out.println("|"+start+t+"|");
		System.out.println("|         Cost of fuel for 1 year:        |\n|            "+z+"            |");
		
		System.out.println("|					  |");
		System.out.println("------------------------------------------");
		
	}
}
