package Lesson2;

public class StringEx {

	public static void main(String[] args) {
		Integer bigi = 120;   //int i = 120;
		Integer bigj = 340;
		
		System.out.println(bigi+bigj);
		
		String a = bigi.toString();
		String b = Integer.toString(340);
		Integer c = Integer.valueOf(a);
		Integer d = Integer.valueOf(b);
		System.out.println(a+b);
		System.out.println(c+d);

		String sr = "abcdef";
		String sw = new String("Will is here");
		System.out.println(sr.length());
		System.out.println(sw.length());
	}

}
