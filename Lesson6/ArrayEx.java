package Lesson6;

public class ArrayEx {

	public static void main(String[] args) {
		int a[] = new int[100]; //type is int, name is a, size is 100

		//random number generator
		double d = 0;
		
		
		//Class ex
		// use for loop, generate 20 random numbers and print on screen
		// Create double array name data with size of 20 and store the random number from d
		// fix line 20 to generate numbers from 0~100 real numbers
		
		double data[] = new double[20];
		
		for(int i = 0; i < 20; i++) {
			d = Math.random()*100;
			data[i] = d;
		//	System.out.println(d);			
		}
		
		//Add all numbers in data and print
	
		double sum = 0;
		for(int i = 0; i < 20; i++) {
			sum = sum + data[i];
			// sum += data[i];
			//System.out.println(data[i]);
		}
		System.out.println("Total is "+sum);
		
	}

}
