package loopingTasks;

//Find the sum of squares of first 20 natural numbers.
public class WhileLoopTask9 {
	public static void main(String[] args) {
		int i=1,product=0;
		while(i<=20) {
			product = (i*i)+product;
			i++;
		}
		System.out.println(product);
	}

}
