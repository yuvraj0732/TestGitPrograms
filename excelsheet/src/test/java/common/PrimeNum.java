package common;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
      boolean b = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number below");
		
		int number = sc.nextInt();
		
		for (int i =2;i*i<=number;i++) {
			
			 b = number%i==0 ? false : true;
			 break;	 
		}

	   if(number<2) b = false;
		
	//	b = (number<2) ? false : true;
		
		System.out.println("The number is Prime "  +b);

	}

}
