package Practice;

import javax.swing.JButton;

public class six_button_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		panel_base panel1 = new panel_base(3, 5);
		panel_base panel2 = new panel_base(100, 100);
		JButton button1 = new JButton("x");
		JButton button2 = new JButton("x");
		JButton button3 = new JButton("x");
		JButton button4 = new JButton("x");
		JButton button5 = new JButton("x");
		JButton button6 = new JButton("x");
		panel1.panel.add(button1);
		panel1.panel.add(button2);
		panel1.panel.add(button3);
		panel2.panel.add(button4);
		panel2.panel.add(button5);
		panel2.panel.add(button6);
		Framing frame1 = new Framing(100, 10);
		frame1.add(panel1.panel);
		frame1.add(panel2.panel);
	}

}
