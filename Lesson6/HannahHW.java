package Lesson6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HannahHW {

	static int a[] = new int[23];
	static final int SIZE = 23;
	static int x[] = new int [SIZE];
	static int i;
	
	public static void main(String[] args) {
		String fname = "test.txt";
		File infile = new File(fname);
		double presum = 0; 
		
		System.out.println("Size:"+x.length);

		try {
			BufferedReader reader = new BufferedReader(new FileReader(infile));
			
			String num="";
			for(i=0; i<23; i++){
				try {
					num = reader.readLine();
					a[i]= Integer.valueOf(num);
				} 
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					try {
						reader.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				//System.out.println(a[i]);
				presum=a[i];
			}
		} catch (FileNotFoundException e) {
			// e returns the "program not found" instead of crashing the program
			// Auto-generated catch block
			e.printStackTrace();
		}
		double sum = GetSum(a, presum);
		double mean = GetMean(a, sum);
		double stdev = GetStdev(a, mean);
		
		System.out.format("\n\nThe sum is: %7.2f\n", sum);
		System.out.format("The mean is: %7.2f\n",mean);
		System.out.format("The standard deviation is: %7.2f\n", stdev);	
		
	}
	
	public static double GetSum(int[] a, double presum) {
			
		double sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
			//sum = sum + a[i];
		}
		return sum;
	}
		
		/*
		 * Divide sum by the number data and store it in mean
		 */
	public static double GetMean(int [] a, double sum) {
		double mean = sum/a.length;
					
		return mean;
	}
		
	public static double GetStdev(int[] a, double mean) {
		double diff_sum = 0;
			
		for(int i = 0; i < SIZE; i++) {
			diff_sum += (a[i]-mean)*(a[i]-mean);
		}
			
		double stdev = Math.sqrt(diff_sum/(SIZE-1));
			
		return stdev;
	}

}
