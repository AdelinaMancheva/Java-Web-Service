package gui;

import javax.swing.JTextField;

public class TextFields {
	
	private final int NUM_COLUMNS = 10;
	
	JTextField textFahr;
    JTextField textCels;
    
    public TextFields(){
    	textFahr = new JTextField (NUM_COLUMNS);
        textCels = new JTextField (NUM_COLUMNS);
    }
}
