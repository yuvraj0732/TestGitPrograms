package arrays;

import java.util.Scanner;

public class MaxAndMinArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of value");

		int n = sc.nextInt();

		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {

			System.out.println("Enter array values");

			array[i] = sc.nextInt();

		}
		minvalue(array);
		maxvalue(array);

	}

	public static int minvalue(int[] array) {

		int min = array[0];

		for (int i = 0; i < array.length; i++) {

			if (min > array[i]) {

				min = array[i];

			}

		}
		System.out.println("Min value is " + min);

		return min;

	}

	public static int maxvalue(int[] array) {

		int max = array[0];

		for (int i = 0; i < array.length; i++) {

			if (max < array[i]) {

				max = array[i];
			}

		}
		System.out.println("Max value is " + max);

		return max;
	}

}
