
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class gridLayout {

	public static void main(String[] args) {
		//Layout Manager = Defines the natural layout (yerlesim) for components within a container.
		
		//GridLayout = places components in a grid of cells.
		//				Each component takes all the available space within its cell,
		//				and each cell is the same size
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new GridLayout(3,3,10,10));// Row , Columns , Horizontal spcing between component,  Vertical spacing between components
		
		JButton button1 = new JButton("1");
		
		frame.add(new JButton("1"));// anonymous class
		frame.add(new JButton("2"));// anonymous class
		frame.add(new JButton("3"));// anonymous class
		frame.add(new JButton("5"));// anonymous class
		frame.add(new JButton("6"));// anonymous class
		frame.add(new JButton("7"));// anonymous class
		frame.add(new JButton("8"));// anonymous class
		frame.add(new JButton("9"));// anonymous class
		frame.add(new JButton("10"));// anonymous class
		frame.add(new JButton("11"));// anonymous class
		frame.setVisible(true);
		

	}

}
