package Lesson6;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	Rectangle() {
		super();	//area and perim to zero
		width = 0;
		length = 0;
	}
	
	Rectangle (double a, double b) {
		width = a;
		length = b;
		name = "Rectangle";
	}
	
	
	public void ComputeArea() {
		area = width*length;
	}
	
	public void SetWidth(double w) {
		width = w;
	}
	
	public void SetLength(double l) {
		length = l;
	}
}
