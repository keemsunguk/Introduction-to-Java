package Lesson5;

import java.util.Scanner;

//a.  Print your name on the screen
//b.  Add 1~10000 using a loop and print on the screen
//c.  Receive n from the user and compute 2^n using Math.pow
public class Prob1 {

	public static void main(String[] args) {
		System.out.println("Prob A: My name is DK");
		
		int sum = 0;
		for(int i = 1; i <= 10000; i++) {
			//sum += i;
			sum = sum + i;
		}
		System.out.println("Prob B: Sum from 1 to 10000 is "+sum);
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the exponent: ");
		double n = inp.nextDouble();
		double res = Math.pow(2, n);
		System.out.println("Prob C: 2 to the power of "+(int)n+" is "+res);

		

	}

}
