package arrayTasks;

import java.util.Scanner;

//Check for Palindrome Array. Check whether the array reads the same forward and backward.
public class PalindromeArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY: ");
		int n = s.nextInt();
		int num[]= new int[n];
		int i,j;
		boolean isPalindrome=true;
		System.out.println("ENTER "+n+" INTEGERS: ");
		for(i=0;i<num.length;i++) {
			num[i]=s.nextInt();
		}
		for(i=0;i<n/2;i++) {
		    if(num[i]!=num[n-1-i]) {
		    	isPalindrome=false;
		    }
		}
		if(isPalindrome) {
			System.out.println("THE ARRAY IS PALINDROME.");
		}else {
			System.out.println("THE ARRAY IS NOT PALINDROME.");
		}
	}

}
