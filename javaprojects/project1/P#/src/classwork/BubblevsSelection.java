package classwork;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class BubblevsSelection {

	public static int[] kill(int[] myArray) {
		//int[] myArray = { 4, 5, 2, 3, 7, 555, 11, 1, 7, 10};
		for (int red = 0; red <= myArray.length-1; red++){
			for (int black = myArray.length-1; black > red; black--){
				//System.out.println(black);
				if(myArray[black]<myArray[black-1]){
					int x = myArray[black];
					myArray[black] = myArray[black-1];
					myArray[black-1] = x;
				}
			}
		}
		return myArray;
	}

	public static int[] selectionSort(int[] x) {
		for (int i=0; i<x.length-1; i++) {
			int minIndex = i;      // Index of smallest remaining value.
			for (int j=i+1; j<x.length; j++) {
				if (x[minIndex] > x[j]) {
					minIndex = j;  // Remember index of new minimum
				}
			}
			if (minIndex != i) { 
				//...  Exchange current element with smallest remaining.
				int temp = x[i];
				x[i] = x[minIndex];
				x[minIndex] = temp;
			}
		}
		return x;
	}
	public static int[] assign(int[] series){
		for(int i=0; i < series.length; i++){
			if(i%2==0){
				series[i] = i*1+(i*i/10);
			}else{series[i] = i-(2*i);}
		}
		return series;
	}
	public static void main(String[] args) {
		int[] series = new int[100000];
		int[] series2 = new int[100000];
		for(int i=0; i < series.length; i++){
			if(i%2==0){
				series[i] = i*1+(i*i/10);
			}else{series[i] = i-(2*i);}
		}
		for(int i=0; i < series2.length; i++){
			if(i%2==0){
				series2[i] = i*1+(i*i/10);
			}else{series2[i] = i-(2*i);}
		}
		Calendar x = GregorianCalendar.getInstance();
		//System.out.println(java.util.Arrays.toString(kill(series)));
		kill(series);
		Calendar y = GregorianCalendar.getInstance();
		//12034
		//11951
		//11861
		Calendar z = GregorianCalendar.getInstance();
		//System.out.println(java.util.Arrays.toString(selectionSort(series2)));
		selectionSort(series2);
		Calendar q = GregorianCalendar.getInstance();
		long bubble =  (y.getTimeInMillis()-x.getTimeInMillis());
		long selection = q.getTimeInMillis()-z.getTimeInMillis();
		long compare = selection-bubble;
		System.out.println("bubble sort "+ bubble);
		System.out.println("selection sort "+ selection);
		System.out.println(compare);
	}

}