package loopingTasks;

//Print Fibonacci series up to n terms.
public class WhileLoopTask10 {
	public static void main(String[] args) {
		int n = 10, i = 1, a = 0, b = 1, c;
		while (i <= n) {
			c = a + b;
			a = b;
			b = c;
			i++;
			System.out.println(c);
		}
	}

}
