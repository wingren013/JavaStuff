package assignments;
import java.text.*;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Geometery1 {
static String promptMessage= "Please enter a value for ";
static String confirmMessage= "The ordered pairs are: ";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String xval1= JOptionPane.showInputDialog(null, promptMessage +"x1");
double x1= Double.parseDouble(xval1);
//JOptionPane.showMessageDialog(null, promptMessage +"x1");
//Scanner xval1 = new Scanner(System.in);
//double x1= xval1.nextDouble();
String yval1= JOptionPane.showInputDialog(null, promptMessage +"y1");
double y1= Double.parseDouble(yval1);
//JOptionPane.showMessageDialog(null, promptMessage +"y1");
//Scanner yval1 = new Scanner(System.in);
//double y1= yval1.nextDouble();
String xval2= JOptionPane.showInputDialog(null, promptMessage +"x2");
double x2= Double.parseDouble(xval2);
//JOptionPane.showMessageDialog(null, promptMessage +"x2");
//Scanner xval2 = new Scanner(System.in);
//double x2= xval2.nextDouble();
String yval2= JOptionPane.showInputDialog(null, promptMessage +"y2");
double y2= Double.parseDouble(yval2);
//JOptionPane.showMessageDialog(null, promptMessage +"y2");
//Scanner yval2 = new Scanner(System.in);
//double y2= yval2.nextDouble();
String xval3= JOptionPane.showInputDialog(null, promptMessage +"x3");
double x3= Double.parseDouble(xval3);
//JOptionPane.showMessageDialog(null, promptMessage +"x3");
//Scanner xval3 = new Scanner(System.in);
//double x3= xval3.nextDouble();
String yval3= JOptionPane.showInputDialog(null, promptMessage +"y3");
double y3= Double.parseDouble(yval3);
//JOptionPane.showMessageDialog(null, promptMessage +"y3");
//Scanner yval3 = new Scanner(System.in);
//double y3= yval3.nextDouble();

DecimalFormat myFormat = new DecimalFormat("####");
String L1="x";
String message= "Yes "+L1+" stuff";
System.out.println(message);

JOptionPane.showMessageDialog(null, confirmMessage + "(" + x1 + ", " + y1 + ") "+ "(" + x2 + ", " + y2 + ") "+ "(" + x3 + ", " + y3 + ") ",
		"ordered pairs", JOptionPane.INFORMATION_MESSAGE);

double s1= Math.pow((Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2)), 0.5);
double s2= Math.pow((Math.pow(x2-x3, 2)+Math.pow(y2-y3, 2)), 0.5);
double s3= Math.pow((Math.pow(x3-x1, 2)+Math.pow(y3-y1, 2)), 0.5);
double S_prime=(s1+s2+s3)/2;
double Area= Math.pow((S_prime*(S_prime-s1))*(S_prime*(S_prime-s2))*(S_prime*(S_prime-s3)), 0.5);
L1="First Side";
JOptionPane.showMessageDialog(null, "The "+ L1 +" is: " +s1,
		L1, JOptionPane.INFORMATION_MESSAGE);
L1="Second Side";
JOptionPane.showMessageDialog(null, "The "+ L1 +" is: " +s2,
		L1, JOptionPane.INFORMATION_MESSAGE);
L1="Third Side";
JOptionPane.showMessageDialog(null, "The "+ L1 +" is: " +s3,
		L1, JOptionPane.INFORMATION_MESSAGE);
L1="Area";
JOptionPane.showMessageDialog(null, "The "+ L1 +" is: " +Area,
		L1, JOptionPane.INFORMATION_MESSAGE);

	}

}
