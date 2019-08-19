package java_programs;
//allows for jframe options
import javax.swing.*;

import java.awt.*;

public class textfields extends JFrame{
	//create a jpanel object
	JPanel pnl = new JPanel();
	//create a object
	JTextField txt1 = new JTextField("38");
	JTextField txt2 = new JTextField("Default Text", 38);
	JTextArea txtarea = new JTextArea(5, 37);
	JSlider slider = new JSlider(0, 100, 50);
	public textfields() {
		super("Srwing Window");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//add the panel to the window
		add(pnl);
		
		setVisible(true);
		
		//text wrapping
		txtarea.setLineWrap(true);
		txtarea.setWrapStyleWord(true);
		pnl.add(txt1);
		pnl.add(txt2);
		pnl.add(slider);
		pnl.add(txtarea);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
	}
	public static void main(String[] args) {
		textfields whatever = new textfields();
		/*labels whateverstuff = new labels();*/
		//calling method from different file
	}
}
