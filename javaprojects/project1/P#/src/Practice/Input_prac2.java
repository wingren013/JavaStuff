package Practice;

import javax.swing.JOptionPane;

public class Input_prac2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= JOptionPane.showInputDialog(null, "Enter an integer " +
				"between 0 and 127");
		int output= Integer.parseInt(input);
		char x= (char) output;
		JOptionPane.showMessageDialog(null, "The ASCII character is: " + x );
		
		String input2= JOptionPane.showInputDialog(null, "Enter an integer " +
				"between 0 and 1000");
		int output2= Integer.parseInt(input2);
			int y1= output2%10;
			int y2= (output2/10)%10;
			int y3= (output2/100)%10;
			int y4= (output2/1000)%10;
			int x1= y1+y2+y3+y4;
		JOptionPane.showMessageDialog(null, "The sum of the digits is: " + x1 );

	}

}
