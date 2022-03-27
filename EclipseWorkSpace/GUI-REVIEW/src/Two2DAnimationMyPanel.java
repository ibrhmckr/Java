import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Two2DAnimationMyPanel extends JPanel implements ActionListener {

	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	Image enemy;
	Image backgroundImage;
	Timer timer;
	int xVelocity = 2;
	int yVelocity = 1;
	int x = 0;
	int y = 0;
	
	Two2DAnimationMyPanel(){
		this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
		this.setBackground(Color.black);
		enemy = new ImageIcon("E:/eclipse-workspace/GUI-REVIEW/src/Resources/enemy.png").getImage();// this will make an image out of our imageIcon
		backgroundImage = new ImageIcon("E:/eclipse-workspace/GUI-REVIEW/src/Resources/like.png").getImage();
		
		timer = new Timer(); // perform an action one in 1 second
		try {
			timer.wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}// end of constructor

	
	public void paint(Graphics g) {
		
		super.paint(g); // paint background for us
		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(backgroundImage,x,y,null);
		g2D.drawImage(enemy, x, y, null);
		
	}// end of paint
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(x >= PANEL_WIDTH-enemy.getWidth(null) || x < 0) {
		   xVelocity = xVelocity * -1; 		
		}// end 		
		x = x + xVelocity;
		
		if(y >= PANEL_HEIGHT-enemy.getHeight(null) || y < 0) {
			   yVelocity = yVelocity * -1; 		
			}// end 		
			y = y + yVelocity;
		repaint();
	
	
	}
	
}//end of class
