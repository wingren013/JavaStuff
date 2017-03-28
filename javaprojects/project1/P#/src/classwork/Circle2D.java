package classwork;

import Homework.RegularPolygon;

public class Circle2D {

	/**
	 * @param args
	 */
	
	private double radius = 1;
	private double x =0;
	private double y =0;
	
	public Circle2D(){
		
	}
	
	public Circle2D(double newradius){
		
	}
	public Circle2D(double newradius, double newx, double newy){
		setRadius(newradius);
		setX(newx);
		setY(newy);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y){
		this.y = y;
	}
	public double getArea(){
		double area = (Math.PI * Math.pow(this.radius, 2));
		return area;
	}
	public double getPerimeter(){
		double perimeter = 2*Math.PI*this.radius;
		return perimeter;
	}
	public boolean contains(double x, double y){
		boolean answer = false;
		if(Math.pow((Math.pow((this.x - x), 2)+(Math.pow(this.y - y, 2))), 1/2) <= this.radius){
			answer = true;
		}
		if(Math.pow((Math.pow((x - this.x), 2)+(Math.pow(y - this.y, 2))), 1/2) <= this.radius){
			answer = true;
		}
		return answer;
	}
	
	public boolean contains(Circle2D circle){
		boolean answer = false;
		if(circle.getArea() <= this.getArea()){
			if(Math.pow((Math.pow((this.x - circle.x), 2)+(Math.pow(this.y - circle.y, 2))), 1/2) <= this.radius - circle.radius){
				answer = true;
			}
			if(Math.pow((Math.pow((circle.x - this.x), 2)+(Math.pow(circle.y - this.y, 2))), 1/2) <= this.radius - circle.radius){
				answer = true;
			}
		}
		return answer;
	}
	public boolean overlaps(Circle2D circle){
		boolean answer = false;
		if(Math.pow((Math.pow((this.x - circle.x), 2)+(Math.pow(this.y - circle.y, 2)))-circle.radius, 1/2) <= this.radius){
			answer = true;
		}
		if(Math.pow((Math.pow((circle.x - this.x), 2)+(Math.pow(circle.y - this.y, 2)))-circle.radius, 1/2) <= this.radius){
			answer = true;
		}
		return answer;
	}
	
}
