package Sample;

import java.util.Scanner;

public class CalculateSum {
	private int a;
	private int b;
	
	Scanner sc = new Scanner(System.in);
	
	public void sum() {
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.print(a+b);
	}
	
}
