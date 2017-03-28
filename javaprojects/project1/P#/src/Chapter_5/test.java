package Chapter_5;
import Chapter_5.genmeth;
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i = Integer.toBinaryString(689);
		System.out.println(genmeth.print_binary(689));
		System.out.println(Integer.toBinaryString(689));
		int x = Integer.parseInt(i);
		System.out.println(Double.toHexString(x));
		System.out.println(Integer.toHexString(x));
		System.out.println(Math.abs(-6.7));

		System.out.println(Math.toRadians((Math.PI)/2));
		//why does this not work? 
		
		System.out.println(Math.toRadians(90));
		double q = Math.toDegrees((Math.PI)/2);
		System.out.println(Math.toRadians(q));
		
		double rand = genmeth.randomizer(50, 99);
		System.out.println(rand);
		
	}

}
