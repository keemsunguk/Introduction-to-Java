package Lesson2;

import java.util.Scanner;

public class Calculator {

	
	public static void main(String[] args) {
		double x;
		double y;

		Scanner num = new Scanner(System.in);
		
		System.out.print("Please enter first number:");
		 x = num.nextDouble();

		System.out.print("Please enter Second number:");
		y = num.nextDouble();
		
		double sum = x + y;
		double dif = x - y;
		double mul = x*y;
		double div = 0;
		System.out.println("[Basic Operations]");
		System.out.println(x+" + "+y+" = "+ sum);
		System.out.println(x+" - "+y+" = "+ dif);
		System.out.println(x+" x "+y+" = "+ mul);
		
		if(y == 0) {
			System.out.println(x+" / "+y+" = "+ "oo");
			System.out.println("Divsor cannot be zero");
		} else {
			div = x/y;
			System.out.println(x+" / "+y+" = "+ div);			
		}
	}
}
