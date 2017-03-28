package advanced_java;

import javax.swing.JOptionPane;

public class run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog(null, "enter a string");
	String output = Convert_ascii.convert(Letters.countletters(input));
	System.out.println(output.length());
	}

}
