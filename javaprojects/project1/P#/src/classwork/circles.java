package classwork;
import classwork.Circle2D;
public class circles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2D c1 = new Circle2D(5.5, 2, 2);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.contains(3, 3));
		System.out.println(c1.contains(new Circle2D(10.5, 4, 5)));
		System.out.println(c1.overlaps(new Circle2D(2.3, 3, 5)));
	}

}
