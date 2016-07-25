package Lesson6;

public class RunShape {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		System.out.println(t1.GetArea());
		
		Triangle t2 = new Triangle(4, 6);
		t2.ComputeArea();
		System.out.println(t2.name+" area is " +t2.GetArea());
		
		Circle c1;
		Circle c2;
		
		c1 = new Circle();
		c2 = new Circle(3);
		c2.ComputeArea();
		System.out.println(c1.GetArea());
//		System.out.println(c2.name+" area is " +c2.GetArea());
		System.out.format("%s area is %5.2f\n", c2.name, c2.GetArea());
			
		//set c1 radius to 5 and compute the area to print on the screen
		c1.SetRadius(5);
		c1.name = "1st circle";
		c1.ComputeArea();
		c1.ComputeCircumf();
		System.out.format("%s area is %10.2f\n", c1.name, c1.GetArea());
		System.out.format("%s circumf is %5.2f\n", c1.name, c1.GetCircumf());

		Rectangle r1 = new Rectangle();
		r1.SetWidth(6);
		r1.SetLength(8.5);
		r1.ComputeArea();
		System.out.println("R1 area is "+r1.GetArea());
		
		Rectangle r2 = new Rectangle(4, 6);
		r2.ComputeArea();
		System.out.println(r2.name+" area is " +r2.GetArea());

		
	}

}
