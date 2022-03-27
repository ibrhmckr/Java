import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

public class Menu extends JFrame implements ActionListener {

	  JMenu fileMenu;
	  JMenu editMenu;
	  JMenu helpMenu ;
	
	  JMenuItem loadItem;
	  JMenuItem saveItem;
	  JMenuItem exitItem;
	  
	  ImageIcon loadIcon;
	  
	Menu(){
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //this class can be think as JFrame because we inherit JFrame 
		  this.setLayout(new FlowLayout());
		  this.setTitle("Menu");
		  this.setSize(new Dimension(420,420));
		  
		  ImageIcon loadIcon = new ImageIcon("E:/eclipse-workspace/GUI-REVIEW/src/Resources/pizza.png");
		  ImageIcon saveIcon = new ImageIcon("E:/eclipse-workspace/GUI-REVIEW/src/Resources/tick.jpg");
		  ImageIcon exitIcon = new ImageIcon("E:/eclipse-workspace/GUI-REVIEW/src/Resources/cancel.svg.png");
		  
		  JMenuBar menuBar = new JMenuBar();
		  
		  this.setJMenuBar(menuBar);
		  fileMenu = new JMenu("File");
		  editMenu = new JMenu("Edit");
		  helpMenu = new JMenu("Help");
		  
		  menuBar.add(fileMenu);
		  menuBar.add(editMenu);
		  menuBar.add(helpMenu);
		  
		  loadItem = new JMenuItem("Load");
		  saveItem = new JMenuItem("Save");
		  exitItem = new JMenuItem("Exit");
		  
		  loadItem.addActionListener(this);
		  saveItem.addActionListener(this);
		  exitItem.addActionListener(this);
		  
		  fileMenu.setMnemonic(KeyEvent.VK_F);//Alt + F for file
		  editMenu.setMnemonic(KeyEvent.VK_E);//Alt + E for edit
		  helpMenu.setMnemonic(KeyEvent.VK_H);//Alt + H for help
		  
		  loadItem.setMnemonic(KeyEvent.VK_L);// L for load
          saveItem.setMnemonic(KeyEvent.VK_S);// S for sace
          exitItem.setMnemonic(KeyEvent.VK_E);// E for exit
          
          loadItem.setIcon(loadIcon);
          saveItem.setIcon(saveIcon);
          exitItem.setIcon(exitIcon);
		  
		  fileMenu.add(loadItem);
		  fileMenu.add(saveItem);
		  fileMenu.add(exitItem);
		  
		  
		  this.setFont(new Font("MV Boli",Font.PLAIN,25));
		  this.setVisible(true);
		  
		  
	}// end of constructor

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == loadItem) {
			
			System.out.println("Clicked on load Item");
		}// end of if
	if(e.getSource() == saveItem) {
			
			System.out.println("Clicked on save Item");
		}// end of if
	if(e.getSource() == exitItem) {
		
		System.out.println("Clicked on exit Item");
		System.exit(0);
	}// end of if
		
	}// end of actionPerformed
	
	
}// end of class
