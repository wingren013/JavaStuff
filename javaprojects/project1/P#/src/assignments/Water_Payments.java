package assignments;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Water_Payments {
	static String promptMessage= "Please enter a value for ";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat myFormat= new DecimalFormat("$####.##");
		
		String xval1= JOptionPane.showInputDialog(null, promptMessage +"current meter reading");
		double x1= Double.parseDouble(xval1);
		
		String xval2= JOptionPane.showInputDialog(null, promptMessage +"previous meter reading");
		double x2= Double.parseDouble(xval2);
		
		String yval1= JOptionPane.showInputDialog(null, promptMessage +
				"current rate in dollars per gallon");
		double y1= Double.parseDouble(yval1);
		
		double amount= x1-x2;
		
		double charge= y1*amount;
		
			if (charge < 16.67){
				charge= 16.67;
			}
		
		String chargeF= myFormat.format(charge);
		
		JOptionPane.showMessageDialog(null, "The bill is "+chargeF,
				"Billing Amount", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
