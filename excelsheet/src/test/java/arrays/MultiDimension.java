package arrays;

import java.util.Scanner;

public class MultiDimension {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number below");

		int rows = sc.nextInt();
		int columns = sc.nextInt();
		
		int a[][] = new int [rows][columns];
		int b[][] = new int [rows][columns];
		
		
		for(int i=0;i<rows;i++) {
			
			for (int j=0;j<rows;j++) {
				
				a[i][j]= sc.nextInt();
				
			}
		}
		
		 
	}

}
