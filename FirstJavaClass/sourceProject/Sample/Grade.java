package Sample;

import java.util.Scanner;

public class Grade {

	private String subject;
	private String grade;

	public void checkGrade() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the subject:");

		subject = sc.nextLine();

		System.out.println("Enter the grade:");

		grade = sc.nextLine().toUpperCase();

		switch(grade) {
		case "A":
			System.out.println("Well Done keep it up!");
			break;
		case "B":
			System.out.println("Good! You can do better!");
			break;
		case "C":
			System.out.println("Come on! You aren't putting in any effort");
			break;
		case "D":
			System.out.println("I dont know what to say");
			break;
		case "F":
			System.out.println("Just give up lmaooo!");
			break;
		default:
			System.out.println("That's not even a grade");
			break;
		}
		
		
		sc.close();
	}
}
