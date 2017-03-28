package misc;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class SumAndAverage {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat myFormat = new DecimalFormat("####.##");
		
			String input1 =	JOptionPane.showInputDialog(null, "What number does the sequence begin with?");
			String input2 = JOptionPane.showInputDialog(null, "What number does the sequence end with?");
			String input3 = JOptionPane.showInputDialog(null, "All numbers in the sequence must be divisible by what?");
			String input4 = JOptionPane.showInputDialog(null, "All numbers in the sequence are to what power?");
			String input5 = JOptionPane.showInputDialog(null, "All numbers in the sequence are divided by what?");
			
			double x1= Double.parseDouble(input1);
			double x2= Double.parseDouble(input2);
			double x3= Double.parseDouble(input3);
			double x4= Double.parseDouble(input4);
			double x5= Double.parseDouble(input5);
		 double sum = 0;
		 double i=x1-1;
		 int count = 0;
		 
		 
		 while(i < x2){
			 i++;
			 if(i%x3 == 0){
			 		count++;
					sum = Math.pow(i/x5, x4)+ sum;
			 }
				}
		 		String sum1 = myFormat.format(sum);
				String sum2 = myFormat.format(sum/count);
		        System.out.println(sum1);
		        System.out.println(sum2);
		        System.out.println(count);
	}

}