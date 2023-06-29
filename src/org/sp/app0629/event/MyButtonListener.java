package org.sp.app0629.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyButtonListener implements ActionListener{
	JButton bt;
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button 눌림");
	}
	
}
