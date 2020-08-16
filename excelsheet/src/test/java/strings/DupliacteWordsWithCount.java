package strings;

public class DupliacteWordsWithCount {

	public static void main(String[] args) {

		String str = "Hello Java Hello Java Hello";

		str = str.toLowerCase();

		System.out.println(str);

		String[] array = str.split(" ");

		int count = 1;

		for (int i = 0; i < array.length - 1; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i].equals(array[j])) {

					array[j] = "0";

					count = count + 1;

				}
			}

			if (array[i] != "0") {

				System.out.println("The repetative words arrays is " + array[i] + " " + count);
			}

		}
	}

}
