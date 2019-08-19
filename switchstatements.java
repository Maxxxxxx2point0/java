package java_programs;
import java.util.Scanner;
import static java.lang.System.*;
public class switchstatements {
	public static void main(String[] agrs) {
		Scanner keys = new Scanner(System.in);
		
		int month, days;
		String monthname;
		
		out.println("Which month? (1-12");
		month = keys.nextInt();
		
		//switch statement
		switch(month) {
			case 1: monthname = "January";
			break;
			case 2: monthname = "February";
			break;
			case 3: monthname = "march";
			break;
			case 4: monthname = "April";
			break;
			case 5: monthname = "may";
			break;
			case 6: monthname = "june";
			break;
			case 7: monthname = "july";
			break;
			case 8: monthname = "august";
			break;
			case 9: monthname = "september";
			break;
			case 10: monthname = "october";
			break;
			case 11: monthname = "November";
			break;
			case 12: monthname = "december";
			break;
			default: monthname = "error";
			
		}
		/*thirty days past september
		 * april, june, november
		 * all lthe rest have thirty-one
		 * except for the second one*/
		switch(month) {
			case 9:
			case 4:
			case 6:
			case 11: days = 30;
			break;
			case 2: days = 28;
			break;
			default: days = 31;
		}
		
		out.println(days + " days hath "+monthname);
		
	}
}
