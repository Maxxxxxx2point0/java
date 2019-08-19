package java_programs;
import  java.util.Scanner;
import static java.lang.System.*;
public class arraything {
	public static void main(String[] args) {
		/*
		int[] numbers = {};
		for (int i = 0; i == 100; i++) {
			numbers[i] = (int)(Math.random()+1);
			out.println(numbers[i]);
		}*/
		arrayaccess();
	}
	public static void arrayaccess() {
		int [] arr = new int[3];
		//for loop to access each slot of an array
		for(int i = 0; i < arr.length; i++) {
			arr[i]= 1 + (int)(Math.random()*100);
			
		}
		
		//display our values in an array
		out.println("Values:");
		for (int i = 0; i<arr.length; i++) {
			out.print(arr[i] + " ");
		}
		out.println();
		
		arr[0] = 6;
		arr[1] = 7;
		arr[2] = 8;
		//display array values
		out.println("Values " + arr[0]  +" "+ arr[1] +" "+ arr[2]);
		
		arr[0] = 1 + (int)(Math.random()*100);
		arr[1] = 1 + (int)(Math.random()*100);
		arr[2] = 1 + (int)(Math.random()*100);
		
		//display the array values
		out.println("Values " + arr[0]  +" "+ arr[1] +" "+ arr[2]);
		out.println(" ");
		int[] newarray = new int[999];
		for(int i = 0; i < newarray.length; i++) {
			newarray[i] = 1 + (int)(Math.random()*999);
			out.println(newarray[1]);
			
		}
	}
}
