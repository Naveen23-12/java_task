package loopingTasks;

import java.util.Scanner;

//Keep asking for input until the user enters 0.
public class WhileLoopTask16 {
	public static void main(String[] args) {
		int n=1;
		Scanner s = new Scanner(System.in);
			while(n!=0) {
				System.out.println("ENTER THE NUMBER: ");
				n = s.nextInt();
			}
		

	}

}
