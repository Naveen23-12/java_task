package oddOrEven;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("ENTER THE NUMBER: ");
			n = s.nextInt();
			if (n != 0) {
				if (n % 2 == 0) {
					System.out.println("EVEN NUMBER");
				} else {
					System.out.println("ODD NUMBER");
				}
			}
		} while (n != 0);
		
	}

}
