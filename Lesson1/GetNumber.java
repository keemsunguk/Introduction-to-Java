package Lesson1;

import java.util.Scanner;

public class GetNumber {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.print("Enter number:");
		int x = num.nextInt();
		System.out.println("You entered "+x);
		
		System.out.print("Enter floating point number:");
		double f = num.nextDouble();
		System.out.print("Enter a string:");
		String s = num.next();
		
		System.out.println(f+s);

	}

}
