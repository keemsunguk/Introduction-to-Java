package Lesson6;

public class Hw6 {

	public static void main(String[] args) {
		double data[] = new double[20];
		double d = 0;
		for(int i = 0; i < 20; i++) {
			d = Math.random()*100;
			data[i] = d;
		//	System.out.println(d);			
		}
		
		//Add all numbers in data and print
		double sum = GetSum(data);
		double mean = GetMean(data, sum);
		double stdev = GetStdev(data, mean);
		
		System.out.format("The sum is: %7.2f\n", sum);
		System.out.format("The mean is: %7.2f\n",mean);
		System.out.println("STDEV:"+stdev+" (This is what happen when you dont format the output");	
		
		
	}
	
	public static double GetSum(double[] data) {
		double sum = 0;
		for(int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}

	/*
	 * Divide sum by the number data and store it in mean
	 */
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
