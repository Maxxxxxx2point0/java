package java_programs;
//allows for jframe options
import javax.swing.*;

import java.awt.*;

public class labels extends JFrame{
	//create a jpanel object
	JPanel pnl = new JPanel();
	//uses picture
	ImageIcon bulb = new ImageIcon("bulb.png");
	JLabel lbl1 = new JLabel(bulb);
	JLabel lbl2 = new JLabel("This is a lightbulb");
	JLabel lbl3 = new JLabel("Bulb", bulb, JLabel.CENTER);
	
	
	//create constructor
	public labels() {
		super("Stwing Window");
		setSize(500,500);
		//add panel color
		pnl.setBackground(Color.green);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//add the panel to the window
		add(pnl);
		lbl3.setHorizontalTextPosition(JLabel.CENTER);
		lbl3.setVerticalTextPosition(JLabel.BOTTOM);
		pnl.add(lbl1);
		pnl.add(lbl2);
		pnl.add(lbl3);
		setVisible(true);

		
	}
	public static void main(String[] args) {
		labels whatever = new labels();
	}
}
