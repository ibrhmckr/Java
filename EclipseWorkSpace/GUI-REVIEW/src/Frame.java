import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Frame extends JFrame implements ActionListener {
	
	JButton button;
	JCheckBox checkBox;
	ImageIcon cancelIcon;
	ImageIcon tickIcon;
	Frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(420,420));
		this.setLayout(new FlowLayout());
		
		cancelIcon = new ImageIcon("E:/eclipse-workspace/GUI-REVIEW/src/cancel.svg.png");
		tickIcon = new ImageIcon("E:/eclipse-workspace/GUI-REVIEW/src/tick.jpg");
		
		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this); //since we implementing ActionListener, we can pass "this"
		
		
	    checkBox = new JCheckBox();
	    checkBox.setText("i am checkBox");
	    checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas", Font.ITALIC,35));
	    checkBox.setIcon(cancelIcon);
	    checkBox.setSelectedIcon(tickIcon);
		
	    this.add(button);
	    this.add(checkBox);
		this.setVisible(true);
		//this.pack();
		
	} // end of constructor

	
@Override 
public void actionPerformed(ActionEvent e) { // When we click the button it going to trigger this codes
	if(e.getSource() == button) {
		System.out.println(checkBox.isSelected());
	}// end of if
	
  }//end of actionPerformed 
	
}// end of class
