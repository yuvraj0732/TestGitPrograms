//Take 10 integer inputs from user and store them in an array. Now, 
//copy all the elements in an another array but in reverse order.

package arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array leng");

		int n = sc.nextInt();

		int marks[] = new int[n];

		int reverse[] = new int[n];

		for (int i = 0; i < marks.length; i++) {

			System.out.println("Enter array values");

			marks[i] = sc.nextInt();
		}

		for (int i = marks.length - 1; i >= 0; i--) {

		
		System.out.print(+marks[i]  +" ");

	}}

}
