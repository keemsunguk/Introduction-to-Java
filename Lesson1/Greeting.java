package Lesson1;

import java.util.Scanner;

/*  Recive user's name and greet */
public class Greeting {

	public static void main(String[] args) {
		System.out.print("What's your name? ");
		Scanner inp = new Scanner(System.in);
		String yourName = inp.nextLine();
		System.out.println("Hello, "+yourName+"!");

	}

}
