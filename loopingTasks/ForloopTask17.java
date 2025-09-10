package loopingTasks;

//Find the largest digit in a given number.
public class ForloopTask17 {
	public static void main(String[] args) {
		int n=1298,rem,val=0;
		for(int i=1;i<=n;i++) {
			rem=n%10;
			if(rem>val) {
				val=rem;
			}
			n=n/10;
		}
		System.out.println(val);
	}

}
