package arrays;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number below");
		
		int n = sc.nextInt();
		
		int marks[] = new int [n];
		
		for (int i=0;i<n;i++) {
			
			marks[i]= sc.nextInt();
		}
		

		int avg= 0;
		
		for(int i =0;i<n;i++) {
			
			avg = avg + marks[i];
		}
		 avg /=n;
		 
		 System.out.println("Average marks are " +avg);
	}

}
