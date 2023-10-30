package Sample;

import java.util.Scanner;

public class EvenNumbers {
	
	private int num;
	
	public void displayEven() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		num = sc.nextInt();
		
		for(int i = 2; i < num; i+=2) {
				System.out.print(i+ " ");
		}
		sc.close();
	}
}
