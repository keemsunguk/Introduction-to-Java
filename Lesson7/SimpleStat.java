package Lesson7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleStat {

	public static void main(String[] args) {
		
		String fname = "test.txt";
		File infile = new File(fname);
		double data [] = new double [23];
		
		try {
			Scanner inp = new Scanner(infile);
			
			for(int i = 0; i < 23; i++) {
				data[i] = inp.nextDouble();
				System.out.println(data[i]);
			}
			
			double sum = GetSum(data);
			double mean = GetMean(data, sum);
			double stdev = GetStdev(data, mean);
			
			System.out.println("The total is "+sum);
			System.out.println("The mean is "+mean);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print(e);
			//e.printStackTrace();
		}
		

	}

	private static double GetStdev(double[] data, double mean) {
		double stdev=0;
		
		
		
		return stdev;
	}

	private static double GetMean(double[] data, double sum) {
		double mean;
		int size = data.length;
		
		mean = sum/size;
				
		return mean;
	}

	private static double GetSum(double[] data) {
		
		int size = data.length;
		
		double sum = data[0]+data[1]+data[2]+data[3]+data[4]+data[5]+data[6]+data[7]+data[8]+data[9]+
				data[10]+data[11]+data[12]+data[13]+data[14]+data[15]+data[16]+data[17]+data[18]+data[19]+
				data[20]+data[21]+data[22];
		
		return sum;
	}

}
