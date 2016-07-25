package Lesson6;

public class Shape {
	
	public double area;
	public double perimeter;
	public String name;
	
	Shape() {
		area = 0;
		perimeter = 0;
		name = "";
	}
	
	Shape(double a, double b, String c) {
		area = a;
		perimeter = b;
		name = c;
	}
	
	public double GetArea() {
		return area;
	}
}
