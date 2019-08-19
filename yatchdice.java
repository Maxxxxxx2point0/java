package java_programs;

public class yatchdice {
	public static void main(String[] args){
		int r1, r2, r3, r4, r5, attempt = 0;
		boolean allsame;
		
		do {
			r1 = 1 + (int)(Math.random()*6);
			r2 = 1 + (int)(Math.random()*6);
			r3 = 1 + (int)(Math.random()*6);
			r4 = 1 + (int)(Math.random()*6);
			r5 = 1 + (int)(Math.random()*6);
			System.out.print("You rolled: " + r1 + " " + r2+ " ");
			System.out.print(r3 + " " + r4 + " " + r5);
			showdice(r1);
			showdice(r2);
			showdice(r3);
			showdice(r4);
			showdice(r5);
			allsame = (r1 == r2 && r2 == r3 && r3 == r4 && r4 ==r5);
			
			attempt += 1;
			System.out.println(attempt);
		}while (!allsame);
		
		System.out.println("Yahtzee");
	}
	//main method over
	public static void showdice(int roll) {
		System.out.println("+___+");
		if (roll == 1) {
			System.out.println("|   |");
			System.out.println("| 0 |");
			System.out.println("|   |");
		}
		if (roll == 2) {
			System.out.println("|   |");
			System.out.println("| 0 |");
			System.out.println("|   |");
			System.out.println("| 0 |");
		}
		if (roll == 3) {
			System.out.println("| 0 |");
			System.out.println("| 0 |");
			System.out.println("| 0 |");
		}
		if (roll == 4) {
			System.out.println("|0 0|");
			System.out.println("|   |");
			System.out.println("|0 0|");
		if (roll == 5) {
			System.out.println("|0 0|");
			System.out.println("| 0 |");
			System.out.println("|0 0|");
			}
		if (roll == 3) {
			System.out.println("|0 0|");
			System.out.println("|0 0|");
			System.out.println("|0 0|");
		}
		System.out.println("+___+");

		}
	}
}
