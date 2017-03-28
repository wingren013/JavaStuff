package samples;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FullListen extends JFrame{
	static JButton button = new JButton("do");
	BasicListen listen = new BasicListen();
	Choice choice = new Choice();
	int i = 1;
	private JButton jbtChoose = new JButton("Choose");
	JPanel panel = new JPanel(); // Use the panel to group buttons
	public FullListen(){
	this.add(panel, BorderLayout.SOUTH);
	panel.add(button);
	panel.add(jbtChoose);
	button.addActionListener(listen);
	jbtChoose.addActionListener(choice);
	}
	public static void main(String[] args) {
		JFrame frame = new FullListen();
		frame.setTitle("PIG");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);
		button.setActionCommand("play");
	}
	class Choice implements ActionListener {
		// Inner class
		@Override
		public void actionPerformed(ActionEvent e) {
			if(i == 0){
				button.setActionCommand("play");
				i = 1;
			} else if(i == 1){
				button.setActionCommand("eat");
				i = 0;
			}
		}
}
class BasicListen implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("");
		String action = e.getActionCommand();
		if(action == "play"){
			System.out.println("play in the mud");
		}else if(action == "eat"){
			System.out.println("eat like a pig");
		}
	}
}
}
