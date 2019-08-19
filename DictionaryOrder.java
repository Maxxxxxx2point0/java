package java_programs;
import java.util.Scanner;
import static java.lang.System.*;
public class DictionaryOrder {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		
		String name;
		
		out.println("Make up the name of a programming language!");
		name = keys.nextLine().toLowerCase();// .toUppercase();
		
		if(name.compareTo("c++") <0) {
			out.println(name + " comes before c++");
		}
		if (name.compareTo("c++") ==0) {
			out.println("c++ isn't a made up language");
		}
		if (name.compareTo("c++") >0) {
			out.println(name + " comes after c++");
		}
		//basic compare
		if(name.compareTo("BASIC") <0) {
			out.println(name + " comes before BASIC");
		}
		if (name.compareTo("BASIC") ==0) {
			out.println("BASIC isn't a made up language");
		}
		if (name.compareTo("BASIC") >0) {
			out.println(name + " comes after BASIC");
		}
		
		//Compare Java
		if(name.compareTo("java") <0) {
			out.println(name + " comes before java");
		}
		if (name.compareTo("java") ==0) {
			out.println("java isn't a made up language");
		}
		if (name.compareTo("java") >0) {
			out.println(name + " comes after java");
		}
		
		//compare go
		if(name.compareTo("go") <0) {
			out.println(name + " comes before go");
		}
		if (name.compareTo("go") ==0) {
			out.println("go isn't a made up language");
		}
		if (name.compareTo("go") >0) {
			out.println(name + " comes after go");
		}
		
		//python
		if(name.compareTo("python") <0) {
			out.println(name + " comes before python");
		}
		if (name.compareTo("python") ==0) {
			out.println("python isn't a made up language");
		}
		if (name.compareTo("python") >0) {
			out.println(name + " comes after python");
		}
		//ruby
		if(name.compareTo("ruby") <0) {
			out.println(name + " comes before ruby");
		}
		if (name.compareTo("ruby") ==0) {
			out.println("ruby isn't a made up language");
		}
		if (name.compareTo("ruby") >0) {
			out.println(name + " comes after ruby");
		}
		//visual basic
		if(name.compareTo("visualbasic") <0) {
			out.println(name + " comes before visualbasic");
		}
		if (name.compareTo("visualbasic") ==0) {
			out.println("visualbasic isn't a made up language");
		}
		if (name.compareTo("visualbasic") >0) {
			out.println(name + " comes after visualbasic");
		}
/* if(self.compareTo(other_ <0) // true when self <other */
	}

}
