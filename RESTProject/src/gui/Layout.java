package gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layout extends JFrame {

	private static final long serialVersionUID = 1L;

	Labels label;
	TextFields textField;
	Buttons button;

	JPanel panel;
	JPanel buttonPanel;

	OutputParser parser;

	public Layout() {

		initUI();
		addWidgets();
		listenForActions();

		add(panel);
		add(buttonPanel);
		
		parser = new OutputParser();
	}

	private void initUI() {
		setLayout(new FlowLayout());

		label = new Labels();
		textField = new TextFields();
		button = new Buttons();
		panel = new JPanel(new GridLayout(2, 2, 12, 6));
		buttonPanel = new JPanel();
	}

	private void addWidgets() {
		panel.add(label.labelFahr);
		panel.add(label.labelCels);
		panel.add(textField.textFahr);
		panel.add(textField.textCels);

		buttonPanel.add(button.fahrToCelsButton);
		buttonPanel.add(button.celsToFahrButton);
	}

	private void listenForActions() {
		button.fahrToCelsButton.addActionListener(new FahrListener());
		button.celsToFahrButton.addActionListener(new CelsListener());
	}

	private class FahrListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == button.fahrToCelsButton) {
				String fToC = parser.getOutputFtoC(Integer.parseInt(textField.textFahr.getText()));

				textField.textCels.setText(fToC);
				textField.textFahr.requestFocus();
				textField.textFahr.selectAll();
			}
		}
	}

	private class CelsListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == button.celsToFahrButton) {
				String cToF = parser.getOutputCtoF(Integer.parseInt(textField.textCels.getText()));

				textField.textFahr.setText(cToF);
				textField.textCels.requestFocus();
				textField.textCels.selectAll();
			}
		}
	}

}