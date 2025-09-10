package loopingTasks;

import java.util.Scanner;

//Keep accepting marks until user enters a negative number, then print average.
public class DoWhileLoopTask16 {
	public static void main(String[] args) {
		int n;
		int count=0;
		int average;
		int sum=0;
		Scanner s= new Scanner(System.in);
		do {
			System.out.println("ENTER THE MARK: ");
			n=s.nextInt();
			if(n>=90) {
				sum = sum+n;
				count++;
			}
			
		} while (n>=0);
		average=sum/count;
		System.out.println("Average of total mark is: " + average);
	}

}
