package Practice;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Practice.panel_base;

public class Framing extends JFrame {

	

	public static void main(String[] args) {
		

	}
	public Framing(){
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		this.setSize(300, 300);
		this.setLocation(0, 0);
		this.setVisible(true);
	}
	public Framing(int x, int y){
		setLayout(new FlowLayout(FlowLayout.LEFT, x, y));
		this.setSize(300, 300);
		this.setLocation(0, 0);
		this.setVisible(true);
	}

}
