package src;

import javax.swing.JFrame;

import gui.Layout;

public class Main {

	public static void main(String[] args) {
		Layout app = new Layout();

		app.setTitle("Converter");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(500, 150);
		app.setVisible(true);

	}

}
