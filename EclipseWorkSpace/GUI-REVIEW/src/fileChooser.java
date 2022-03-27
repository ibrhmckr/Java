import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class fileChooser extends JFrame implements ActionListener {

	JButton button;
	
	fileChooser(){
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(new FlowLayout());
		
		
		button = new JButton("Choose");
		button.addActionListener(this);//?  trigger actionPerformend method
		
		this.add(button);
		this.pack();
		this.setVisible(true);
	}// end of constructor

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			JFileChooser fileChooser = new JFileChooser();
			
			fileChooser.setCurrentDirectory(new File("C:\\Users\\ibrahim\\Desktop"));
			
			//int response = fileChooser.showOpenDialog(null);// Select a file to open
			int response = fileChooser.showSaveDialog(null);// Save a file to open
			 
			if(response == JFileChooser.APPROVE_OPTION) { // if somebody select a file successfully without press cancel
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}// end of if
			
		}// end of if
		
	}
	
}// end of fileChooser
