package dowhileloop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number Below to Verify");
		
		int n = sc.nextInt();
		
		int temp = n;
		
		boolean b = false;
		
		String reverse = "";
		
		String s1= String.valueOf(n);
		
		char[] s2 = s1.toCharArray();
		
		for (int i= 0; i<s2.length;i++) {
			
			reverse = s2[i] + reverse;
			
			
			
		}
		
		 b = s1.equals(reverse) ? true : false;
		
		 System.out.println("The number is palindrome "  +b);
		
		
			
		}
		
		
	}


