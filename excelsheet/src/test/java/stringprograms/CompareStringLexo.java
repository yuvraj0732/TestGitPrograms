//Write a java program to compare two strings lexicographically.

package stringprograms;

public class CompareStringLexo {

	public static void main(String[] args) {
		
		String s1="This is Exercise 2";
		
		String s2="This is Exercise 1";
		
		int result=s1.compareTo(s2);
		
		System.out.println(result);
		
		if(result<0) {
			
			System.out.println("Second string ");
			
			
			
		}
		
		
		if(result>0) {
			
			System.out.println("First");
			
		}
		
		if(result==0) {
			System.out.println("Equal");
			
		}
	}}	

	

