//to find factorial of a number

package common;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int result =1;
		
		int num = sc.nextInt();
		
		for (int i= 1;i<=num;i++) {
			
			result = result*i;
			
			
		}
		
		System.out.print(result);
		
		
}}