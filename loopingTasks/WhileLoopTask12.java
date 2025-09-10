package loopingTasks;

//Find the greatest common divisor (GCD) of two numbers.
public class WhileLoopTask12 {
	public static void main(String[] args) {
		int a = 127, b = 21;
		int rem = 1;
		while(rem>0) {
			rem=a%b;
			a=b;
			b=rem;	
		}
		System.out.println(a);
	}

}
