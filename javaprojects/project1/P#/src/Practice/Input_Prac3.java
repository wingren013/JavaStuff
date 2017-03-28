package Practice;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.*;
import java.util.Scanner;

public class Input_Prac3 {
	static int check =0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("Please enter a radius");
Scanner input = new Scanner(System.in);
		double radius=input.nextDouble();
	System.out.println("The radius is: " + radius);
System.out.println("Please enter a length");
Scanner input2 = new Scanner(System.in);
		double length=input2.nextDouble();
	System.out.println("The length is: " + length);
		double area=Math.pow(radius, 2)*Math.PI;
	System.out.println("The area is: " + area);
		double volume=area*length;
	System.out.println("The volume is: " + volume);
System.out.println("a"+" "+" "+"b"+" "+" "+"pow(a, b)");
System.out.println(1+" "+" "+ 2 +" "+" "+Math.pow(1, 2));
System.out.println(2+" "+" "+ 3 +" "+" "+Math.pow(2, 3));
System.out.println(3+" "+" "+ 4 +" "+" "+Math.pow(3, 4));
System.out.println(4+" "+" "+ 5 +" "+" "+Math.pow(4, 5));
System.out.println(5+" "+" "+ 6 +" "+" "+Math.pow(5, 6));
DecimalFormat myFormat= new DecimalFormat ("####");
String pow1= myFormat.format(Math.pow(1, 2));
String pow2= myFormat.format(Math.pow(2, 3));
String pow3= myFormat.format(Math.pow(3, 4));
String pow4= myFormat.format(Math.pow(4, 5));
String pow5= myFormat.format(Math.pow(5, 6));
System.out.println("Formatted Answer");
System.out.println("a"+" "+" "+"b"+" "+" "+"pow(a, b)");
System.out.println(1+" "+" "+ 2 +" "+" "+pow1);
System.out.println(2+" "+" "+ 3 +" "+" "+pow2);
System.out.println(3+" "+" "+ 4 +" "+" "+pow3);
System.out.println(4+" "+" "+ 5 +" "+" "+pow4);
System.out.println(5+" "+" "+ 6 +" "+" "+pow5);
		
	}

}
