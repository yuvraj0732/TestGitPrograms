//get the minimum number of an array using a method.

package arrays;

import java.util.Scanner;

public class MiniNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of array");

		int n = sc.nextInt();

		int marks[] = new int[n];

		for (int i = 0; i < marks.length; i++) {

			System.out.println("Enter array values");
			marks[i] = sc.nextInt();

		}
		int min = marks[0];
		for (int i = 1; i < marks.length; i++) {
			if (min > marks[i])
				min = marks[i];

			
		}
		
		System.out.println("Minimum Value is " + min);
	}
	
}
