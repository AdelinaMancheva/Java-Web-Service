package gui;

import javax.swing.JLabel;

public class Labels {
	
	private final String FAHRENHEIT = "Fahrenheit:";
	private final String CELSIUS = "Celsius:";
	
	JLabel labelFahr;
    JLabel labelCels;
    
    public Labels(){
    	labelFahr = new JLabel (FAHRENHEIT);
        labelCels = new JLabel (CELSIUS);
    }

}
