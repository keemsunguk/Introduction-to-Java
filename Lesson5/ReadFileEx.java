package Lesson5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileEx {

	public static void main(String[] args) {
		String  fname = "test.txt";
		
		File infile = new File(fname);
		int a[] = new int[23];
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(infile));
			String num="";
			for(int i = 0; i < 23; i++) {
				try {
					num = reader.readLine();
					a[i] = Integer.valueOf(num);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(a[i]);
			}
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Please check the file name");
			//e.printStackTrace();
			System.out.println(e);
		}

	}

}
