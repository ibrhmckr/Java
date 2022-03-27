import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListener extends JFrame implements java.awt.event.KeyListener{
    ImageIcon triangle;
	JLabel label;
	KeyListener(){
		
		triangle = new ImageIcon("E:/eclipse-workspace/GUI-REVIEW/src/Resources/triangle.png");
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
		//label.setOpaque(true);
		//label.setBackground(Color.red);
		label.setIcon(triangle);
		
		this.getContentPane().setBackground(Color.white);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		this.addKeyListener(this);
		
		this.add(label);
		
		//this.pack();
		this.setVisible(true);
		
	}// end of constructor

	@Override
	public void keyTyped(KeyEvent e) {
		//keyTyped = Invoked when a key is typed. Uses KeyChar, char output
		switch(e.getKeyChar()) {
		case 'a':
		    	label.setLocation(label.getX()-10,label.getY());
		break;
		
		case 'w':
			  label.setLocation(label.getX(), label.getY()-10);
			break;
		case 's':
			  label.setLocation(label.getX(), label.getY()+10);
			break;
			
		case 'd':
			 label.setLocation(label.getX()+10, label.getY());
		break;
		
		}//end of switch
		
	}// end of keyTyped

	@Override
	public void keyPressed(KeyEvent e) {
		// keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
		switch(e.getKeyCode()) {
		case 38:
			label.setLocation(label.getX(), label.getY()-10);
			break;
		
		case 40:
			label.setLocation(label.getX(), label.getY()+10);
			break;
			
		case 37:
			label.setLocation(label.getX()-10, label.getY());
			break;
			
		case 39:
			label.setLocation(label.getX()+10, label.getY());
			break;
		
		}// end of switch
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//keyReleased = called whenever a button is released
		System.out.println("Released: "+e.getKeyChar());
		System.out.println("Released: "+e.getKeyCode());
	}

	
}// end of class
