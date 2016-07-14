/**
 * 
 */
package Lesson3;

import java.util.Scanner;
import java.lang.Math;

/**
 * @author S Keem
 * 
 * The goal is to print separate digits of included integers
 * 
 * Ex.  Input : 321
 * 	    Output: 1,2,3
 * 		At least 9 Digits
 *
 */
public class DigitSeparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
		throws java.io.IOException {
		
		int x;
		int y = 1;
		int divisor=0;
		int z=0;
		
		Scanner inp = new Scanner(System.in);	
		System.out.print("Please enter the input integer: ");
		x = inp.nextInt();
		
		////////////////////////////////////////////////////////////////////
		while (x > 10) {
			x = x - (divisor*z);
			
			if(x <= 0) {
				if(y >= 0) {
					for(y = y-1 ; y >= 0; y--) {
						divisor = (int)Math.pow(10, y);
						System.out.format("The %d digit is 0\n", divisor);
					}
				}
			} else {
				y = (int)Math.log10(x);
			
				divisor = (int)Math.pow(10, y);  
			
				z = x/divisor;
				System.out.format("The %d digit is %d\n", divisor, z);
			}
		}
		////////////////////////////////////////////////////////////////////
		inp.close();
	}

}
