package arrayTasks;

import java.util.Scanner;

//Print the elements of the array in reverse order without using extra arrays.
public class ReverseNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER NUMBER OF ELEMENTS: ");
		int n=s.nextInt();
		int[] num=new int[n];
		int i;
		System.out.println("ENTER THE ELEMENTS: ");
		for(i=0;i<num.length;i++) {
			num[i]=s.nextInt();
		}
		for(i=num.length-1;i>=0;i--) {
			System.out.println(num[i]);
		}
	}

}
