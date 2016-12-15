package Lesson6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanFileEx {

	public static void main(String[] args) {
		String fname = "test.txt";
		
		File infile = new File(fname);
		int a[] = new int[23];
		
		try {
			Scanner inf = new Scanner(infile);
			for(int i = 0; i < 23; i++) {
				a[i] = inf.nextInt();
				System.out.println(a[i]);
			}
			inf.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
