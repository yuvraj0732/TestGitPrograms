package common;

import java.util.Scanner;

public class FibnocciNumbers {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number below");
		
		int num = sc.nextInt();
		
	//	int result =1;

		int a=0;
		 int b=1;
		 
		 System.out.print(a + " " +b);

		for(int i=1;i<=num-2;i++){

		int c = a+b;

	System.out.print(" "+c +" ");
	
    a=b;
    b=c;
		
	}
	}
}
