package java_programs;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static java.lang.System.*;
public class thirtydaysfunctions {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		
		out.println("Which month? 1-12");
		int month = keys.nextInt();
		out.println(monthdays(month) + " days hath " + monthname(month));
		
	}
	public static String monthname (int month) {
		String monthname = "error";
		
		if(month == 1) {
			monthname = "january";
		}
		else if(month == 2) {
			monthname = "February";
		}
		else if(month == 3) {
			monthname = "March";
		}
		else if(month == 4) {
			monthname = "April";
		}
		else if(month == 5) {
			monthname = "May";
		}
		else if(month == 6) {
			monthname = "June";
		}
		else if(month == 7) {
			monthname = "July";
		}
		else if(month == 8) {
			monthname = "August";
		}
		else if(month == 9) {
			monthname = "September";
		}
		else if(month == 10) {
			monthname = "October";
		}
		else if(month == 11) {
			monthname = "November";
		}
		else if(month == 12) {
			monthname = "December";
		}
		return monthname;
	}
	public static int monthdays(int month) {
		//switch statement
		int days;
		switch (month) {
		case 9:
		case 4:
		case 6:
		case 11: days = 30;
		break;
		case 2: days = 28;
		break;
		default: days = 31;
		}
		
		return days;
		
	}
}
