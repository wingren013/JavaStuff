package Chapter_5;

public class Methods {

	/**
	 * @param args
	 */
	public static int sum(int i1, int i2) {
		int result=0;
		i1 -= 1;
		while (i1 < i2){
			i1++;
			result += i1;
		}
		
		return result;
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sum(1, 10));
	}


}
