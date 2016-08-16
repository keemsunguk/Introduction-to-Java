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
		name = "Yo Yo Triangle";
	}
	
	
	Triangle(double a, double b, String c) {
		base = a;
		height = b;
		name = "Yo Yo "+c;
	}
	
	public void ComputeArea() {
		area = base*height/2;
	}
	
	public String toString() {
		String ret= name+" "+Double.toString(area);
		return ret;
	}
}
