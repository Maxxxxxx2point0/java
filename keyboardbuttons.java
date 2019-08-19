package java_programs;
import javax.swing.*;
//import the event package
import java.awt.event.*;
import java.awt.*;
class keyboardbuttons extends JFrame implements KeyListener{

	//create objects
	JPanel pnl = new JPanel();
	JTextField field = new JTextField(38);
	JTextArea area = new JTextArea(5, 39);
	
	//constructor
	public keyboardbuttons() {
		super("Keyboard Keys");
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//add objects
		add(pnl);
		pnl.add(area);
		pnl.add(field);
		
		//addlister
		field.addKeyListener(this);
		setVisible(true);
		
		
		
	}
	
	
	
	
	@Override
	public void keyPressed(KeyEvent ke) {
		// TODO Auto-generated method stub
		area.setText("Key pressed ");
	}

	@Override
	public void keyReleased(KeyEvent ke) {
		// TODO Auto-generated method stub
		int keyCode = ke.getKeyCode();
		area.append("\nKey Code: " + ke.getKeyCode());
		area.append("\n Key Text: " + ke.getKeyText(keyCode));
	}

	@Override
	public void keyTyped(KeyEvent ke) {
		// TODO Auto-generated method stub
		area.append("\rCharacter: " + ke.getKeyChar());
	}
	public static void main(String[] args) {
		keyboardbuttons newkey = new keyboardbuttons();
		
	}
}
