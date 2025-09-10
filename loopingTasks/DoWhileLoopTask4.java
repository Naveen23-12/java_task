package loopingTasks;

//Reverse a given number.
public class DoWhileLoopTask4 {
	public static void main(String[] args) {
		int n=127,rem,rev=0;
		do {
			rem=n%10;
			if(rem!=0) {
				rev=rev*10+rem;
			}
			 n=n/10;                    
		}while(n>0);
		System.out.println(rev);
	}

}
