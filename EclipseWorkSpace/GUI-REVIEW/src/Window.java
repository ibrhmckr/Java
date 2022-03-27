import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Window extends JFrame implements ActionListener {
		
	JComboBox comboBox;
	Window(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(420,420));
		this.setLayout(new FlowLayout());
		
		Integer[] animals = {1,2,3};
	    comboBox = new JComboBox(animals);
		comboBox.addActionListener(this); // this 
		//comboBox.setEditable(true);
		//int a = comboBox.getItemCount();
		//comboBox.addItem("horse");
		//comboBox.insertItemAt("ADD", 0);
		//comboBox.removeItem("cat");
		//comboBox.removeItemAt(1);
		//comboBox.removeAllItems();
		
		//System.out.println(a);
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}
	
	
		
	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource()== comboBox) {
			//String selected = (String)comboBox.getSelectedItem();
			 int index = comboBox.getSelectedIndex();
			System.out.println(index); 
			 
		 }//end of if
	}
	
}// end of Window


	
	
	
	//--------------JRadioButton--------------------
	
	/* Globals
	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;
	
	ImageIcon pizzaIcon;
	ImageIcon hamburgerIcon;
	ImageIcon hotdogIcon; 
	
	*/
	/*
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(new FlowLayout());
	this.setSize(new Dimension(420,420));
	
	 pizzaButton = new JRadioButton("Pizza");
	 hamburgerButton = new JRadioButton("hamburger");
	 hotdogButton = new JRadioButton("hotdog");
	
	 pizzaIcon = new ImageIcon("E:/eclipse-workspace/GUI-REVIEW/src/Resources/pizzaa.png");
	 hamburgerIcon = new ImageIcon("E:/eclipse-workspace/GUI-REVIEW/src/Resources/hamburger.png");
	 hotdogIcon = new ImageIcon("E:/eclipse-workspace/GUI-REVIEW/src/Resources/hotdog.png");
	
	pizzaButton.setFocusable(false);
	hamburgerButton.setFocusable(false);
	hotdogButton.setFocusable(false);
	
	pizzaButton.addActionListener(this);
	hamburgerButton.addActionListener(this);
	hotdogButton.addActionListener(this);
	
	ButtonGroup group = new ButtonGroup();
	group.add(hamburgerButton);
	group.add(pizzaButton);
	group.add(hotdogButton);
	
	pizzaButton.setIcon(pizzaIcon);
	hamburgerButton.setIcon(hamburgerIcon);
	hotdogButton.setIcon(hotdogIcon);
	
	
	this.add(pizzaButton);
	this.add(hamburgerButton);
	this.add(hotdogButton);
	//this.pack();
	this.setVisible(true);
	
	
}// end of Window

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == pizzaButton) {
		System.out.println("pizza ordered");
	}//end of if
	
	else if(e.getSource() == hamburgerButton) {
		System.out.println("hamburger ordered");
	}//end of if
	
	else if(e.getSource() == hotdogButton) {
		System.out.println("hotdog ordered");
	}//end of if
	
	
	
}
 
*/
//--------------END JRadioButton--------------------

