package common;

import java.util.Scanner;

public class FibnocciSeries {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter");
		
		int n= sc.nextInt();
		
		int a=0;
		int b=1;
		System.out.print(a+ " " +b);
		int  c;
		
          for(int i=0;i<n-2;i++) {
        	  
        	c = a + b;
        	  
        	  System.out.print(" " +c +" ");
        	  
        	a=b;
        	b=c;
     				
        	
          }
       
		}

	}

