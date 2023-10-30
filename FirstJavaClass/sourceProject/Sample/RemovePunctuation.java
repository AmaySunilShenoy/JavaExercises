package Sample;

import java.util.Scanner;

public class RemovePunctuation {

	private String sentence;
	public void noPunc() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your sentence:");
		sentence = sc.nextLine();
		
		sentence = sentence.replaceAll(" ", "");
		
		sentence = sentence.replaceAll("[,.;/]", "\n");
		
		System.out.println(sentence);
		
		sc.close();
	}
}
