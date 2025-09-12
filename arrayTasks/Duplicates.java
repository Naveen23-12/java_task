package arrayTasks;

import java.util.Scanner;

//Find Duplicate Elements. Print all duplicate numbers present in the array.
public class Duplicates {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY: ");
		int n = s.nextInt();
		int[] num = new int[n];
		int count = 0;
		int i;
		System.out.println("ENTER " + n + " INTEGERS");
		for (i = 0; i < num.length; i++) {
			num[i] = s.nextInt();
		}
		for (i = 0; i < num.length; i++) {
			for (int j = 1; j <num.length; j++) {
				if (num[i]==num[j]) {
					System.out.println();
				 System.out.println(num[i]);
				}
			}
		}

	}
}
