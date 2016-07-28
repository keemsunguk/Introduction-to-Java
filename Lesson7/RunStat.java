package Lesson7;

public class RunStat {

	public static void main(String[] args) {
		ReadFile h = new ReadFile("test.txt");
		
		h.ReadInput();
		
		for(int i = 0; i < 23; i++) {
			System.out.println(h.data[i]);
		}
		
		SStat s = new SStat(h.data);
		s.ComputeSum();
		double sum = s.GetSum();
		double mean = s.GetMean();
		s.ComputeStdev();
		double stdev = s.GetStdev();
		
		System.out.format("The sum is: %7.2f\n", sum);
		System.out.format("The mean is: %7.2f\n",mean);
		System.out.println("STDEV:"+stdev+" (This is what happen when you dont format the output");	

		h.CloseFile();

	}

}
