package Sample;

import java.util.Scanner;

public class Voting {

	Scanner sc = new Scanner(System.in);
	private int age;

	public void isEligible() {

		age = sc.nextInt();

		if (age >= 18) {
			System.out.println("You are eligible");
		} else {
			System.out.println("Sorry you are not are eligible");
		}
	}
}
