import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;


public class SliderDemo implements ChangeListener{

	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	
	SliderDemo(){
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
	    label.setFont(new Font("Eras Light ITC",Font.ITALIC,35));
		slider = new JSlider(0,100,50);// min,max, startingpoint values
		slider.setPreferredSize(new Dimension(400,200));
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		
		slider.setPaintTrack(true);//?
		slider.setMajorTickSpacing(25);
		slider.setOrientation(SwingConstants.VERTICAL); // Set the orientation of slider
		//slider.setOrientation(SwingConstants.HORIZONTAL);  
		slider.setPaintLabels(true);
		slider.setFont(new Font("Comic Sans MS",Font.PLAIN,25 ));
		slider.setForeground(Color.BLUE);
		slider.setBackground(Color.green);
		label.setText("oC = "+slider.getValue());
		slider.addChangeListener(this); // Trigger the function of stateChanged
		
		panel.add(slider);
		panel.add(label);
		
		frame.add(panel);
		frame.setSize(new Dimension(420,420));
		frame.setVisible(true);
		
	}// end of constructor

	
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("oC = "+slider.getValue());
		
		
	} //end of stateChanged

	
}// end of class
