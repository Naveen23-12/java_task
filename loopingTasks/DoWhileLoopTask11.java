package loopingTasks;

import java.util.Scanner;

//Count vowels in a given string (input taken inside do-while).
public class DoWhileLoopTask11 {
	public static void main(String[] args) {
		String text;
		Scanner s = new Scanner(System.in);
		char ch;
		int count = 0;
		do {
			System.out.println("ENTER THE TEXT: ");
			text = s.next();
			for (int i = 0; i < text.length(); i++) {
				ch = Character.toLowerCase(text.charAt(i));
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					count++;

				}
			}
			System.out.println(count);
			count=0;
			System.out.println("TYPE 'no' if you dont wanna continue.");

		} while (!text.equals("no"));
		
	}

}
