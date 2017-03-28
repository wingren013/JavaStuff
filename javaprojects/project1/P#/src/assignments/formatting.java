package assignments;

public class formatting {

	public static void main(String[] args) {
		String string= "Sawyer";
		double number=555.55;
		int number2=555;
		boolean blean=true;
		char A='A';

		System.out.printf("I am %80s", string);
		System.out.println();
		System.out.printf("this is my number: %5.9f", number);
		System.out.println();
		System.out.printf("this is my number as an integer:%5d", number2);
		System.out.println();
		System.out.printf("this is my number in scientific notation: %5.9e", number);
		System.out.println();
		System.out.printf("this is%6b ", blean);
		System.out.println();
		System.out.printf("plus I can do this%10c", A );
	}

}
