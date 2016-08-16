package Lesson6;

public class RunShape {

	public static void main(String[] args) {
				
		Triangle isaac = new Triangle();
		isaac.height = 2;
		isaac.base = 4;
		isaac.name = "Isaac The Triangle";
		isaac.ComputeArea();
		System.out.println("Name: "+isaac.name);
		System.out.println("The area after ComputeArea is "+isaac.area);
		
		Triangle alex = new Triangle(10,5,"Alex The Triangle");
		alex.ComputeArea();
		System.out.println("Name: "+alex.name);
		alex.ComputeArea();
		System.out.println("The area after ComputeArea is "+alex.area);
		
		Circle c1 = new Circle();
		//c1.radius=5;   This is not legal because radius is a private menter of a Circle
		c1.SetRadius(5);
		c1.ComputeArea();		
		System.out.println("C1 area: "+c1.area);
		
		Circle c2 = new Circle(10);
		c2.ComputeArea();
		c2.ComputeCircumf();
		System.out.println("C2 area: "+c2.area);
		System.out.println("C2 circumferenceooo: "+c2.GetCircumf());
		
		Shape s1 = new Triangle(3,5,"Shape");
//		s1.ComputeArea();
		((Triangle)s1).ComputeArea();
		System.out.println("S1 area: "+s1.area);
	
		String dummy = s1.toString();
		System.out.println(dummy);
		
//		Triangle t2 = new Circle();
		
		
		
		
		
		
		
		
		
		
		
/*		Triangle t1 = new Triangle();
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

//		Rectangle r3 = new Shape(20, 18, "Retangle");
		Shape s1 = new Rectangle(4,5);
		((Rectangle)s1).ComputeArea();
		System.out.println(s1.name+" area is " +s1.GetArea());

		s1 = null;
		s1 = new Triangle(2,4);
		((Triangle)s1).ComputeArea();
		System.out.println(s1.name+" area is " +s1.GetArea());
	*/	
	}

}
