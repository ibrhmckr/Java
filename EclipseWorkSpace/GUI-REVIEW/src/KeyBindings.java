import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.*;


public class KeyBindings {

	//KeyBindings = bind and Action to a KeyStroke
	//				baglamak
	//              don`t require you to click a component to give it focus
	//              all Swing components can use Key Bindings
	//				increased flexibility compared to KeyListeners
	// 				can assign key strokes to individual Swing componenets 
	//    			more difficult to utilize and set up
	//				utilize = kullanmak, yararlanmak, istifade etmek, yarar saglamak			
	
	JFrame frame;
	JLabel label;
	Action upAction;
	Action downAction;
	Action rightAction;
	Action leftAction;
	
	
	KeyBindings(){
		frame = new JFrame("KeyBindings");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(420,420);
		
		label = new JLabel();
		label.setBounds(100,100,100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		
		upAction = new UpAction();
		downAction = new DownAction();
		rightAction = new RightAction();
		leftAction = new LeftAction();
		
		label.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction");
		label.getActionMap().put("upAction", upAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke('s'), "downAction");
		label.getActionMap().put("downAction", downAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightAction");
		label.getActionMap().put("rightAction", rightAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke('a'),"leftAction");
		label.getActionMap().put("leftAction",leftAction);
		
		frame.add(label);
		frame.setVisible(true);
	}// end of constructor
 
	public class UpAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX(), label.getY()-10);
			
		}
		
	}// end of UpAction
	
	
	public class DownAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX(), label.getY()+10);
			
		}
		
	}// end of UpAction
	
	public class RightAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX()+10,label.getY());
		}
		
	}// end of UpAction
	
	public class LeftAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX()-10, label.getY());
		}
		
	}// end of UpAction
	
	

}// end of constructor
