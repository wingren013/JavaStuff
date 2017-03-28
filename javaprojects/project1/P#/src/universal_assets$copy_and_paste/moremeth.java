package universal_assets$copy_and_paste;

import java.util.Scanner;

public class moremeth {

	/**
	 * @param args
	 */
	public static void death(int x, int y) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[x][y];
		java.util.Scanner input = new Scanner(System.in);
		System.out.println("Enter "+ matrix.length+ " rows " +
				"and "+ matrix[0].length+" columns: ");
		for (int row =0; row < matrix.length; row++){
			for (int column = 0; column < matrix[row].length; column++){
				matrix[row][column] = input.nextInt();
			}
		}
	}
	public static int[][] kill(int x, int y) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[x][y];
		java.util.Scanner input = new Scanner(System.in);
		System.out.println("Enter "+ matrix.length+ " rows " +
				"and "+ matrix[0].length+" columns: ");
		for (int row =0; row < matrix.length; row++){
			for (int column = 0; column < matrix[row].length; column++){
				matrix[row][column] = input.nextInt();
			}
		}
		return matrix;
	}
	public static void main(String[] args) {
		int i = 4;
		System.out.println(java.util.Arrays.toString(kill(5, 5)));
	}
}
