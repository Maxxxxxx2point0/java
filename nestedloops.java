package java_programs;

import static java.lang.System.*;

public class nestedloops {
	public static void main(String[] args) {
	//loop 1
		int n, a, b;
		for (char c = 'A'; c<= 'E'; c++) {
			//second
			for (n = 1; n <= 3; n++) {
				out.println(c + " " + n);	
			}
			
		}
		out.println();
		//nested loop
		for (a = 1; a<= 3; a++) {
			for (b = 1; b<= 3; b++) {
				out.print("(" + a + "," + b + ")");
			}
			out.println();
		}
		
		
	}
}
