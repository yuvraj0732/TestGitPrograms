package arrays;

import java.util.Scanner;

public class CopyArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");

		int n = sc.nextInt();

		int matrix[] = new int[n];

		for (int i = 0; i < matrix.length; i++) {

			System.out.println("Enter the values");

			matrix[i] = sc.nextInt();
			
			int b[] = new int[matrix.length];
             b[i]=matrix[i];
             
             
	}

}
}