package loopingTasks;

//Check whether a number is palindrome.
public class WhileLoopTask5 {
	public static void main(String[] args) {
		int n=121,rem,rev=1;
		int num2=n;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==num2) {
			System.out.println("PALINDROME");
		}else {
			System.out.println("NOT PALINDROME");
		}
	}

}
