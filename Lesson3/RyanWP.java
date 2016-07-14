package Lesson3;
import java.util.Scanner;

public class RyanWP {

	public static void main(String[] args) {

		final int B = 10;
		double x;
		int k;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter value of x:");
		x = inp.nextDouble();
		System.out.print("Enter value of k:");
		k = inp.nextInt();
		
		if (x < Integer.MAX_VALUE){
			int pow = (int) Math.pow(B, k-1);
			if ((pow > 0) && (pow < x));
				int unit = ((int)x/pow) % 10;
				String nth = "th";
				if(k==1);{ 				//I tried to put || instead
					nth = "st";}		//of repeating the code
				if(k==21);{
					nth = "st";}
				if(k==2);{
					nth = "nd";}
				if(k==22);{
					nth = "nd";}
				if(k==3);{
					nth = "rd";}
				if(k==33);{
					nth = "rd";}
					System.out.println("The "+k+nth+" digit of the number is "+pow);
				}
		inp.close();
		}
				


}
