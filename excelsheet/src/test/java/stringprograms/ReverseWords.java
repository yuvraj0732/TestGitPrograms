//Reverse Words

package stringprograms;

//Reverse Words in Java

public class ReverseWords {

	public static void main(String[] args) {

		String str = "My Name is Khan";

		String[] str1 = str.split(" ");

		String reverse = "";

		for (int i = 0; i < str1.length; i++) {

			reverse = str1[i] + " " + reverse;
		}

		System.out.println(reverse);
	}
}

//for(int i=str1.length-1;i>=0;i--) {
//
//reverse= reverse +" "+ str1[i];