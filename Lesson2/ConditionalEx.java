package Lesson2;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		final int baseNo = 10;
		int i = 1;
		
		if ( i == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		if( i == 4) {
			System.out.println("Yes");
		}
		System.out.println("No");
			
		
		double f1;
		double d1;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter a numerator:");
		f1 = inp.nextDouble();
		
		System.out.print("Enter a divisor:");
		d1 = inp.nextDouble();
		if(d1 == 0) {
			System.out.print("The Divisor cannot be 0");			
		} else {	
			System.out.println(f1/d1);
	
		}
		
		
		//Using power 
		int d2 = (int)Math.pow(baseNo, 3);
		System.out.println(d2);
		
		boolean a = true;
		boolean b = false;
		boolean c = (a | b);
		
		System.out.println(c);
		
		
		
	}
}
