import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class OptionPane {

	public static void main(String[] args) {
	// JOptionPane = Pop up a stnadart dialog box that prompts users for a value
	//				 or informs them of something
		
		
		//JOptionPane.showMessageDialog(null, "My Message", "Title", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "My Message", "Title", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "My Message", "Title", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "My Message", "Title", JOptionPane.WARNING_MESSAGE);
		//while(true) {
		//JOptionPane.showMessageDialog(null, "My Message", "Title", JOptionPane.ERROR_MESSAGE);
	    //	}//end of while
		
		//int answer = JOptionPane.showInternalConfirmDialog(null, "1+1=?", "title", JOptionPane.YES_NO_CANCEL_OPTION);
		//System.out.println("Hi\n"+JOptionPane.showInputDialog("What is your name?")); 
		String[] responses = {"NO", "YES", "PASS","NEW"};
		
		ImageIcon icon = new ImageIcon("E:/eclipse-workspace/GUI-REVIEW/src/icon.png");
		
		JOptionPane.showOptionDialog(null, "My Message", "My Message 2", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
		
	}// end of Main

}
