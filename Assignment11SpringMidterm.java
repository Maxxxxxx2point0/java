package java_programs;
import java.util.Scanner;

public class Assignment11SpringMidterm {
    public static void main(String[] args){
        Scanner keys = new Scanner(System.in);
        int one, four, win = 0;
        String draft, choice;
        boolean two, three, point;
        
        //Game is shooting Basketball
        //You can choose whether its 2 point shot or 3 point shot
        //The computer(oponant are going to shot only 2 point shot
        //When you shoot 2 point shot, you will have 70% chance of making in
        //When you shoot 3 point shot, you will have 30% chance of making in
        
        System.out.println("You are going to shoot as many basketball as you can and whoever reach to 50points, win the game.");
        
        one = 1 + (int)(50*Math.random());
        one += win;
        
        System.out.println("You can shot from 2 point shot or 3 point shot. Choose one spot!");
        System.out.println("2/3");
        do {
            choice = "";
            while (!choice.equals("H")) {
                choice = keys.nextLine().toLowerCase();
                if (choice.equals("2")) {
                    System.out.println("You are in 2 point shot area. Type 'H' to throw the ball");
                    choice = keys.nextLine().toUpperCase();
                    if (choice.equals("H")) {
                        four = 1 + (int)(10*Math.random());
                        if (four <= 7){
                            System.out.println("Nice Shot! You got 2 points!!");
                            win += 2;
                            System.out.print(win);
                        }
                        else {
                            System.out.println("Darn.. So close!");
                            System.out.print(win);
                        }
                    
                    }
                } if (choice.equals("3")) {
                System.out.println("You are in 3 point shot area. Type 'H' to throw the ball");
                    choice = keys.nextLine().toUpperCase();
                    if (choice.equals("H")) {
                        four = 1 + (int)(10*Math.random());
                        if (four <= 3){
                            System.out.println("Nice Shot! You got 3 points!!");
                            win += 3;
                            System.out.print(win);
                        }
                        else {
                            System.out.println("Darn.. So close!");
                            System.out.print(win);
                        }
                        
                    }
                }
            }
        } while (win < 50);
    }
}
