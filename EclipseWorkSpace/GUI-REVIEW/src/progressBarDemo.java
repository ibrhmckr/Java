import java.awt.*;
import javax.swing.*;
import javax.swing.Box.Filler;

public class progressBarDemo {
    
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0,500); //min,max values
	
	progressBarDemo(){
		
	bar.setValue(0);
	bar.setBounds(0,0,420,50);
	bar.setStringPainted(true);
	bar.setFont(new Font("Eras Light ITC",Font.BOLD,35));	
	bar.setForeground(Color.red);	
	bar.setBackground(Color.white);
		
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(420,420);
	frame.setLayout(null);
	
	frame.add(bar);
	
	frame.setVisible(true);
	
	fill();
	
		
	}// end of constructor

public void fill() {
	
	int counter = 500;
	
	while(counter >= 0) {
		bar.setValue(counter);
		try {
		Thread.sleep(50);
		}// end of try
		catch(InterruptedException e){
			e.printStackTrace();
		}// end of catch
		counter -= 1;
	}// end of while
	
	bar.setString("DONE!");
	
	
}// end of fill
	
	
}// end of Class
