import javax.swing.JFrame;

public class FrameDragDrop extends JFrame{

	
	DragDropPanel dragPanel = new DragDropPanel();
	
	FrameDragDrop(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Drag and Drop demo");
		this.setSize(600,600);
		
		this.add(dragPanel);
		
		this.setVisible(true);
		
		
		
	}// end of Constructor 
	
	
	
}// end of class
