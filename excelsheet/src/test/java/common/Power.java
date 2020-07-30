package common;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
	
		int result=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number below");
		
		int num = sc.nextInt();
		
		System.out.println("Enter the Power below");
		
		int pow = sc.nextInt();
		
		for(int i=1;i<=pow;i++) {
			
			result *= num;
		
		}
		System.out.println(result);
	
	}

}
