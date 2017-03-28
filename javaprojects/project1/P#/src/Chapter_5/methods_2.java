package Chapter_5;

public class methods_2 {

	/**
	 * @param args
	 */
	public static int sum_for(int i1, int i2) {
		int result=0;
		for (int i = i1; i <= i2; i++){
			result += i;
		}
		
		return result;
		//sets sum_for equal to the result
	}
	public static void main(String[] args) {
System.out.println(sum_for(1, 10));
int x = sum_for(2,5)+3;
//output of sum_for is an integer
System.out.println(x);
	}


}