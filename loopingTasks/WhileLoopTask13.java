package loopingTasks;

//Print all perfect numbers between 1 and 1000.
public class WhileLoopTask13 {
	public static void main(String[] args) {
		int i, j = 1, rem;
		for (i=1; i<= 1000;i++) {
			int sum = 0;
			while (j <= i / 2) {	
				if (i % j == 0) {
					sum = sum + j;
				}
				j++;
			}
			if (sum == i) {
				System.out.println(i);
			}
		}
	}
}
