package Practice;

import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Practice.panel_base;

public class panel_base extends JPanel {

	/**
	 * @param args
	 */
	JButton button = new JButton();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	JTextField text = new JTextField();
	JCheckBox box = new JCheckBox();
	public static void main(String[] args) {

	}
	panel_base(){
		panel = new JPanel();
	}
	panel_base(int x, int y){
		setLayout(new FlowLayout(FlowLayout.CENTER, x, y));
		panel = new JPanel();
	}
	panel_base(String s1){
		button = new JButton(s1);
		panel = new JPanel();
		panel.add(button);
	}
	panel_base(String s1, String s2){
		button = new JButton(s1);
		label = new JLabel(s2);
		panel = new JPanel();
		panel.add(button);
		panel.add(label);
	}

}
