import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class label {
    
	public static void main(String[] args) {
		 //JLabel = a GUI display area for a string of text, an image or both
		 // Default layout is Borderlayout
		ImageIcon image = new ImageIcon("E:/eclipse-workspace/GUI-REVIEW/src/icon.png"); //an image readed from the path
		Border border = BorderFactory.createLineBorder(Color.green,3); //Creates a border
		
		JLabel label = new JLabel(); // Create a label object
		label.setText("Hey! I am a label."); // Set text of title
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of imageIcon
		label.setVerticalTextPosition(JLabel.TOP); // set text TOP,CENTER, BOTTOM of iconImage
		label.setForeground(new Color(0x00FF00));// set color of text
		label.setFont(new Font("Mv Boli", Font.PLAIN,20)); //set font of text
		label.setIconTextGap(-25);
		label.setBackground(Color.red); //set background color
		label.setOpaque(true);// paints its pixels within its  bounds // to display backgroundcolor set opaque = true
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon + text within label// TOP,CENTER...
		label.setHorizontalAlignment(JLabel.CENTER		);
		//label.setBounds(100,100,250,250); // set x,y position within frame as well as dimensions
		
		
		JFrame frame = new JFrame(); // Create a label obj
		frame.setSize(500,500); // set size of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets close operationof frame
		//frame.setLayout(null);
		
		frame.add(label);
		frame.setVisible(true);
		frame.pack(); // Pack all the components on the frame WARNING use pack method after you add all of components on frame
	}

}
