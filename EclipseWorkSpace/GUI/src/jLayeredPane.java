import javax.swing.*;
import java.awt.*;
public class jLayeredPane {

	public static void main(String[] args) {
		//Layered --> Katmanli
		//JLyeredPane = swing container that provides a third dimension 
					 // for positioning components 
					 // ex. depth, Z-index
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.red);
		label1.setBounds(50,50,200,200); // c,y, width,height
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.green);
		label2.setBounds(100,100,200,200); // c,y, width,height
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.blue);
		label3.setBounds(150,150,200,200); // c,y, width,height
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0,0,500,500); // c,y,width,height
		
		layeredPane.add(label1, Integer.valueOf(0));
		layeredPane.add(label2, Integer.valueOf(2));
		layeredPane.add(label3, Integer.valueOf(1));
		
		JFrame frame = new JFrame("JLayeredFrame");
		frame.add(layeredPane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500,500));
		frame.setLayout(null);
		frame.setVisible(true);
		

	}

}