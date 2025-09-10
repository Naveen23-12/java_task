package loopingTasks;

//Print all numbers divisible by 3 and 5 between 1 and 100.
public class ForloopTask16 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);

			}
		}

	}

}
