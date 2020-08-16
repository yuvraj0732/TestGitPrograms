//find duplicate characters in a string

package strings;

import java.util.Scanner;

public class DuplicatesString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		int leng = A.length() + B.length();
		System.out.println(leng);

		int result = A.compareTo(B);

		if (result < 0 || result == 0) {

			System.out.println("No");
		}

		else if (result > 0) {

			System.out.println("Yes");
		}

		String output = A.substring(0, 1).toUpperCase() + A.substring(1);
		String output2 = B.substring(0, 1).toUpperCase() + B.substring(1);

		System.out.println(output + " " + output2);
	}

}
