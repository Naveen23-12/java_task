package loopingTasks;

//Count the number of digits in a given number.
public class WhileLoopTask6 {
	public static void main(String[] args) {
		int n=122258,rem,dig=0;
		while(n>0) {
			rem=n%10;
			if(rem>0) {
				dig++;
			}
			n/=10;
		}
		System.out.println(dig);
	}

}
