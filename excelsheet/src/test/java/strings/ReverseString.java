// Java Program to reverse a string without using String inbuilt function.

package strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the word");
		
		String line = sc.nextLine();
		
		char[] ch = line.toCharArray();
		
		String reverse ="";
		
		for (int i=0;i<ch.length;i++) {
			
			reverse = ch[i] + reverse;
			
		}
		
		System.out.println("Reverse of the word is "  +reverse);
		
		
		

	}

}
