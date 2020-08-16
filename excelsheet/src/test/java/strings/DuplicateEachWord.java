// WAP to reverse each word

package strings;

public class DuplicateEachWord {

	public static void main(String[] args) {

		String str = "My Name is Anthony";

		String[] array = str.split(" ");

		String reverse = "";

		for (String m : array) {

			for (int i = 0; i < m.length(); i++) {

				reverse = m.charAt(i) + reverse;

			}
			System.out.println(reverse);

			reverse = "";

		}
	}
}