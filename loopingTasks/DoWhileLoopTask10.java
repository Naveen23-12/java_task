package loopingTasks;

//Print Fibonacci series up to n terms.
public class DoWhileLoopTask10 {
	public static void main(String[] args) {
		int n = 10, a=0,b=1,c;
		do {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			n--;
		}while(n>0);

	}
	
}
