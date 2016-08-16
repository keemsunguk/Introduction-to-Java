package Lesson6;

public class RunShape1 {

	public static void main(String[] args) {
		Shape1 s1 = new Shape1("Alex");
		System.out.println(s1.name);
		
		Triangle1 t1 = new Triangle1("Junoh", 4, 2);
		t1.computeArea();
		System.out.println(t1.name+" area is "+t1.area);
		System.out.println("Height: "+t1.getHeight());
		
	}

}
