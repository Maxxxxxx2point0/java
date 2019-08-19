package java_programs;
import java.util.Scanner;
public class booleanexpressions {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		boolean a,b,c,d,e,f;
		double x,y;
		
		System.out.print("Give me two numbers. First: ");
		x = keyboard.nextDouble();
		System.out.print("The second: ");
		y = keyboard.nextDouble();
		
		a = (x<y);//true
		b = (x<=y);//true
		c =(x==y);//false
		d = (x!=y);//true
		e= (x>y);//false
		f = (x>=y);//false
		
		System.out.println(x + " is less than "+y + " :"+a);
		System.out.println(x + " is less than / equal to " + y+ " :" + b);
		System.out.println(x + " is equal to " +y+ " :" + c);
		System.out.println(x + " is not equal to " + y + " :" +  d);
		System.out.println(x + " is greater than " + y+ " :" + e);
		System.out.println(x + " is greater than / equal to " +y+ " :" + f);
		System.out.print("");
		System.out.print("");
		
		System.out.println(!(x<y) + " " + (x>=y));
		System.out.println(!(x<=y) + " "+ (x > y));
		System.out.println(!(x==y) + " "+ (x != y));
		System.out.println(!(x!=y) + " "+ (x == y));
		System.out.println(!(x>y) + " "+ (x <= y));
	}
}
