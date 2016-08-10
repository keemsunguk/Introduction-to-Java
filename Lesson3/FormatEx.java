package Lesson3;

public class FormatEx {

	public static void main(String[] args) {
		double z = (double)7/Math.PI;
		
		System.out.println(z);
		
		System.out.format("The answer is %f\n", z);
		System.out.format("The answer is %5.2f\n", z);

		//%d  integer
		//%c is for character
		//%s is for strings
		//%x is for hex
		
		int k = 24;
		System.out.format("The answer is %x\n", k);
		System.out.format("The answer is %B", k);

	}

}
