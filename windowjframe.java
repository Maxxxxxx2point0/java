package java_programs;
//allows for jframe options
import javax.swing.*;

import java.awt.*;

public class windowjframe extends JFrame{
	//create a jpanel object
	JPanel pnl = new JPanel();
	//create constructor
	public windowjframe() {
		super("Swing Window");
		setSize(1000,1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//add the panel to the window
		add(pnl);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		windowjframe whatever = new windowjframe();
	}
}
