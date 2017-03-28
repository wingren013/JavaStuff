package classwork;

import java.util.Scanner;

public class Pentagon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the side length of the pentagon");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			double side_length = input.nextDouble();
			System.out.println(side_length);
			
			double sim = 25 + 10*Math.pow(5, 0.5);
			double area = (Math.pow(side_length, 2)*Math.pow(sim, 0.5))/4;
			System.out.println("The area is " + area);
	}

}
