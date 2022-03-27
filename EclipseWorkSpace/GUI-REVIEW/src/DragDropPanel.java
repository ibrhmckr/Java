import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DragDropPanel extends JPanel {

	ImageIcon image = new ImageIcon("E:/eclipse-workspace/GUI-REVIEW/src/Resources/sad.jpg");
	final int WIDTH = image.getIconWidth();
	final int HEIGHT = image.getIconHeight();
	Point imageCorner;
	Point prevPt;
	
	DragDropPanel(){
		imageCorner = new Point(0,0);
		ClickListener clickListener = new ClickListener();
		DragListener dragListener = new DragListener();
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
		
	}// end of constructor
	
	public void paintComponent(Graphics g) {
		// It is going to update image after we repositioned it
		super.paintComponent(g);
		image.paintIcon(this, g,(int)imageCorner.getX(),(int)imageCorner.getY());
		
	}//end of painComponent
	
	private class ClickListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			prevPt = e.getPoint();//updating previous point where ever we clicked
			
		}// end of mousePressed
		
	}// end of ClickListener
	
	private class DragListener extends MouseMotionAdapter{
			public void mouseDragged(MouseEvent e) {
				Point currentPt = e.getPoint();
				//This going to translate our image corner to new position where ever our current point after we dragging our mouse 
				imageCorner.translate(
						(int)(currentPt.getX()-prevPt.getX())
						,
						(int)(currentPt.getY()-prevPt.getY())		
								);
				prevPt = currentPt;
				repaint();//Repaint this image
			}//end of mouseDragged
			
	}//end of DragListener
	
	
}// end of class
