package Lesson2;

import java.util.Scanner;

public class ReturnKthDigit {

	public static void main(String[] args) {
		final int BASE = 10;
		double x;
		int k;
		
		System.out.println("==============================================");
		System.out.println(" Weekly Project 1.");
		System.out.println(" Input:  x - a number, k- integer");
		System.out.println(" This program returns k-th digit number from x");
		System.out.println("==============================================");
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter x:");
		x = inp.nextDouble();
		System.out.print("Enter k:");
		k = inp.nextInt();
		
		if ( x < 0 ) {
			x = -x;
		}
		int div = (int) Math.pow(BASE, k-1);
		System.out.println(div);
		if ( (div > 0) && (div < x)) {
			int kthDigit = ((int)x/div) % 10;
			//System.out.println(kthDigit);
		} else if (div > x) {
			System.out.println(k+" is greater than the maximum digit number");			
		} else {
			System.out.println(k+" is not a valid digit number");
		}
	}

}
