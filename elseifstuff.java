package java_programs;
import java.util.Scanner;
public class elseifstuff {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		double bmi;
		
		System.out.print("Enter your BMI: ");
		bmi = kb.nextDouble();
		
		System.out.print("BMI catagory: ");
		
		if(bmi < 15) {
			System.out.println("very severly under weigth");
		}
		else if (bmi <= 16) {
			System.out.println("severly under weight");
		}
		else if (bmi <= 18.5) {
			System.out.println("underweight");
		}
		else if (bmi <= 25.0) {
			System.out.println("normal weight");
		}
		else if (bmi <= 30.0) {
			System.out.println("overweight");
		}
		else if (bmi <= 35.0) {
			System.out.println("moderatly overweight");
		}
		else if (bmi <=40) {
			System.out.println("severly overweight");
		}
		else {
			System.out.println("Go see a doctor");
		}
	}
}
