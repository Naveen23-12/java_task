package amstrong;

import java.util.Scanner;

public class AmstrongNum {
	public static void main(String[] args) {
		int num, count=0,rem;
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER: ");
		num = s.nextInt();
		int product,sum=0;
		int num2=num;
		int num3=num;
		while(num>0) {
			count++;
			num=num/10;
		}
		while(num2>0) {
			product=1;
			rem=num2%10;
			for(int i=0;i<count;i++){
				product=product*rem;
			}
			sum=product+sum;
			num2=num2/10;
		}
		if(num3==sum) {
			System.out.println("IT IS AN AMSTRONG NUMBER");
		}else {
			System.out.println("IT IS NOT AN AMSTRONG NUMBER");
		}
	}

}
