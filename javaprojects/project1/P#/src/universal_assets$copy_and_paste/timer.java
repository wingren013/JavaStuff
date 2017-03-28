package universal_assets$copy_and_paste;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class timer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar q = GregorianCalendar.getInstance();
		Calendar z = GregorianCalendar.getInstance();
		long r = z.getTimeInMillis()-q.getTimeInMillis();
		System.out.println(r);
		int x = 0;
		int y = 0;
		while( x==0){
		for(int i = 0; r<10000; r =  (z.getTimeInMillis()-q.getTimeInMillis())){
			z = GregorianCalendar.getInstance();
			System.out.println(r);
			System.out.print(" "+ y + " ");
		}
		if(r >= 10000){
			System.out.println("sd.");
			q = GregorianCalendar.getInstance();
			r = 0;
			y++;
		}
		}
		
		}
	}


