package loopingTasks;
//Print all numbers divisible by 7 between 1 and 100.
public class WhileLoopTask8 {
	public static void main(String[] args) {
		int i=1;
		while(i<=100) {
			if(i%7==0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
