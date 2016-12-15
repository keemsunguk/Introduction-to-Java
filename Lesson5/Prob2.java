package Lesson5;

import java.util.Scanner;

//A:  Receive an integer from a scanner and print even/odd
//B:  find sum of all even numbers from 2~10000
//C:  Print the remainder of result of B/27 
public class Prob2 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = inp.nextInt();

		System.out.println("Prob 2-A:");
		
		if (n%2 == 0) {
			System.out.println(n+" is an even number");
		} else {
			System.out.println(n+" is an odd number");
		}

		int sum = 0;
		for(int i = 2; i <= 10000; i+=2) {
			sum = sum + i;
		}
		System.out.println("Prob B: Sum of all even numbers from 1 to 10000 is "+sum);
		int rem = sum % 27;
		System.out.println("Prob C: The remainder of div by 27 is "+rem);
		
		inp.close();
	}

}
