package Lesson7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	private String fname;
	private File infile;
	private Scanner inp;
	
	double [] data;  //data[] 
	
	ReadFile() {
		fname = "";
		infile = null;
		inp = null;
		data = null;
	}

	ReadFile(String f) {
		fname = f;
		infile = new File(fname);
		try {
			inp = new Scanner(infile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
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
	
	public void CloseFile() {
		inp.close();
	}
	
}
