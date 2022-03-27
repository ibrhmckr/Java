import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	
  NewWindow(){
	  JFrame frame = new JFrame();
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setSize(420,420);
	  frame.setLayout(null);
	  frame.setVisible(true);
	  
	  JLabel label = new JLabel("i am a new Window!");
	  label.setOpaque(false);
	  label.setBounds(0, 0, 300, 50);
	  label.setFont(new Font(null, Font.PLAIN,25));
	  
	  
	  frame.add(label);
	  
  }// end of constructor
  
}// end of class
