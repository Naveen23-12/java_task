package loopingTasks;

//Print factorial of a number using do-while
public class DoWhileLoopTask8 {
	public static void main(String[] args) {
		int n = 10,product=1;
		do {
			product=product*n;
			n--;
		}while(n>0);
		System.out.println(product);
	}

}
