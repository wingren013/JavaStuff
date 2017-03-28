package Practice;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.*;

public class fill_poly extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		fill_poly frame = new fill_poly();
		frame.add(new panel_fill());
		frame.setTitle("Filled Polygon");
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	fill_poly(){
	}

}
class panel_fill extends JPanel{
	@Override
	protected void paintComponent(Graphics g){
		g.setColor(new Color(255, 15, 170));
		g.fillPolygon(new Polygon(new int[] {1, 60, 80, 70, 33, 20}, new int[] {5, 50, 100, 90, 50, 30}, 6));
	}
}
