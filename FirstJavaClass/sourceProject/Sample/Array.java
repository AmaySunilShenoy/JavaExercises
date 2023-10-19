package Sample;

import java.util.*;

public class Array {
	public void exampleArray() {
		Scanner sc = new Scanner(System.in);
		
		float[] arr = new float[10];
		
		arr[1] = 10.2131231f;
		arr[2] = 14.123f;
		arr[3] = 25.3123f;
		arr[4] = 112.132f;
		arr[5] = 2131.23f;
		arr[6] = 31.12f;
		arr[7] = 123.123f;
		arr[8] = 132.123f;
		
		System.out.println("Assign Method:");
		for (int i = 0; i < 5;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Adjustable Size:");
		int[] arr1= { 1,2,3,4,5};
		for (int i = 0; i<4; i++) {
			System.out.println(arr1);
		}
		
		System.out.println("User Input:");
		
		System.out.print("Enter the size:");
		int size = sc.nextInt();
		int[] arrayUser = new int[size]; 

		System.out.println("Enter the values to put in the array:");
		for (int i = 0; i < size; i++) 
		{
			arrayUser[i] = sc.nextInt();
		}
		System.out.println("The values are:");
		
		for (int i = 0; i < size; i++) {
			System.out.println(arrayUser[i]);
		}
		
	}
	
	public static void main(String[] args) {
	    Array test = new Array();
	    test.exampleArray(); 
	}
}
