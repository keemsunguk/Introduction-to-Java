package Lesson4;

public class ArrayEx {

	public static void main(String[] args) {
		final int SIZE = 10;
		int a[] = new int [SIZE];
		
		int sum2 = 0;
		for(int i = 0; i < SIZE; i++) {
			a[i] = i*10;
			sum2 += a[i]; // sum = sum + a[i];
		}
		
		System.out.println(sum2);
		//Do something
		
		for(int i = 0; i < SIZE; i++)  {
			System.out.println(a[i]);
		}
		
		System.out.println("Size:"+a.length);
		
		double data[] = new double [SIZE];
		for(int i = 0; i < SIZE; i++) {
			data[i] = Math.random()*100;
		}
		
		//Do something
		
		for(int i = 0; i < SIZE; i++)  {
			//System.out.println(data[i]);
			System.out.format("%5.2f\n",data[i]);
		}
		
		
		
		
		
		
		double sum = GetSum(data);
		double mean = GetMean(data, sum);
		double stdev = GetStdev(data, mean);
		
//		System.out.println("The sum is: "+sum);
//		System.out.println("The mean is: "+mean);
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
