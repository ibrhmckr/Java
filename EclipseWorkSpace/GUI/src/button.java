import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;

public class button extends JFrame implements ActionListener{
	
	JButton button;
	JLabel label; 
	
	
	button(){
		
		//ImageIcon icon = new ImageIcon("E:/eclipse-workspace/GUI/src/icon.png");
		ImageIcon icon2 = new ImageIcon("E:/eclipse-workspace/GUI/src/icon.png");
		
		
		 label = new JLabel();
		 label.setIcon(icon2);
		 label.setBounds(150, 250, 150, 150);
		 label.setVisible(false);
		 
		 
		 button = new JButton();
		 button.setBounds(100, 100,250, 100);
		 button.addActionListener(this);
		 button.setText("I am a button");
		 button.setFocusable(false);
		//button.setIcon(icon);
		button.setHorizontalAlignment(JButton.CENTER);
		button.setVerticalAlignment(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD,25));
		button.setIconTextGap(-15);
		button.setForeground(Color.cyan);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());
		//button.setEnabled(false);
		 
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
		
	}// end of constructor
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == button){
			System.out.println("Clicked");
			//button.setEnabled(false);
			label.setVisible(true);

		}// end of if
	}// end of actionPerformed
	
	
	public static void main(String[] args){
		
		new button();
		
	}// end of main
	
	

	
	
}// end of class