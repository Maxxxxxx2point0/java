package java_programs;

import javax.swing.*;
import java.awt.*;

public class jframedemo extends JFrame {
	public jframedemo() {
		super("JFrameDemo");
		setSize(400,400);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void paint(Graphics g) {
		super.paint(g);
		//sets background color
		g.setColor(Color.BLACK);
		//paints the bg
		g.fillRect(0, 0, 400, 200);
		g.setColor(Color.blue);
		g.fillRect(0, 200, 400, 200);
		g.setColor(Color.DARK_GRAY);
		g.fillOval(25, 200, 350, 120);
		
		//forground color
		g.setColor(Color.GREEN);
		//sets font
		g.setFont(new Font("Arial", Font.BOLD, 18));
		g.drawString("Mr. McCutchen presents: ",60,200);
		g.setFont(new Font("MONOSPACE", Font.BOLD, 18));
		g.drawString("Parts of a computer: ", 80, 225);
		g.setFont(new Font("Ubuntu", Font.BOLD, 18));
		g.drawString("Get ready to learn", 80, 250);
	}
	public static void main(String[] args) {
		new jframedemo();
	}

}
