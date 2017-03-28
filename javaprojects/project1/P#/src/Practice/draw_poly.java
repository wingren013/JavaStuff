package Practice;

import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.*;

public class draw_poly extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		draw_poly frame = new draw_poly();
		frame.add(new panel());
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
}
class panel extends JPanel{
	@Override
	protected void paintComponent(Graphics g){
		g.drawPolygon(new int[] {1, 60, 80, 70, 33, 20}, new int[] {5, 50, 100, 90, 50, 30}, 6);
	}
	protected void paintComponent(Graphics g, int[] x, int[] y, int z){
		g.drawPolygon(x, y, z);
	}
	protected void paintComponent(Graphics g, int z){
		int x[];
		int y[];
		x = new int[z];
		y = new int[z];
		for(int i=0; i < z; i++){
			System.out.println("please enter next x coordinate");
			Scanner inputx = new Scanner(System.in);
			x[i] = inputx.nextInt();
			System.out.println("please enter next y coordinate");
			Scanner inputy = new Scanner(System.in);
			y[i] = inputy.nextInt();
		}
		g.drawPolygon(x, y, z);
	}
}
