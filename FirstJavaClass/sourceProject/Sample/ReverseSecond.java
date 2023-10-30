package Sample;

import java.util.Scanner;

public class ReverseSecond {
	
	private String sentence;

	public void displayReverseWord() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentence:");
		sentence = sc.nextLine();
		String splitby = " "; 
		String[] words = sentence.split(splitby);
		String word1 = words[0];
		String word2 = words[1];
		
		for(int i = word2.length()-1; i>=0; i--) {
			System.out.print(word2.charAt(i));
		}
		System.out.print(" "+word1);
		sc.close();
	}
}
