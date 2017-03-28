package Chapter_5;
import javax.swing.JOptionPane;

import Chapter_5.genmeth;
public class teesting_ground {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
System.out.println(genmeth.format_numbers("####.##", 7.334542));
System.out.println(genmeth.dollar_format(7.334542));
System.out.println();
double x = genmeth.SEQsum();
System.out.println(genmeth.format_numbers("####.##", x));
double y = genmeth.SEQaverage();
System.out.println();
System.out.println(genmeth.format_numbers("####.##", y));
System.out.println();
System.out.println(genmeth.format_numbers("####.##", y));
*/
		//System.out.println(genmeth.SEQsumINPUTbasic(1, 10));	
		//System.out.println(genmeth.SEQaverageINPUTbasic(1, 10));	
		//System.out.println(genmeth.starwars());
		//String val_for_p = JOptionPane.showInputDialog(null, "enter a number");
		//System.out.println(genmeth.parseD(val_for_p) + 1);
		
		System.out.println(genmeth.getPentagonalNumber(0, 10));
		System.out.println(genmeth.getPentagonalNumber(10, 20));
		System.out.println(genmeth.getPentagonalNumber(20, 30));
		System.out.println(genmeth.getPentagonalNumber(30, 40));
		System.out.println(genmeth.getPentagonalNumber(40, 50));
		System.out.println(genmeth.getPentagonalNumber(50, 60));
		System.out.println(genmeth.getPentagonalNumber(60, 70));
		System.out.println(genmeth.getPentagonalNumber(70, 80));
		System.out.println(genmeth.getPentagonalNumber(80, 90));
		System.out.println(genmeth.getPentagonalNumber(90, 100));
		System.out.println(genmeth.getPentagonalNumber(1, 100));
		System.out.println(genmeth.sumDigits(123456789));
		System.out.println(genmeth.SEQsumINPUTbasic(1, 9));
			}


		}


