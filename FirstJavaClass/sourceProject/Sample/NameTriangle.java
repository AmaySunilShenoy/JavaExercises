package Sample;

import java.util.Scanner;

public class NameTriangle {

	public String name;
	
	public void displayName() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name:");
		
		name = sc.next();
		
		for(int i = 0; i <= name.length(); i++) {
			System.out.print(" ".repeat(name.length() - i));
			for(int k = 0; k <i; k++) {
				System.out.print(name.charAt(k)+" ");
			}
			System.out.println("");
		}
		
		sc.close();
	}
}
