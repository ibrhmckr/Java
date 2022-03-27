import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Two2DGraphics extends JFrame{
	
	
	myPanel panel;
	
	
	Two2DGraphics(){
		
		panel = new myPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setSize(420,420);
		//this.setLayout(null);
		this.setLocationRelativeTo(null);// this allow the frame to appear on the middle of the computer screen
		
		
		this.add(panel);
		this.pack();
		this.setVisible(true);
		
	}// end of constructor
	

	
	
	
}// end of class




















