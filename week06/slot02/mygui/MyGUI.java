package week06.slot02.mygui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyGUI extends JFrame implements ActionListener {

	private JButton hello_btn, clear_btn;
	private JLabel hello_lbl;
	private boolean hello = false;
	
	public MyGUI(String title, int width, int height) {
		super(title);
		this.setSize(width, height);
		
		hello_btn = new JButton("Hello");
		hello_lbl = new JLabel("Hello");
		clear_btn = new JButton("Clear");
		
		this.getContentPane().add(BorderLayout.CENTER, hello_btn);
		this.getContentPane().add(BorderLayout.EAST, clear_btn);
		this.getContentPane().add(BorderLayout.SOUTH, hello_lbl);
		
		hello_btn.addActionListener(this);
		clear_btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == hello_btn) {
			if(hello) {
				hello = false;
				hello_lbl.setText("Hello");
			} else {
				hello = true;
				hello_lbl.setText("World");
			}
		}
		if(e.getSource() == clear_btn) {
			hello_lbl.setText("");
		}
	}
	
}
