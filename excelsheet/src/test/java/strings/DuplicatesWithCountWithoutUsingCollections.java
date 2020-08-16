package strings;

public class DuplicatesWithCountWithoutUsingCollections {

	public static void main(String[] args) {

		String str = "java is my java hello my java";

		String[] split = str.split(" ");

		for (int i = 0; i < split.length - 1; i++) {

			int count = 1;

			for (int j = i + 1; j < split.length; j++) {

				if (split[i].equals(split[j])) {

					count = count + 1;

					split[j] = "";

				}
			}

			if (split[i] != "") {

				System.out.println(split[i] + " " + count);
			}

		}
	}
}
