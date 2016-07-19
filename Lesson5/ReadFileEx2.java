package Lesson5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileEx2 {

	
	public static void main(String[] args) {
		String  fname = "test.txt";
		
		File infile = new File(fname);
		int a[] = new int [23];
		
		try {
			MyReadFile(infile, a);
			PrintMyNumbers(a);
		} catch (Exception e) {
			System.out.println("File read problem:");
			System.out.println(e);
		}
	}
	
	public static void MyReadFile(File inf, int [] a) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(inf));
		
		int i = 0;
		String num = "";
		while ((num = reader.readLine())  != null) {
			a[i] = Integer.valueOf(num);
			i++;
//			System.out.println(a[i]);
		}
		reader.close();
	}
	
	public static void PrintMyNumbers(int [] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		//System.out.println(a.length);
	}
	
	

}
