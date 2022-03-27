import javax.swing.*;

import java.awt.Color;
import java.awt.Color.*;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;


public class colorPicker extends JFrame implements ActionListener{

	JButton button;
	JLabel label;
	
	colorPicker(){
		
		button = new JButton("Pick a color");
		button.addActionListener(this);// trigger actionPorfermed function
		
		
		label = new JLabel();
		label.setFont(new Font("MV Boli",Font.PLAIN,25));
		label.setText("I am a label");
		label.setOpaque(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(new FlowLayout());
		
		
		this.add(button);
		this.add(label);
		
		this.pack();
		this.setVisible(true);
		
		
	}// end of colorPicker
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			JColorChooser colorChooser = new JColorChooser();
		    Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);
		    //label.setForeground(color);
		    label.setBackground(color);
		    
		    
		    
		    
		}// end of if
		
	}
   
}// end of class
