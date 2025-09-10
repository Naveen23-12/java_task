package loopingTasks;

//Reverse a number (e.g., 123 → 321).
public class WhileLoopTask4 {
	public static void main(String[] args) {
		int n=127,rem;
		while(n>0) {
			rem=n%10;
			System.out.print(rem);
			n=n/10;
		}
		
	}

}
