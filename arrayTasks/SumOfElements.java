package arrayTasks;

import java.util.Scanner;

//Calculate the total sum of elements in the array.
public class SumOfElements {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("HOW MANY NUMBERS ARE YOU GONA ENTER: ");
		int n=s.nextInt();
		int i,sum=0;
		int[] num=new int[n];
		System.out.println("ENTER "+n+" VALUES");
		for(i=0;i<num.length;i++) {
			num[i]=s.nextInt();
		}
		for(i=0;i<num.length;i++) {
			sum=sum+num[i];
		}
		System.out.println("THE TOTAL SUM OF THE ENTERED VALUE IS: "+sum);
	}

}
