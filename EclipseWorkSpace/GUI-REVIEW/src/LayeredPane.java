import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class LayeredPane {

	public static void main(String[] args) {
		// JLayeredPane = Swing container that provides a 
						// third dimension for positoning components
						// ex. depth, Z-index
		JLabel label1 = new JLabel();
		label1.setOpaque(true); // If we DO NOT use a LAYOUT MANAGER we have to set `opaque(true)`
		label1.setBackground(Color.red);
		label1.setBounds(50,50,200,200);
		label1.setText("I`m label1");
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true); // If we DO NOT use a LAYOUT MANAGER we have to set `opaque(true)`
		label2.setBackground(Color.GREEN);
		label2.setBounds(100,100,200,200);
		label2.setText("I`m label2");
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true); // If we DO NOT use a LAYOUT MANAGER we have to set `opaque(true)`
		label3.setBackground(Color.BLUE);
		label3.setBounds(150,150,200,200);
		label3.setText("I`m label3");
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 500, 500);
		
		layeredPane.add(label1,Integer.valueOf(0)); // set Z-index
		layeredPane.add(label2,Integer.valueOf(2)); // set Z-index
		layeredPane.add(label3,Integer.valueOf(1)); // set Z-index
		
		
	    JFrame frame = new JFrame();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(new Dimension(500,500));
	    frame.setLayout(null);
	    frame.setResizable(false);
	    /////------- ADDING Componenets to Frame
	    frame.add(layeredPane);
		///// END ------- ADDING Componenets to Frame
	    frame.setVisible(true);
	    
	} // end of MAIN

}
