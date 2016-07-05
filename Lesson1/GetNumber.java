package Lesson1;

import java.util.Scanner;

public class GetNumber {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.print("Enter number:");
		int x = num.nextInt();
		System.out.println("You entered "+x);

	}

}
