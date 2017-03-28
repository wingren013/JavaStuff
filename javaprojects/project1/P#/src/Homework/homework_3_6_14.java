package Homework;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class homework_3_6_14 {
	public static int sumDigits(long n){
		int sum = 0;
		while(n != 0){
		long x =  n%10;
		n = n/10;
		sum += x;
		}
		return sum;
	}
	public static boolean extract_first_numeral(long n){
		boolean bool = false;
		long h = 0;
		long x = reverse(n);
	    h = x%10;
		if((x - 4)%10==0){
			bool = true;
		}else if((x-5)%10==0){
			bool = true;
		}else if((x-6)%10==0){
			bool = true;
		}else if((((x-7)/10)-3)%10==0){
			bool = true;
		}else{ bool = false;}
		
		return bool;
	}
	public static long reverse(long n){
		long y = 0;
		while(n != 0){
			long x = n%10;
			//y += x*Math.pow(10, count-1);
			y = y*10 + x;
			n = n/10;
		}
		return y;
	}
	public static long secondSum(long cardnum){
		long sum = 0;
		while(cardnum != 0){
			long x =  sumDigits(cardnum%10);
			cardnum = cardnum/10;
			cardnum = cardnum/10;
			sum += x;
			}
		//System.out.println(sum);
		return sum;
	}

	public static boolean mod10check(long cardnum) {
		boolean bool = false;
		long truesum =0;
		long cardnum2 = cardnum;
		long sum = 0;
		String str = Long.toString(cardnum);
		if(str.length() <= 16 && str.length() >= 13){
			while(cardnum != 0){
				cardnum = cardnum/10;
				long x =  sumDigits(2*(cardnum%10));
				cardnum = cardnum/10;
				sum += x;
			}
			//System.out.println(sum);
			truesum = sum + secondSum(cardnum2);
			if(truesum%10 == 0 && extract_first_numeral(cardnum2)){
				System.out.println("Valid Card");
				bool = true;
			}else{ System.out.println("Invalid Card");}
		}else{
			System.out.println("Invalid card length");}


		return bool;
	}

	public static void main(String[] args){
		mod10check(4388576018402626l);
		System.out.println(sumDigits(1));
		System.out.println("please enter card number");
		Scanner input = new Scanner(System.in);
		long thing = input.nextLong();
		mod10check(thing);
	}

}
