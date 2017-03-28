package samples;

import javax.swing.JFrame;

public class May extends calendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calendar fram = new calendar();
		fram.setTitle("calendar");
		fram.setSize(900,900);
		fram.setLocation(0,0);
		fram.setVisible(true);
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
