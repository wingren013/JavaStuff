package classwork;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class bvs {

	/**
	 * @param args
	 */
		// TODO Auto-generated method stub
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
			int[] series = new int[1000];
			int[] series2 = new int[10000];
			int[] series3 = new int[10000000];
			int[] series4 = new int[10000000];
			assign(series);
			assign(series2);
			assign(series3);
			assign(series4);
			Calendar x = GregorianCalendar.getInstance();
			selectionSort(series2);
			Calendar y = GregorianCalendar.getInstance();
			
			Calendar z = GregorianCalendar.getInstance();
			selectionSort(series2);
			Calendar q = GregorianCalendar.getInstance();
			
			Calendar a = GregorianCalendar.getInstance();
			//selectionSort(series3);
			Calendar b = GregorianCalendar.getInstance();
			
			Calendar c = GregorianCalendar.getInstance();
			java.util.Arrays.sort(series4);
			Calendar d = GregorianCalendar.getInstance();
			Calendar h = GregorianCalendar.getInstance();
			java.util.Arrays.sort(series4);
			Calendar j = GregorianCalendar.getInstance();
			
			System.out.println(y.getTimeInMillis()-x.getTimeInMillis());
			System.out.println(q.getTimeInMillis()-z.getTimeInMillis());
			System.out.println(b.getTimeInMillis()-a.getTimeInMillis());
			System.out.println(d.getTimeInMillis()-c.getTimeInMillis());
			System.out.println(j.getTimeInMillis()-h.getTimeInMillis());

		}

	}
