package loopingTasks;

//Find the factorial of a number.
public class WhileLoopTask7 {
	public static void main(String[] args) {
		int n=10,i=1,product=1;
		while(n>=i) {
			product=i*product;
			i++;
		}
		System.out.println(product);
	}

}
