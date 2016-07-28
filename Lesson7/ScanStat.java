package Lesson7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanStat {

	public static void main(String[] args) {
		String fname = "test.txt";
		File infile = new File(fname);
		try {
			Scanner inp = new Scanner(infile);
			double data[] = new double [23];
			
			for(int i = 0; i < data.length; i++) {
				data[i] = inp.nextDouble();
				System.out.println(data[i]);
			}
			
			double sum = GetSum(data);
			double mean = GetMean(data.length, sum);
			double stdev = GetStdev(data, mean);

			System.out.format("The sum is: %7.2f\n", sum);
			System.out.format("The mean is: %7.2f\n",mean);
			System.out.println("STDEV:"+stdev+" (This is what happen when you dont format the output");	


		} catch (FileNotFoundException e) {
			System.out.println(e);
			//e.printStackTrace();
		}
		

	}

	private static double GetSum(double[] data) {
		double sum = 0;
		for(int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}

	private static double GetMean(int length, double sum) {
		double mean = sum/length;		
		return mean;
	}

	private static double GetStdev(double[] data, double mean) {
		double diff_sum = 0;
		int dataSize = data.length;
		
		for(int i = 0; i < dataSize; i++) {
			diff_sum += (data[i]-mean)*(data[i]-mean);
		}
		
		double stdev = Math.sqrt(diff_sum/(dataSize-1));
		
		return stdev;
	}

}
