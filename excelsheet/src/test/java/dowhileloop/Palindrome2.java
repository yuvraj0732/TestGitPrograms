package dowhileloop;

import java.util.Scanner;

public class Palindrome2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number Below");
		
		
		int reverse = 0;
		int sum =0;
		boolean b= false;
		
		int num = sc.nextInt();
		
		int com = num;
		
		while (num>0) {
			
			reverse = num %10;
			
			sum = reverse + sum*10;
			
			num = num/10;
			
			
			
		}
		
          System.out.println("Revese number is " +sum);
           b = (com==sum) ? true : false;
           
           System.out.println("The number is palindrome " +b);
          
	}

}
