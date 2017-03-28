package Individual_Work;

import java.util.Scanner;

public class display_matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		printMatrix(n);
	}
	public static void printMatrix(int n){
		int total = n*n;
		int count = 1;
		
		while(count < total+1){
			if((count)%n == 0){
				System.out.print(Math.round(Math.random()) + " ");
				System.out.println();
				count ++;
			}else{
				System.out.print(Math.round(Math.random()) + " ");
				count ++;
			}
			//count ++;
		}
	}

}
