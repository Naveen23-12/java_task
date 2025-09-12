package arrayTasks;

import java.util.Scanner;

//Find and print the smallest element in an array.
public class SmallestNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF ELEMENTS: ");
		int n = s.nextInt();
		int num[] = new int[n];
		System.out.println("ENTER "+n+" INTEGERS");
		for (int i = 0; i < num.length; i++) {
			num[i] = s.nextInt();
		}
		int small=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]<small) {
				small=num[i];
			}
		}
		System.out.println("THE SMALLEST VALUE IN THE ELEMENTS IS: "+small);
	}

}
