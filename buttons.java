package java_programs;
//allows for jframe options
import javax.swing.*;

import java.awt.*;

public class buttons extends JFrame{
	//create a jpanel object
	JPanel pnl = new JPanel();
	ImageIcon bulb = new ImageIcon("bulb.png");
	JButton btn = new JButton("CLick Me");
	JButton btn1 = new JButton("Check");
	JButton btn3 = new JButton(bulb);
	
	//create constructor
	public buttons() {
		super("Swing Window");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//add the panel to the window
		add(pnl);
		setVisible(true);
		pnl.add(btn);
		pnl.add(btn1);
		pnl.add(btn3);
		
	}
	public static void main(String[] args) {
		buttons whatever = new buttons();
	}
}
