package misc;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class LoopExtra {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintStream out = new PrintStream(new FileOutputStream("LoopExtra.txt"));
		System.setOut(out);
		double sum1 = 0;
		int i1 = 0;
		double term1 = 0.33;
		double sign1 = 1.0;
		double sum2 = 0;
		double term2 = 0.33;
		double sign2 = 1.0;

		while (i1 <= 10) {
			sum1 = sum1 + sign1*term1;
			//System.out.println("term");
			//System.out.println(sign1*term1);
			
			//System.out.println("sum");
			System.out.println(sum1);
			term1= 0.33*term1;
			sign1 = -sign1;
			i1++;
		}
		for (int i2=0; i2 <= 10; i2++) {
			sum2 = sum2 + sign2*term2;
			//System.out.println("term");
			//System.out.println(sign2*term2);
			//System.out.println("sum");
			System.out.println(sum2);
			term2= 0.33*term2;
			sign2 = -sign2;
		}
	}

}
