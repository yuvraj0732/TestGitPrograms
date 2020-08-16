package arrays;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();

		String reverse ="";

		for (int i = 0; i < A.length(); i++) 
		{
			reverse = A.charAt(i) + reverse;
			

		}
		System.out.println("String after reverse "+reverse);
		System.out.println("sTRING BEFORE "+A);


		if(A.equals(reverse))
		{
			
			System.out.println("Its Palindrome");
		
		}
		else
		{
			System.out.println("Non-Palindrome");
		}
	}}


