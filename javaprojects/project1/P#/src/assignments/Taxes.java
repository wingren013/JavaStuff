package assignments;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Taxes {
	static int test=1;
	//set to 1 when testing stability
	public static void main(String[] args) {

		int choice_toggle=0;
		double rate=0;

		DecimalFormat moneyFormat= new DecimalFormat("$####.##");
		String toggle= JOptionPane.showInputDialog(null, "Enter 1 for single, 2 for joint, 3 for married but seperate, " +
				"and 4 for head of family");

		choice_toggle= Integer.parseInt(toggle);

			if (choice_toggle==1){
				rate = 0.10;
			}
			else if (choice_toggle==2){
				rate = 0.08;
			}	
			else if (choice_toggle==3){
				rate = 0.09;
			}	
			else if (choice_toggle==4){
				rate = 0.07;
			}	
			else {
				JOptionPane.showMessageDialog(null, "Invalid entry");
			}	
		
		
		
		
		String taxable_amount_string= JOptionPane.showInputDialog(null, "Enter the taxable income");
		double taxable_amount_double= Double.parseDouble(taxable_amount_string);

		double taxes= taxable_amount_double*rate;
		String formatted_taxes= moneyFormat.format(taxes);

		if(test==1){
			System.out.println(taxable_amount_double);
			System.out.println(taxes);
			System.out.println(formatted_taxes);
			JOptionPane.showMessageDialog(null, formatted_taxes);
		}
		else{
			JOptionPane.showMessageDialog(null, formatted_taxes);
		}

		//switch(choice_toggle){
		//case 1: rate=0.1;
		//case 2: rate=0.08;
		//case 3: rate=0.09;
		//case 4: rate=0.07;
		//default: JOptionPane.showMessageDialog(null, "Invalid entry");
		//}
	}
}