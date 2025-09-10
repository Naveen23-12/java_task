package loopingTasks;

//Print Armstrong numbers between 1 and 500.
public class DoWhileLoopTask15 {
	public static void main(String[] args) {
		int n = 1, digit = 0, rem;
		do {
			int i=n;
			int temp=n;
			int sum=0;	
			do {
				rem = temp % 10;
				sum+=rem*rem*rem;
				temp=temp/10;
				digit++;
			} while (temp > 0);
			if(n==sum) {
				System.out.println(sum);
			}
			n++;
		} while (n <= 500);
	}

}
