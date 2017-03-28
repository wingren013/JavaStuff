package Individual_Work;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class gregory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar x = GregorianCalendar.getInstance();
		System.out.println(x);
		System.out.println(x.getTimeInMillis());
		System.out.print((x.get(x.MONTH))+1);
		System.out.print("/"+(x.get(x.DAY_OF_MONTH)));
		System.out.print("/"+(x.get(x.YEAR)));
		x.setTimeInMillis(1234567898765L);
		//x.setTimeInMillis(1395353155652L);
		System.out.println();
		System.out.print((x.get(x.MONTH)+1));
		System.out.print("/"+(x.get(x.DAY_OF_MONTH)));
		System.out.print("/"+(x.get(x.YEAR)));
	}
}
