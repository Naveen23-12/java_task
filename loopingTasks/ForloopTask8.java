package loopingTasks;

import java.util.Scanner;

//Print factorial of a given number.
public class ForloopTask8 {
	public static void main(String[] args) {
		int i,n,f=1;
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER:");
		n=s.nextInt();
		for(i=1;i<=n;i++) {
			f=f*i;
		}
		System.out.println(f);
	}

}
