package arrayTasks;

import java.util.Scanner;

//Count how many times a given number appears in the array
public class FrequencyOfNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER TO CHECK: ");
		int n = s.nextInt();
		int count = 0;
		int i;
		int num[]= {12,17,27,27,32,12,12};
		for(i=0;i<num.length;i++) {
			if(num[i]==n) {
				count++;
			}
		}
		System.out.println("THE NUMBER YOU ENTERED REPEATED "+count+" TIMES");
	}

}

