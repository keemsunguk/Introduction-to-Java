package Lesson4;

import java.util.Scanner;

class DigitSeparator {

	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		Scanner num = new Scanner(System.in);
		int x = num.nextInt();

		int maxDigit = FindMaxDigit(x);
		
		int digit = 0;
		String nth = "th";
		
		int i;
		for(i = 0; i < maxDigit; i++) {
			digit = x % 10;
			x = x/10;
			if(i == 0) {
				nth = "st";
			} else if(i == 1) {
				nth = "nd";
			} else if (i == 2) {
				nth = "rd";
			} else {
				nth = "th";
			}
			System.out.println(i+1+nth+" digit is "+digit);
		}

	}
	
	static int FindMaxDigit(int inputNo) {
		
		int k = 0;
		int x = inputNo;
		
		while ( x > 0) {
			x = x/10;
			k++;
		}

		return k;
	}

}
