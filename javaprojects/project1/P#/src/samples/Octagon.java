package samples;

public class Octagon extends GeometricObject
	implements Comparable<Octagon>, Cloneable {
	
	double side;
	
	//@Override (unnecessary due to dynamic binding)
	public double getArea() {
		// TODO Auto-generated method stub
		return (2+4/Math.pow(2, 1/2))*Math.pow(this.side, 2);
	}
	//@Override (unnecessary due to not existing in Superclass)
	public double setSide(double x) {
		this.side = x;
		return this.side;
	}

	//@Override (unnecessary due to dynamic binding)
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return this.side*8;
	}
	
	

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
//System.out.println("test");
	Octagon octo = new Octagon();
	octo.setSide(5);
	System.out.println("area is " + octo.getArea());
	System.out.println("perimeter is " + octo.getPerimeter());
	Octagon octo2 = (Octagon)octo.clone();
	octo2.setSide(8);
	System.out.println(octo.side);
	System.out.println(octo2.side);
	System.out.println(octo.compareTo(octo2));
	}

	@Override
	public int compareTo(Octagon o) {
		// TODO Auto-generated method stub
		int x = 0;
		if(this.side > o.side){
			x = 1;
		}else if(this.side < o.side){
			x = -1;
		}else if(this.side == o.side){
			x = 0;
		}
		return x;
	}

}
