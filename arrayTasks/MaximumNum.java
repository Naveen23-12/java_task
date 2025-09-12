package arrayTasks;

import java.util.Scanner;

//Find the Maximum Element
public class MaximumNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF ELEMENTS: ");
		int n=s.nextInt();
		int num[]=new int[n];
		System.out.println("ENTER "+n+" INTEGERS");
		for(int i=0;i<num.length;i++) {
			num[i]=s.nextInt();
		}
		int max = num[0];
		for(int i=0;i<num.length;i++) {
			if(max<num[i]) {
				max=num[i];
			}
		}
		System.out.println("THE MAXIMUM VALUE IN THE ELEMENTS IS: "+max);
	}

}
