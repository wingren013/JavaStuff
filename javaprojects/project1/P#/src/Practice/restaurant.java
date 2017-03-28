package Practice;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
 

public class restaurant extends JFrame {
	
	restaurant() 
	{
		setLayout(new BorderLayout(10,10));

		ImageIcon restaurantPicture = new ImageIcon("images/restaurant.jpg");
		
		JButton restaurantImageButton = new JButton(restaurantPicture);
		restaurantImageButton.setBackground(Color.black);
		add(restaurantImageButton, BorderLayout.NORTH);
		
		ImageIcon menuImage = new ImageIcon("images/tree.png");
		JButton menuImageButton = new JButton(menuImage);
		add(menuImageButton, BorderLayout.CENTER);
	 
		//add(new JButton("CENTER"), BorderLayout.CENTER);
		add(new JButton("Tables here, red for reserved, green for available"), BorderLayout.WEST);
		
		//Panel of buttons for tables
 ;
		//add(new JButton("SOUTH"), BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		
		restaurant frame = new restaurant();
		frame.setSize(800,800);
		//frame.setLocationRelativeTo(null);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}