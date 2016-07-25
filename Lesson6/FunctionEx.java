package Lesson6;

public class FunctionEx {

	public static void main(String[] args) {
		
		double y = 0;
		
		//Create a function for y = 3x+2
		y = MyFunction(2);
		System.out.println(y);
		
		int j = 0;
		j = MyIntFunction(5);
		System.out.println(j);
		
	}
	
	public static double MyFunction(double x) {
		double result = 3*x + 2;
		
		//return 3*x+2;
		return result;
	}
	
	public static int MyIntFunction(int x) {
		return 3*x+2;
	}

}
