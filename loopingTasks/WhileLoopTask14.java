package loopingTasks;

//Find the smallest digit in a given number.
public class WhileLoopTask14 {
	public static void main(String[] args) {
		int n =125,i=9,rem;
		while(n>0) {
			rem=n%10;
			if(rem<i) {
				i=rem;
			}
			n=n/10;
		}
		System.out.println(i);
	}

}
