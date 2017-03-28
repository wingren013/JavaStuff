package dice;

public class dx extends die {

	public static void main(String[] args) {
		dx d3 = new dx(1, 3);
		System.out.println(dx.roll(d3.start, d3.end));
	}
	
	dx(int x, int y){
	start = x;
	end = y;
	}
	
	public static int roll(int x, int y){
		return (int) (x + Math.random()*y);
	}
	
	public static double randomizer(double x, double y){
		double i = y;
		return x + Math.random()*i;
	}
}
