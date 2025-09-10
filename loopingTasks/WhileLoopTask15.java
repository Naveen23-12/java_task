package loopingTasks;

//Print the sum of all odd digits in a given number.
public class WhileLoopTask15 {
	public static void main(String[] args) {
		int n=127,rem,sum=0;
		while(n>0) {
			rem=n%10;
			if(rem%2!=0) {
				sum=sum+rem;
			}
			n=n/10;
		}
		System.out.println(sum);
	}

}
