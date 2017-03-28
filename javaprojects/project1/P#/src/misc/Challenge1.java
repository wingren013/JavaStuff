package misc;
import java.io.IOException;


public class Challenge1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int sum = 10;
		for (int i=0; i<4; i++){
			if (i % 3 == 0)
				continue;
				sum += i;
			}
		System.out.printf("Sum = %d", sum);
		System.out.println();
		System.out.println();
		
		int sum2 = 10;
		int i2 = 0;
				while (i2 < 4){
					//System.out.println(i2);
					if (i2 % 3 == 0)
						//continue;
						sum2 += i2;
					System.out.println(i2);
						i2++;
						System.out.println(i2);
				}
				System.out.printf("Sum = %d", sum2);
		}

}
