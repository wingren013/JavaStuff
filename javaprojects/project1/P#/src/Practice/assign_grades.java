package Practice;

import java.util.Scanner;

public class assign_grades {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number of students");
		Scanner input = new Scanner(System.in);
		int class_size = input.nextInt();
		int[] series = new int[class_size];
		String[] grades = new String[class_size];
		
		for(int i=0; i < class_size; i++){
			System.out.println("please enter next grade");
			Scanner grade_in = new Scanner(System.in);
			series[i] = grade_in.nextInt();
		}
		if (series[class_size-1] != 0){
			for(int i=0; i< class_size; i++){
				System.out.print(series[i] + " ");
			}
		}
		int best = 0;
		int x = 0;
		for(int i=1; i < class_size; i++){
			if(series[i] > series[i-1]){
				best = series[i];
			}else{
				best = series[i-1];
			}
		}
		System.out.println();
		System.out.println(x);
		for(int i=0; i < class_size; i++){
			if (series[i] >= best-10){
				grades[i] = "A";
			}
			else if(series[i] >= best-20){
				grades[i] = "B";
			}
			else if(series[i] >= best-30){
				grades[i] = "C";
			}
			else if(series[i] >= best -40){
				grades[i] = "D";
			}else{
				grades[i] = "F";
			}
		}
		if (series[class_size-1] != 0){
			for(int i=0; i< class_size; i++){
				System.out.print(grades[i] + " ");
			}
		}

	}
}
