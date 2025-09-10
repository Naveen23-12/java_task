package loopingTasks;

import java.util.Scanner;

//Check if a number is palindrome.
public class DoWhileLoopTask14 {
	public static void main(String[] args) {
		int n,rem,rev=0;
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER: ");
		n=s.nextInt();
		int num2=n;
		do {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		} while (n>0);
		
		if(num2==rev) {
			System.out.println("THE NUMBER IS PALINDROME");
		}else {
			System.out.println("THE NUMBE IS NOT PALINDROME");
		}
		
	}

	
}
