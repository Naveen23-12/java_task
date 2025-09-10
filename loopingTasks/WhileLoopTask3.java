package loopingTasks;

//Find the sum of digits of a number.
public class WhileLoopTask3 {
	public static void main(String[] args) {
		int n = 5227, rem, val = 0;
		while (n > 0) {
			rem = n % 10;
			if (rem != 0) {
				val = rem + val;
			}
			n = n / 10;
		}
		System.out.println(val);
	}

}
