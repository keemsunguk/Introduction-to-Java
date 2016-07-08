package Lesson2;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter a integer:");
		int i = inp.nextInt();
		System.out.println("You entered "+i);

		System.out.print("Enter a double:");
		double f = inp.nextDouble();
		System.out.println("You entered "+f);

		System.out.print("Enter a string:");
		String s = inp.next();
		System.out.println("You entered "+s);

		System.out.print("Enter another string:");
		String s2 = inp.nextLine();
		System.out.println("You entered "+s2	);
	}

}
