package loopingTasks;

import java.util.Scanner;

//Keep accepting numbers until the sum exceeds 100.
public class DoWhileLoopTask12 {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("ENTER THE NUMBER: ");
			n=s.nextInt();
			sum=n+sum;
		}while(sum<100);
		System.out.println(sum);
	}

}
