package Practice;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class checkerboard extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		checkerboard frame = new checkerboard();
		frame.setTitle("CHECKERBOARD");
		frame.setSize(900,900);
		frame.setLocation(0,0);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	checkerboard(){
		GridLayout bord1 = new GridLayout(0,8);
		setLayout(bord1);
		int state = 1;
		int count = 0;
		for (int x = 0; x < 64; ++x){
			if(state == 1){
				add(new rect1());
				state = 2;
				count++;
				if(count >= 8){
					if(state == 2){
						add(new rect1());
						state = 2;
						count = 1;
					}else if(state == 1){
						add(new rect2());
						state = 1;
						count = 1;
					}
				}
			}
			else if(state == 2){
				add(new rect2());
				state = 1;
				count++;
				if(count >= 8){
					if(state == 2){
						add(new rect1());
						state = 2;
						count = 1;
					}else if(state == 1){
						add(new rect2());
						state = 1;
						count = 1;
					}
				}
			}

		}

	}

		class rect extends JPanel{
			
			protected void paintComponent (Graphics g){
				Random rand = new Random();
				float r = rand.nextFloat();
				float x = rand.nextFloat();
				float b = rand.nextFloat();
				g.setColor(new Color(r,x,b));
				g.fillRect(30, 30, 30, 30);
			}
	
}
		class rect1 extends JPanel{
			
			protected void paintComponent (Graphics g){
				g.setColor(Color.WHITE);
				g.fillRect(30, 30, 30, 30);
			}
	
}
	class rect2 extends JPanel{
			
			protected void paintComponent (Graphics g){
				g.setColor(Color.BLACK);
				g.fillRect(30, 30, 30, 30);
			}
}
}
