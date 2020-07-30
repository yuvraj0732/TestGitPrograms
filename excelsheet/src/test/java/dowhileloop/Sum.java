package dowhileloop;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sum below");
		
		int n = sc.nextInt();
		
		int temp =0;
		
		int sum = 0;
		
		while (n>0) {
			
			sum = n %10;
			
			temp += sum;

			n = n/10;
			
		}
		
		System.out.println(" sum of Number is "  +temp);
	}

}
