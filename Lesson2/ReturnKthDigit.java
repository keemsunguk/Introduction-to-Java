package Lesson2;

import java.util.Scanner;

public class ReturnKthDigit {

	public static void main(String[] args) {
		final int BASE = 10;
		double x, x1;
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
		x1 = x;
		if ( x < 0 ) {
			x = -x;
		} 
		if (x < Integer.MAX_VALUE) {
			int div = (int) Math.pow(BASE, k-1);
			//System.out.println(div);
			if ( (div > 0) && (div < x)) {
				int kthDigit = ((int)x/div) % 10;
				String nth = "th";
				if( k == 1 ) nth = "st";
				else if( k == 2 ) nth = "nd";
				else if( k == 3 ) nth = "rd";
				else if( k > 20) {
					if( k%10 == 1 ) nth = "st";
					else if( k%10 == 2 ) nth = "nd";
					else if( k%10 == 3 ) nth = "rd";		
				}
				System.out.println("The "+k+nth+" digit of "+x1+" is "+kthDigit);
			} else if (div > x) {
				System.out.println(k+" is greater than the maximum digit number");			
			} else {
				System.out.println(k+" is not a valid digit number");
			}			
		} else {
			System.out.println("Input x is too big");
		}
		inp.close();
	}

}
