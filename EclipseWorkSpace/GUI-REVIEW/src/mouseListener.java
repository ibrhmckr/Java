import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mouseListener extends JFrame implements MouseListener{
	JLabel label;
	ImageIcon smile;
	ImageIcon sad;
	ImageIcon nervous;
	ImageIcon dizzy;
	
	
	mouseListener(){
		
		smile = new ImageIcon("E:/eclipse-workspace/GUI-REVIEW/src/Resources/smile.png");
		sad = new ImageIcon("E:/eclipse-workspace/GUI-REVIEW/src/Resources/sad.jpg");
		nervous = new ImageIcon("E:/eclipse-workspace/GUI-REVIEW/src/Resources/nervous.png");
		dizzy = new ImageIcon("E:/eclipse-workspace/GUI-REVIEW/src/Resources/dizzy.png");
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());

		
		label = new JLabel();
		//label.setBounds(0,0,100,100);
		
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this); // since we implementing mouseListener interface we can just pass "this" keyword
		label.setIcon(smile);
		
		this.add(label);
		this.setVisible(true);
	}// end of mouseListener

	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked(pressed and released)on a component 
		//System.out.println("clicked the mouse");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been pressed on a component
		//System.out.println("Pressed the mouse");
		//label.setBackground(Color.yellow);
		label.setIcon(sad);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when a mouse button has been released on a component 
	   System.out.println("Released the mouse");
	   //label.setBackground(Color.green);
	   label.setIcon(dizzy);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when the mouse enters a component
		System.out.println("entered into the component");
		//label.setBackground(Color.blue);
		label.setIcon(nervous);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//Invoked when the mouse exits a component
		System.out.println("Left from the component");
		//label.setBackground(Color.red);
		label.setIcon(smile);
	}
	
}// end of class
