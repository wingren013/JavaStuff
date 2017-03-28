package midterm;

import java.util.Scanner;

public class switch_statement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// switch statement 
		java.util.Scanner input = new Scanner(System.in);
		System.out.println("please enter grade");
		double grade = input.nextDouble();
		double ceil= Math.floor((grade-1)/10);
		int casing = (int) ceil;
		switch(casing) {
		case 0: System.out.println("F");
		break;
		case 1: System.out.println("F");
		break;
		case 2: System.out.println("F");
		break;
		case 3: System.out.println("F");
		break;
		case 4: System.out.println("F");
		break;
		case 5: System.out.println("F");
		break;
		case 6: System.out.println("D");
		break;
		case 7: System.out.println("C");
		break;
		case 8: System.out.println("B");
		break;
		case 9: System.out.println("A");
		}
	}

}
