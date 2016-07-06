package Lesson1;

public class StringEx {

	public static void main(String[] args) {
		Integer bigi = 120;
		Integer bigj = 340;
		System.out.println(bigi+bigj);
		
		String a = bigi.toString();
		String b = Integer.toString(340);
		Integer c = Integer.valueOf(a);
		Integer d = Integer.valueOf(b);
		System.out.println(a+b);
		System.out.println(c+d);
	}

}
