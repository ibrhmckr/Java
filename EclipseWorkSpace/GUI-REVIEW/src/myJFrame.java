import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class myJFrame extends JFrame{
		
		myJFrame(){
			this.setSize(420,420);//sets x dimension, and y-dimension of this
			this.setTitle("Reiew Title"); //sets the title of this
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
			this.setResizable(false); //prevent this from being resized
			
			
			ImageIcon image = new ImageIcon("E:/eclipse-workspace/GUI-REVIEW/src/icon.png"); 
			this.setIconImage(image.getImage()); //change icon of this 
			this.getContentPane().setBackground(new Color(0xFFFF12)); // change color of background
			
			this.setVisible(true);//make this visible
			
			
		}// end of Constructor 


}
