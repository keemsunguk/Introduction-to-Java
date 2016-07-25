package Lesson6;

public class Triangle extends Shape {
	
	double base;
	double height;
	
	Triangle() {
		super();	//area and perim to zero
		base = 0;
		height = 0;
	}
	
	Triangle(double a, double b) {
		base = a;
		height = b;
		name = "Triangle";
	}
	
	
	public void ComputeArea() {
		area = base*height/2;
	}
}
