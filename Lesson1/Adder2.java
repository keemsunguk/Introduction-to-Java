package Lesson1;

import java.util.Scanner;

public class Adder2 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.print("Enter 1st number:");
		int i = num.nextInt();
		System.out.print("Enter 2nd number:");
		int j = num.nextInt();
		int k = i + j;
		System.out.println(i+" + "+j+" = "+k);

	}

}
