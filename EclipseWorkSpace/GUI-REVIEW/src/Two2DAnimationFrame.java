import javax.swing.JFrame;

public class Two2DAnimationFrame extends JFrame {

	Two2DAnimationMyPanel panel;
	
	Two2DAnimationFrame(){
		panel = new Two2DAnimationMyPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLocationRelativeTo(null);//set frame location on the center
		
		this.add(panel);
		this.pack();
		this.setVisible(true);
		
	}// end of constructor
	
}// end of class
