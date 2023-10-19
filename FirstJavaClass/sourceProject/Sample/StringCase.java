package Sample;

import java.util.Scanner;

public class StringCase {

	Scanner sc = new Scanner(System.in);
	String sentence;
	
	public void Upper() {
		sentence = sc.nextLine();
		System.out.println(sentence.toUpperCase());
	}
	
	public void Lower() {
		sentence = sc.nextLine();
		System.out.println(sentence.toLowerCase());
	}
}
