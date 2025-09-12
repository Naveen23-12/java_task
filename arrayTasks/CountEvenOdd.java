package arrayTasks;

import java.util.Scanner;

//Count how many numbers are even and how many are odd.
public class CountEvenOdd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("HOW MANY NUMBERS ARE YOU GONNA ENTER: ");
		int n = s.nextInt();
		int num[]=new int[n];
		int i;
		int even=0,odd=0;
		System.out.println("ENTER "+n+" NUMBERS: ");
		for(i=0;i<num.length;i++) {
			num[i]=s.nextInt();
		}
		for(i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("THERE ARE "+even+" EVEN NUMBERS AND "+odd+" ODD NUMBERS.");
	}

}
