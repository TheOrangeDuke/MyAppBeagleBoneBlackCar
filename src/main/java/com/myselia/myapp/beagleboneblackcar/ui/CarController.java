package com.myselia.myapp.beagleboneblackcar.ui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CarController extends JPanel{

	public static JFrame frame = new JFrame();
	
	private Color[] colors = {Color.GRAY, Color.BLUE};
	
	@Override
    public Dimension getPreferredSize() {
		return new Dimension(300, 300);
	}

	public void setFrame() {
		CarController.frame.getContentPane().add(this);
		CarController.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CarController.frame.pack();
		CarController.frame.setSize(600, 600);
		CarController.frame.setLocationRelativeTo(null);
		CarController.frame.setVisible(true);
		
	}
	
}
