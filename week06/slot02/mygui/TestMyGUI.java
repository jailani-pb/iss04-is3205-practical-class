package week06.slot02.mygui;

import javax.swing.JFrame;

public class TestMyGUI {

	public static void main(String[] args) {
		MyGUI myGUI = new MyGUI("My GUI", 500, 500);
		myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myGUI.setVisible(true);
	}
	
}
