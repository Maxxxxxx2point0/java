package java_programs;

import static java.lang.System.*;

public class evennumberthing {
	public static void main(String[] args) {
		out.println("counting from 1 to 20 with () around even numbers");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				out.println("(" + i + ")");
			}
			else{
				out.println(i);
			}
		}
	}
}
