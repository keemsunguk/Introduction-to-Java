package Lesson7;

import java.io.File;
import java.io.FileNotFoundException;
//import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileRead {
	
	private String fname;
	private File infile;
	private Scanner inp;

	double data[];

	FileRead() {
		fname="";
		infile = null;
	}
	
	FileRead(String f) {
		fname = f;
		infile = new File(fname);
		try {
			inp = new Scanner(infile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}	
	
	public void ReadInput() {
		int size = 23;
		data = new double [size];
		
		for(int i = 0; i < size; i++) {
			data[i] = inp.nextDouble();
		}
	}
}
