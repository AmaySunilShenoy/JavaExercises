package Sample;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
	private int len;
	Scanner sc = new Scanner(System.in);

	public void sortingstar() {
		System.out.println("How many numbers do you want to input?");
		len = sc.nextInt();
		int[] arr =  new int[len];
		for(int i = 0; i<len; i++) {
			System.out.printf("Enter number %d: ",i+1);
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		Arrays.sort(arr);
		for(int i = 0; i<len;i++) {
			System.out.print(arr[i] + "*");
		}
	}
	
	public void sortingline() {
		System.out.println("How many numbers do you want to input?");
		len = sc.nextInt();
		int[] arr =  new int[len];
		for(int i = 0; i<len; i++) {
			System.out.printf("Enter number %d: ",i+1);
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		Arrays.sort(arr);
		for(int i = 0; i<len;i++) {
			System.out.println(arr[i]);
		}
	}
}
