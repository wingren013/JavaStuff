package assignments;

import javax.swing.JOptionPane;

public class Quadratics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String xval1= JOptionPane.showInputDialog(null, "Please enter the value for A");		
		String xval2= JOptionPane.showInputDialog(null, "Please enter the value for B");		
		String xval3= JOptionPane.showInputDialog(null, "Please enter the value for C");
		
		double A= Double.parseDouble(xval1);
		double B= Double.parseDouble(xval2);
		double C= Double.parseDouble(xval3);
		
		double logic_toggle= (Math.pow(B, 2))-(4*A*C);		
		double r1= ( (0-B) + Math.pow(logic_toggle, 0.5) ) / (2*A);		
		double r2= ( (0-B) - Math.pow(logic_toggle, 0.5) ) / (2*A);
		
		if(logic_toggle > 0){
			JOptionPane.showMessageDialog(null,  "The roots are " + r1 + " and " + r2,
					"TWO ROOTS", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(logic_toggle == 0){
			JOptionPane.showMessageDialog(null,  "The root is " + r1,
					"ONE ROOT", JOptionPane.INFORMATION_MESSAGE);
		}
		else{
			JOptionPane.showMessageDialog(null,  "There are no real roots",
					"NO REAL ROOTS", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
