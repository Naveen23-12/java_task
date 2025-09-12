package arrayTasks;

import java.util.Scanner;

//Read a number and check if it exists in the array.
public class CheckTheNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num[]= {12,27,57,15,19};
		System.out.println("ENTER THE NUMBER TO CHECK: ");
		int n=s.nextInt();
		int i=0;
		do {
			if(n==num[i]) {
				System.out.println("YES, THE NUMBER EXISTS IN THE ARRAY.");
			}else {
				System.out.println("NO, THE NUMBER DOES NOT EXISTS IN THE ARRAY.");
				n=num[i];
			}
		}while(i<num.length && n!=num[i]);
				
		
	}

	
}
