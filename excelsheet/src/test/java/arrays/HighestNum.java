//get the highest number of an array using a method.

package arrays;

import java.util.Scanner;

public class HighestNum {

	public static void main(String[] args) {
	
		
		boolean  b = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		
		int n = sc.nextInt();
		
		int marks[] = new int [n];
		
		for (int i =0;i<marks.length;i++) {
			
			System.out.println("Enter array values");
			
			marks[i]= sc.nextInt();
			
		}
		
		
		int max = marks[0];
		
		for(int i=1;i<marks.length;i++) {
			
			if (max< marks[i]);
			
			max = marks[i];
			
			}
			System.out.println("Mximum value is " +max);
		}
		
		
		
		

	}


