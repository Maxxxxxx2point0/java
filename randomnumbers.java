package java_programs;

public class randomnumbers {
	public static void main(String[] args) {
		int a, b, c, d;
		double r, rps;
		
		//rock paper scissors
		rps = Math.random();
		if(rps < 0.3333333) {
			// happen 1/3 of the time
			System.out.println("Rock");
		}
		else if (rps <0.666667) {
			System.out.println("PAPER");
		}
		else {
			System.out.println("Scissors");
		}
		
		
		//random int 1-10
		a=1+(int)(10*Math.random());
		b=1+(int)(10*Math.random());
		c=1+(int)(10*Math.random());
		d=1+(int)(10*Math.random());
		
		System.out.println("1-10 \t"+a+"\t"+b+"\t"+c+"\t"+d);
		//casting is taking one form of a variable and making it another
		
		
		//number from 0 to 100
		a=1+(int)(100*Math.random());
		b=1+(int)(100*Math.random());
		c=1+(int)(100*Math.random());
		d=1+(int)(100*Math.random());
		System.out.println("1-100 \t"+a+"\t"+b+"\t"+c+"\t"+d);
		
		//numbers from 10-20
		a = 10 + (int)(11 *Math.random());
		b = 10 + (int)(11 *Math.random());
		c = 10 + (int)(11 *Math.random());
		d = 10 + (int)(11 *Math.random());
		
		System.out.println("10-20 \t"+a+"\t"+b+"\t"+c+"\t"+d);
		
		// random doubles 0-1
		System.out.println("0-1:\t"+Math.random() +"\t" +Math.random());

		System.out.println("0-1:\t"+Math.random() +"\t" +Math.random());
		
		System.out.println(30+(int)(21*Math.random()));
		System.out.println(60 +(int)(152*Math.random()));
		
		
		
		
		
		
		
		
	}
}
