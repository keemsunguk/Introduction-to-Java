package Lesson6;

public class Circle extends Shape {
	private double radius;
	private double circumference;
	
	Circle() {
		super();
		radius = 0;
		circumference = 0;
	}
	
	Circle(double a) {
		radius = a;
		ComputeCircumf();
		perimeter = circumference;
		name = "Circle";
	}
	
	public void SetRadius(double r) {
		radius = r;
	}
	
	public void ComputeCircumf() {
		circumference = 2*Math.PI*radius;
		perimeter = circumference;
	}
	
	public void ComputeArea() {
		
		area = Math.PI*radius*radius;
	}
	
	public double GetCircumf() {
		return circumference;
	}

}
