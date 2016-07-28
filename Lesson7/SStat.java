package Lesson7;

public class SStat {
	private double [] data;
	private double sum;
	private double mean;
	private double stdev;
	
	SStat() {
		data = null;
		sum = 0;
		mean = 0;
		stdev = 0;
	}
	
	SStat(double [] d) {
		data = d;
		sum = 0;
		mean = 0;
		stdev = 0;
	}
	
	public void ComputeSum() {
		for(int i = 0; i < data.length; i++) {
			sum += data[i];
		}
	}

	public double GetSum() {
		return sum;
	}

	public double GetMean() {
		mean = sum/data.length;		
		return mean;
	}

	public void ComputeStdev() {
		double diff_sum = 0;
		int dataSize = data.length;
		
		for(int i = 0; i < dataSize; i++) {
			diff_sum += (data[i]-mean)*(data[i]-mean);
		}
		
		stdev = Math.sqrt(diff_sum/(dataSize-1));		
	}	
	
	public double GetStdev() {
		return stdev;
	}
}
