package assignments;
import java.text.*;
import javax.swing.JOptionPane;

public class tip_calc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DecimalFormat myFormat= new DecimalFormat("$####.##");
		
String gratuityS= JOptionPane.showInputDialog(null, "What is the gratuity rate?"+ 
		"(as a decimal)");
	double gratuityI= Double.parseDouble(gratuityS);
	
String subtotalS= JOptionPane.showInputDialog(null, "What is the subtotal?");
	double subtotalI= Double.parseDouble(subtotalS);
	
double gratuity$= gratuityI*subtotalI;
double subtotal$= gratuity$+subtotalI;
String gratuityF= myFormat.format(gratuity$);
String subtotalF= myFormat.format(subtotal$);

JOptionPane.showMessageDialog(null, "The gratuity is"+gratuityF+
		" which brings the total to"+subtotalF+".");

	
	}

}
