package Sample;

import java.util.Scanner;

public class MaxNumber {
	private int a;
	private int b;
	
	public void displayMax() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number:");
		a = sc.nextInt();
		System.out.println("Enter the second number:");
		b = sc.nextInt();
		
		System.out.printf("The larger number is: %d",a>b ? a : b);
		
		sc.close();
	}
}
