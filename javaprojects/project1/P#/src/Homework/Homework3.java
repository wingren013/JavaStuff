package Homework;

import java.util.Scanner;

public class Homework3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter ten numbers");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			double num1 = input.nextDouble();
			double num2 = input.nextDouble();
			double num3 = input.nextDouble();
			double num4 = input.nextDouble();
			double num5 = input.nextDouble();
			double num6 = input.nextDouble();
			double num7 = input.nextDouble();
			double num8 = input.nextDouble();
			double num9 = input.nextDouble();
			double num10 = input.nextDouble();
			
			 double sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
			 double average = sum/10;
			 System.out.println("The average is " + average);
			 double dev_sumsquare = Math.pow(num1, 2) + Math.pow(num2, 2) + Math.pow(num3, 2) + 
					 Math.pow(num4, 2) + 
					 Math.pow(num5, 2) + Math.pow(num6, 2) + Math.pow(num7, 2) + Math.pow(num8, 2) + 
					 Math.pow(num9, 2) + Math.pow(num10, 2);
			 double dev_sum = Math.pow((dev_sumsquare-(Math.pow(sum, 2)/10))/9, 0.5);
			 System.out.println("The deveation is " + dev_sum);
	}

}
