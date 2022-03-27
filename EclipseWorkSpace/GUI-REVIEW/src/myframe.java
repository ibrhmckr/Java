import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
public class myframe extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
	myframe(){
		ImageIcon icon = new ImageIcon("E:/eclipse-workspace/GUI-REVIEW/src/icon.png");
	    ImageIcon icon2 = new ImageIcon("E:/eclipse-workspace/GUI-REVIEW/src/thumbsUp.jpg");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(0, 0, 250, 250);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(100,100,100,50);
		button.setText("Click me");
		//button.addActionListener(e -> System.out.println("Clicked!")); //this class implemeting actionListenerInterface  
		button.addActionListener(this);
		button.setFocusable(false);
		//button.add(label);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,15));
		button.setIconTextGap(-25);
		button.setForeground(Color.cyan);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBorder(BorderFactory.createLineBorder(Color.red,3));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		
		
		this.add(button);
		this.add(label);
		
	}// END of CONSTRUCTOR
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("Clicked");
			//button.setEnabled(true); // sets enable state of button
			label.setVisible(true);
		}// end of if
		
	}// end of actionPerformed
	
	 

}
