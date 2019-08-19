package java_programs;
import javax.swing.*;
//import the event package
import java.awt.event.*;
import java.awt.*;
class actionsjavaswing extends JFrame implements ActionListener{
	//create jpanel object
	JPanel pnl = new JPanel();
	JPanel pnl2 = new JPanel();
	//create two buttons
	JButton btn1 = new JButton("Button 1");
	JButton btn2 = new JButton("Button 2");
	JButton btn3 = new JButton("Button 3");
	//text area
	JTextArea area = new JTextArea(5, 38);
	JTextArea area2 = new JTextArea(5, 38);
	
	//create constructor
	public actionsjavaswing() {
		//build stuff
		super("Button Test");
		//set size of window
		setSize(500,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//begin adding out objects to our frame
		
		add(pnl);
		//makes frame visible
		pnl.setVisible(true);
		pnl2.setVisible(false);
		setVisible(true);
		//add buttons and stuff
		pnl.add(btn1);
		pnl.add(btn2);
		pnl.add(area);
		
		//add to pnl2
		pnl2.add(btn3);
		pnl2.add(area2);
		pnl2.setBackground(Color.blue);
		area2.setText("This is panel 2");
		
		//set initial state of components
		btn2.setEnabled(false);
		area.setText("Button two is currently disabled");
		add(pnl2);
		
		//add listeners
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent event) {
		//code in here is what happens when the button is pushed
		area.setText(event.getActionCommand() + " Clicked and disabled");
		if(event.getSource() == btn1) {
			//if btn1 one is clicked what happens
			btn2.setEnabled(true);
			btn1.setEnabled(false);
		}
		if(event.getSource() == btn2) {
			pnl.setVisible(false);
			pnl2.setVisible(true);
			btn1.setEnabled(true);
			btn2.setEnabled(false);
		}
		if(event.getSource() == btn3) {
			pnl.setVisible(true);
			pnl2.setVisible(false);
		}
	}
	public static void main(String[] args) {
		actionsjavaswing action = new actionsjavaswing();
	}
	
}
