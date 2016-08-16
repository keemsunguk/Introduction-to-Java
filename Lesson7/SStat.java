package Lesson7;

public class SStat {
	private double [] data;
	private double sum;
	private double mean;
	private double stdev;
	private int size;
	private double max = -Double.MAX_VALUE;
	private double min = Double.MAX_VALUE;
	
	SStat() {
		data = null;
		sum = 0;
		mean = 0;
		stdev = 0;
		size = 0;
	}
	
	SStat(double [] d) {
		data = d;
		sum = 0;
		mean = 0;
		stdev = 0;
		size = d.length;
	}
	
	public void ComputeSum() {
		for(int i = 0; i < size; i++) {
			sum += data[i];
		}
	}

	public double GetSum() {
		return sum;
	}

	public double GetMean() {
		mean = sum/size;		
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
	
	public void ComputeMax() {
		for(int i = 0; i < size; i++) {
			if( data[i] > max) {
				max = data[i];
			}
		}
	}
	
	public double GetMax() {
		return max;
	}

	public void ComputeMin() {
		for(int i = 0; i < size; i++) {
			if( data[i] < min) {
				min = data[i];
			}
		}
	}
	
	public double GetMin() {
		return min;
	}

	public void Sort() {
		
	}
	
	
}
