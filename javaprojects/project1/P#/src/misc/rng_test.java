package misc;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class rng_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = d100000000();
		Calendar q = GregorianCalendar.getInstance();
		
		while(x != 50){
			x = d100000000();
		}
		while(x == 50){
			System.out.println(50);
			Calendar z = GregorianCalendar.getInstance();
			System.out.println(z.getTimeInMillis()-q.getTimeInMillis());
			break;
		}
	}
	public static int d50(){
		int result = (int) (1 + Math.random() * 50);
		
		return result;
	}
	public static int d10(){
		int result = (int) (1 + Math.random() * 10);
		
		return result;
	}
	public static int d100000000(){
		int result = (int) (1 + Math.random() * 100000000);
		
		return result;
	}
	
	public static int attack_result(int attack, int defense, int damage, int armor){
		int final_damage= 0;
		
		
		return final_damage;
	}

}

