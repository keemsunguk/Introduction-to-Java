package Lesson6;

public class Triangle1 extends Shape1 {

	private double base;
	private double height;
	private double a;
	private double b;
	private double c;
//	private double A;
//	private double B; 
//	private double C;
	
	Triangle1() {
		super();
		base = 0;
		height = 0;
	}
	
	Triangle1(String n, double b, double h) {
		//super(n);
		name = n;
		base = b;
		height = h;
	}
	
	public double getArea() {
		return area;
	}
	
	public void computeArea() {
		area = base*height/2;
	}
	public void computePerimeter() {
		perimeter = a+b+c;
	}
	public void computePerimeter(double x, double y, double z) {
		a = x;
		b = y;
		c = z;
		computePerimeter();
	}
	
	public double getHeight() {
		return height;
	}
}
