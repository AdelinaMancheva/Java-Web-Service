package gui;

import javax.swing.JButton;

public class Buttons {
	
	private final String F_TO_C = "Convert Fahrenheit to Celsius";
	private final String C_TO_F = "Convert Celsius to Fahrenheit";
	
	JButton fahrToCelsButton;
    JButton celsToFahrButton;
    
    public Buttons(){
    	fahrToCelsButton = new JButton (F_TO_C);
        celsToFahrButton = new JButton (C_TO_F);
    }
    
}
