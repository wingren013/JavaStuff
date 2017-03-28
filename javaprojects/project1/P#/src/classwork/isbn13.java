package classwork;

import java.util.Scanner;

public class isbn13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the first 12 disgits of an ISBN-13 as a string");
		Scanner input = new Scanner(System.in);
		long k = input.nextLong();
		if (((10) - (sumDigits(k)) % (10)) == 10){
			k = (k *10)+0;
		}else{ k = (k*10) + ((10) - (sumDigits(k)) % (10));}
		System.out.println(k);
		System.out.println(10 - (9+3*7+8+3*0+1+3*3+2+3*1+3+3*0+8+3*0) %10);
	}
	public static int sumDigits(long n){
		int sum = 0;
		int count = 0;
		while(n != 0){
			count++;
		long x =  n%10;
		n = n/10;
		if(count%2 == 0){
			sum += 3*x;
		}else{
		sum += x;}
		}
		return sum;
	}

}
