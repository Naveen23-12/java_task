package loopingTasks;

import java.util.Scanner;

//Keep asking the user for a password until it matches "admin".
public class DoWhileLoopTask6 {
	public static void main(String[] args) {
		String psw="admin";
		String n;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("ENTER THE PASSWORD: ");
			n=s.next();
		}while(!n.equals(psw));

	}
}
