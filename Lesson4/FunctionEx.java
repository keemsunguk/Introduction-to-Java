package Lesson4;

public class FunctionEx {

	public static void main(String[] args) {
		double data[] = new double[10];
		
		MakeArray(data);
		PrintArray(data);
		
		int k = AddNum(2,3);
		System.out.println(k);
	}

	
	
	static void MakeArray(double [] data) {
		for(int i = 0; i < 10; i++) {
			data[i] = Math.random()*100;
		}
	}

	static void PrintArray(double [] data) {
		for(int i = 0; i < 10; i++) {
			System.out.format("%5.2f\n", data[i]);
		}		
	}
	
	static int AddNum(int i, int j) {
		return i+j;
	}
}
