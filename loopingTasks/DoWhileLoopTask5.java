package loopingTasks;

//Find the sum of digits of a number.
public class DoWhileLoopTask5 {
	public static void main(String[] args) {
		int n = 2559,rem,sum=0;
		do {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}while(n>0);
		System.out.println(sum);
	}

}
