package Lesson6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BasicStatFile {

	public static void main(String[] args) {
		String fname = "test.txt";
		File infile = new File(fname);
		double data[] = new double[23];
		try {
			Scanner inp = new Scanner(infile);
			ReadFile(inp, data);
			//Add all numbers in data and print
			double sum = GetSum(data);
			double mean = GetMean(data, sum);
			double stdev = GetStdev(data, mean);
			
			System.out.format("The sum is: %7.2f\n", sum);
			System.out.format("The mean is: %7.2f\n",mean);
			System.out.println("STDEV:"+stdev+" (This is what happen when you dont format the output");	

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void ReadFile(Scanner inp, double [] a) {
		for(int i = 0; i < 23; i++) {
			a[i] = inp.nextDouble();
			System.out.println(a[i]);
		}
	}

	public static double GetSum(double[] data) {
		double sum = 0;
		for(int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}

	public static double GetMean(double[] data, double sum) {
		double mean = sum/data.length;
				
		return mean;
	}

	public static double GetStdev(double[] data, double mean) {
		double diff_sum = 0;
		int dataSize = data.length;
		
		for(int i = 0; i < dataSize; i++) {
			diff_sum += (data[i]-mean)*(data[i]-mean);
		}
		
		double stdev = Math.sqrt(diff_sum/(dataSize-1));
		
		return stdev;
	}

}
