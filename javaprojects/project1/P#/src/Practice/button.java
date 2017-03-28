package Practice;

import javax.swing.*;
import Practice.Framing;
import Practice.panel_base;
import java.awt.*;

public class button {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Framing myFrame = new Framing(10, 20);
		myFrame.setTitle("this is a frame");
		JButton button1 = new JButton("click me");
		JLabel label1 = new JLabel("this is a button");
		JPanel panel1 = new JPanel();
		panel_base b2 = new panel_base("hi", "hello");
		panel_base b3 = new panel_base("sushi", "ice cream");
		panel_base b4 = new panel_base("history", "math");
		panel_base b5 = new panel_base("light", "saber");
		panel_base b6 = new panel_base("oy", "ey");
		
		panel1.add(label1);
		panel1.add(button1);
		panel1.setVisible(true);
		//JFrame frame1 = new JFrame();
		myFrame.add(panel1);
		JTextField text1 = new JTextField("enter");
		JCheckBox box1 = new JCheckBox("thing");
		panel1.add(text1);
		panel1.add(box1);
		panel1.add(b2.button);
		panel1.add(b2.label);
		panel1.add(b3.button);
		panel1.add(b3.label);
		panel1.add(b4.button);
		panel1.add(b4.label);
		panel1.add(b5.button);
		panel1.add(b5.label);
		panel1.add(b6.button);
		panel1.add(b6.label);
		myFrame.setSize(1000, 600);
		myFrame.setLocation(150, 100);
		myFrame.setVisible(true);
		
		
	}

}
