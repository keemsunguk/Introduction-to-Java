package Lesson7;

public class SimpleStats {
	private double sum;
	private double mean;
	private double stdev;
	private int size;
	private double [] data;
	
	SimpleStats() {
		sum = 0;
		mean = 0;
		stdev = 0;
		size = 0;
		data = null;
	}
	
	SimpleStats(double [] d) {
		data = d;
		sum = 0;
		mean = 0;
		stdev = 0;
		size = data.length;
	}
	
	public void ComputeSum() {
		sum = 0;
		for(int i = 0; i < data.length; i++) {
			sum += data[i];
		}
	}
	
	public double GetSum() {
		return sum;
	}
	
	public double GetMean() {
		return (mean = sum/size);
	}
	
	public void ComputeStdev() {
		double diff_sum = 0;
		for(int i = 0; i < size; i++) {
			diff_sum += (data[i]-mean)*(data[i]-mean);
		}
		
		stdev = Math.sqrt(diff_sum/(size-1));
	}
	
	public double GetStdev() {
		return stdev;
	}
	
	
}
