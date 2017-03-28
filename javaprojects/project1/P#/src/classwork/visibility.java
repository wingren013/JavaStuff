package classwork;

public class visibility {

	/**
	 * @param args
	 */
	public static double randomite(){
		int x = (int) (1+Math.random()*9);
		double numnum = Math.pow(10, x)*(Math.random()*Math.random()+Math.random());
		return numnum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(randomite());
		System.out.println(randomite());
		System.out.println(randomite());
		System.out.println(randomite());
		System.out.println(randomite());
		System.out.println(randomite());
		System.out.println(randomite());
	}

}
