package Sample;

import java.util.Scanner;

public class MixedCase {
	
	private String str;

	public void displayMixed() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your string:");
		str = sc.next();
		
		String output = "";
		for(int i = 0; i< str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				output += Character.toUpperCase(str.charAt(i));
			} else {
				output += Character.toLowerCase(str.charAt(i));
			}
		}
		System.out.println(output);
		sc.close();
	}
}
