package Lesson3;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int i = Integer.MAX_VALUE;
		
		System.out.println("Enter an integer: ");

		i = inp.nextInt();
		
		if (i == 1) {
			System.out.println("A");
		} else if (i == 2) {
			System.out.println("B");
		} else if (i == 3) {
			System.out.println("C");
		} else if (i == 4) {
			System.out.println("D");
		} else {
			System.out.println("I give up");
		}
		
		String c = "A";
		switch(i) {
			case 1: 
				c = "A";
				break;
			
			case 2: 
				c = "B";
				break;
		
			case 3: 
				c = "C";
				break;
			
			case 4: 
				c = "D";
				break;
				
			default:
				c= "I give up";
		}
		System.out.print(c);
	}

}
