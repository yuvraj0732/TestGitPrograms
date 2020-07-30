// Java Program to reverse words without using String inbuilt function.

package strings;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter words");
		
		String words = sc.nextLine();
		
		String reverse = "";
		
		String[] word= words.split(" ");
		
		for (int i =0; i<word.length;i++) {
			
			reverse = word[i] + " " +reverse;
			
		}
		System.out.println("Reverse words is "  + reverse);

	}

}
