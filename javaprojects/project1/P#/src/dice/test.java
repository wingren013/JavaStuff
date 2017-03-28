package dice;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		dx d20 = new dx(1, 20);
		System.out.println(dx.roll(d20.start, d20.end));
	}

}
