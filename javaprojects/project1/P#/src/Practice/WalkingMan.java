package Practice;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import Practice.AnimationDemo.MovingMessagePanel;
import Practice.AnimationDemo.MovingMessagePanel.TimerListener;

public class WalkingMan extends JFrame{
	static ImageIcon Q = new ImageIcon("walk1.png");
	static Image Walk_test = Q.getImage();
	static ImageIcon Z = new ImageIcon("walk2.png");
	static Image Walk = Z.getImage();
	static ImageIcon Q_flip = new ImageIcon("walk3.png");
	static Image Walk_test_flip = Q_flip.getImage();
	static ImageIcon Z_flip = new ImageIcon("walk4.png");
	static Image Walk_flip = Z_flip.getImage();
	static int imagestate = 1;
	static int imageflip = 1;
	static int count = 0;
	/**
	 * @param args
	 */
	public WalkingMan() {
		// Create two MovingMessagePanel for displaying two moving messages
		this.setLayout(new GridLayout(2, 1));
		add(new MovingImagePanel(Walk_test, Walk, Walk_test_flip, Walk_flip));
		add(new MovingImagePanel2(Walk_test, Walk, Walk_test_flip, Walk_flip));
		add(new MovingImagePanel2(Walk_test, Walk, Walk_test_flip, Walk_flip));
		add(new MovingImagePanel2(Walk_test, Walk, Walk_test_flip, Walk_flip));
		 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WalkingMan frame = new WalkingMan();
		frame.setTitle("Walking Man");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	static class MovingImagePanel extends JPanel {
		private Image message;
		private Image message2;
		private Image message3;
		private Image message4;
		private int xCoordinate = 1;
		private int yCoordinate = 1;
		private Timer timer = new Timer(150, new TimerListener());
		public MovingImagePanel(Image i, Image r, Image e, Image t) {
			this.message = i;
			this.message2 = r;
			this.message3 = e;
			this.message4 = t;

			// Start timer for animation
			timer.start();

			// Control animation speed using mouse buttons
			this.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int delay = timer.getDelay();
					if (e.getButton() == MouseEvent.BUTTON1) 
						timer.setDelay(delay > 50 ? delay - 50 : 0);
					else if (e.getButton() == MouseEvent.BUTTON3) 
						timer.setDelay(delay < 50000 ? delay + 50 : 50000);
				}
			});
		}

		 /** Paint the message */
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			if (yCoordinate > getHeight() && imageflip == 1) {
				yCoordinate += -5;
			}
			if (yCoordinate < -(getHeight()) && imageflip == 2) {
				yCoordinate += -5;
			}
			if (xCoordinate > getWidth() && imageflip == 1) {
				yCoordinate += 5;
				count++;
				if(count == 4){
					this.add(new MovingImagePanel(Walk_test, Walk, Walk_test_flip, Walk_flip));
				}
				if(imageflip == 1){
					imageflip = 2;
				}
				else if(imageflip == 2){
				imageflip = 1;
			}
			}
			if (xCoordinate < -(getWidth()) && imageflip == 2) {
				yCoordinate += 5;
				xCoordinate += 100; //pixels, this allows graceful entry from left
				
				if(imageflip == 1){
					imageflip = 2;
				}
				else if(imageflip == 2){
				imageflip = 1;
			}
			}
			if(imageflip == 1){
				xCoordinate += 17;
			}
			if(imageflip == 2){
				xCoordinate += -17;
				}
			
			
			if(imagestate == 1 && imageflip == 1){
			g.drawImage(message, xCoordinate, yCoordinate, 33, 33, this);
			imagestate = 2;
		}else if(imagestate == 2 && imageflip == 1){
			g.drawImage(message2, xCoordinate, yCoordinate, 33, 33, this);
			imagestate = 1;
		}
		else if(imagestate == 1 && imageflip == 2){
				g.drawImage(message, xCoordinate, yCoordinate, -33, 33, this);
				imagestate = 2;
			}else if(imagestate == 2 && imageflip == 2){
				g.drawImage(message2, xCoordinate, yCoordinate, -33, 33, this);
				imagestate = 1;
			}
		}
			
		 
		class TimerListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
		
	}
}
	static class MovingImagePanel2 extends JPanel {
		private Image message;
		private Image message2;
		private Image message3;
		private Image message4;
		private int xCoordinate = 1;
		private int yCoordinate = 1;
		private Timer timer = new Timer(150, new TimerListener());
		public MovingImagePanel2(Image i, Image r, Image e, Image t) {
			this.message = i;
			this.message2 = r;
			this.message3 = e;
			this.message4 = t;

			// Start timer for animation
			timer.start();

			// Control animation speed using mouse buttons
			this.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int delay = timer.getDelay();
					if (e.getButton() == MouseEvent.BUTTON1) 
						timer.setDelay(delay > 50 ? delay - 50 : 0);
					else if (e.getButton() == MouseEvent.BUTTON3) 
						timer.setDelay(delay < 50000 ? delay + 50 : 50000);
				}
			});
		}

		 /** Paint the message */
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			if (yCoordinate > getHeight() && imageflip == 1) {
				//yCoordinate += -5;
			}
			if (yCoordinate < -(getHeight()) && imageflip == 2) {
				//yCoordinate += -5;
			}
			if (xCoordinate > getWidth() && imageflip == 1) {
				//yCoordinate += 5;
				count++;
				if(count == 4){
					this.add(new MovingImagePanel(Walk_test, Walk, Walk_test_flip, Walk_flip));
				}
				if(imageflip == 1){
					imageflip = 2;
				}
				else if(imageflip == 2){
				imageflip = 1;
			}
			}
			if (xCoordinate < -(getWidth()) && imageflip == 2) {
				//yCoordinate += 5;
				xCoordinate += 100; //pixels, this allows graceful entry from left
				
				if(imageflip == 1){
					imageflip = 2;
				}
				else if(imageflip == 2){
				imageflip = 1;
			}
			}
			if(imageflip == 1){
				xCoordinate += 17;
			}
			if(imageflip == 2){
				xCoordinate += -17;
				}
			
			
			if(imagestate == 1 && imageflip == 1){
			g.drawImage(message, xCoordinate, yCoordinate, 33, 33, this);
			imagestate = 2;
		}else if(imagestate == 2 && imageflip == 1){
			g.drawImage(message2, xCoordinate, yCoordinate, 33, 33, this);
			imagestate = 1;
		}
		else if(imagestate == 1 && imageflip == 2){
				g.drawImage(message, xCoordinate, yCoordinate, -33, 33, this);
				imagestate = 2;
			}else if(imagestate == 2 && imageflip == 2){
				g.drawImage(message2, xCoordinate, yCoordinate, -33, 33, this);
				imagestate = 1;
			}
		}
			
		 
		class TimerListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
		
	}
}
}
	

