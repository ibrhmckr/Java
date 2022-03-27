import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {
   
	JFrame frame = new JFrame();
	JButton myButton = new JButton("Click for New Window");
	
	LaunchPage(){
		myButton.setBounds(100, 160, 200, 40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		////ADD components
		frame.add(myButton);
		
		////END of ADD components
		frame.setVisible(true);
		
	}//Constructor
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == myButton) {
			frame.dispose(); // It will close other frames ouf of our frames
			NewWindow myNewWindow = new NewWindow();
		}// end of if
		
	}// end of actionPerformed
	
}
