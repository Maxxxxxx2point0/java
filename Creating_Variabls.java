package java_programs;

//A variable is a name that refers to a location that holds a value
//That value can be text, number, or it can be null

public class Creating_Variabls {
	public static void main(String[] args) {
		//initialize integer variables
		int x,y, age;
		//initialize decimal variable
		double seconds, e, checking;
		// initialize string variables
		String FirstName, lastName, title;
		
		x=10;
		y=400;
		age=38;
		
		seconds=4.71;
		e=2.71828182845904523536;
		checking=2.89;
		
		FirstName="Matthew";
		lastName="Gadeken";
		title="Sir";
		
		System.out.println("The variable x contains" + x);
		System.out.println("The value"+y+"is stored in variable y");
		System.out.println("took"+seconds+"to run");
		System.out.println("erational number is "+e);
		System.out.println("bank acct has"+checking+ "in it");
		System.out.println("my nam is"+title+" "+FirstName+" "+lastName);
	}
}
