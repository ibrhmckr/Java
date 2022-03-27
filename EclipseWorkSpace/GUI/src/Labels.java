import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

public class Labels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JLabel = a GUI display area for a string for a strong of text, ad image, or both
		
		ImageIcon icon = new ImageIcon("E://eclipse-workspace/GUI/src/icon.png");
		Border border = BorderFactory.createLineBorder(Color.red,3);
		
		
		JLabel label = new JLabel();
		label.setText("This is a label");
		label.setIcon(icon);
		label.setHorizontalTextPosition(JLabel.CENTER);// set text LEFT, CENTER, RIGHT of the image
		label.setVerticalTextPosition(JLabel.TOP); // set the text TOP, CENTER, BOTTOM  of imageicon
		//label.setForeground(Color.green); //Set the color of label
		label.setForeground(new Color(0x0FF00));//set font color of text
		label.setFont(new Font("MV Boli",Font.PLAIN,20));//set font of text 
		label.setIconTextGap(10); // set gap of the text to image
		label.setBackground(Color.black);// set background color
		label.setOpaque(true); //display backgroundcolor
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER); // Set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER);// Set horizontal position of icon+text within label
		//label.setBounds(100,100,250,250);// set x,y postion within frame as well as dimensions
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(420,420);
		//frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label); //Add label to the frame  and it locate label 
		frame.pack();
		
		

	}

}
