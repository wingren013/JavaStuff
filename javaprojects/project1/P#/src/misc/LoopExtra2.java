package misc;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


public class LoopExtra2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintStream out = new PrintStream(new FileOutputStream("LoopExtra2.txt"));
		System.setOut(out);
		double sum1 = 0;
		double term1 = 1.0;
		double sign1 = -1.0;
		double multiplier1= 1;
		double sum2 = 0;
		double term2 = 1.0;
		double sign2 = 1.0;
		double multiplier2= 1;
		int i2 =0;

		for (int i1=0; i1 <= 10;) {
			i1++;
			//System.out.println("i");
			//System.out.println(i1);
			multiplier1 = 1/Math.pow(i1, 3);
			term1= multiplier1*term1;
			sign1 = -sign1;
			sum1 = sum1 + sign1*term1;
			//System.out.println("term");
			//System.out.println(sign1*term1);
			//System.out.println("sum");
			System.out.println(sum1);
		}

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		while (i2 <= 10) {
			sum2 = sum2 + sign2*term2;
			//System.out.println("term");
			//System.out.println(sign2*term2);
			//System.out.println("sum");
			System.out.println(sum2);
			term2= multiplier2*term2;
			sign2 = -sign2;
			i2++;
			//System.out.println("i");
			//System.out.println(i2);
			multiplier2 = 1/Math.pow(i2, 3);
		}
	}
}
