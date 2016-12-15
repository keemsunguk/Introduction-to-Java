package Lesson4;

import java.util.Scanner;

public class FindTotalDigits {

	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		Scanner num = new Scanner(System.in);
		int x = num.nextInt();
		int y = x;
		int k = 0;
		
		while ( x > 0) {
			x = x/10;
			k++;
		}

		System.out.println(y + " has "+k+" digits");
		num.close();
	}

}
