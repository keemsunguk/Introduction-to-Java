package Lesson3;

import java.util.Scanner;

public class AdvCalculator {

	public static void main(String[] args) {

		boolean flag = true;
		Scanner inp = new Scanner(System.in);
		
		int choice = 0;
		while (flag) {
			System.out.println("======================");
			System.out.println(" Calculator Menu");
			System.out.println("----------------------");
			System.out.println(" 1. Addition ");
			System.out.println(" 2. Subtrction");
			System.out.println(" 3. Multiplication");
			System.out.println(" 4. Division");
			System.out.println(" 5. Power");
			System.out.println(" 6. Remainder (Modulus)");
			System.out.println(" 7. Exit");
			System.out.println("======================");
			System.out.print("> Please enter your choice: ");
			
			choice = inp.nextInt();
			
			double x=0;
			double y=0;
			double result;
			
			if ( choice > 0 && choice < 7){
				System.out.print("Please enter first number:");
				 x = inp.nextDouble();
	
				System.out.print("Please enter Second number:");
				y = inp.nextDouble();
			}
			
			switch(choice) {
			case 1:
				result = x + y;
				System.out.println(x+" + "+y+" = "+ result);
				break;
			case 2:
				result = x - y;
				System.out.println(x+" - "+y+" = "+ result);
				break;
			case 3:
				result = x*y;
				System.out.println(x+" x "+y+" = "+ result);
				break;
			case 4:
				if(y == 0) {
					System.out.println(x+" / "+y+" = "+ "oo");
					System.out.println("Divsor cannot be zero");
				} else {
					result = x/y;
					System.out.println(x+" / "+y+" = "+ result);			
				}
				break;
			case 5:
				result = Math.pow(x, y);
				System.out.println(x+"^"+y+" = "+ result);
				break;
			case 6:
				result = x % y;
				System.out.println(x+" % "+y+" = "+ result);
				break;
			case 7:
				flag = false;
				System.out.println("Bye");
				break;
			default:
				System.out.println("Please enter integer 1~7 only");
				break;
			}
			System.out.println("\n");
		}
		
		inp.close();
	}

}
