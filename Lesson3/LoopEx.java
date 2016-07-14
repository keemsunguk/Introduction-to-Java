package Lesson3;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		
		int i;
		for(i = 0; i < 10; i+=3) {
			System.out.println(i);
		}
		
		Scanner inp = new Scanner(System.in);
		boolean flag = true;
		
//		System.out.print("When to stop?:");
//		int k = inp.nextInt();
//		while ( i < k ) {
//			System.out.println(i++);
//		}


		flag = true;
		
		while(flag) {
			System.out.print("Enter the 1st term:");
			double a1 = inp.nextDouble();
			
			System.out.print("Enter the common difference:");
			double d = inp.nextDouble();
			
			System.out.print("Enter the number of terms");
			int n = inp.nextInt();
	
			double an = a1;
			double sum = a1;
			for(i = 1; i < n; i++) {
				System.out.println("a("+i+")="+an);
				an = an+d;
				sum += an;
			}
			System.out.println("The n-th sequence is "+an);
			System.out.println("The series is "+sum);
			
			System.out.print("Do you want to continue (y/n)?");
			String ans = inp.next();
	//		System.out.println(ans);
			if (ans.equals("n")) {  //ans == "n"  wrong
				flag = false;
				System.out.println("Bye");
			}
			
		}
	}

}
