package loopingTasks;

//Print the product of odd numbers between 1 and 20.
public class ForloopTask12 {
	public static void main(String[] args) {
		int i,product=1;
		for(i=1;i<=20;i+=2) {
			product = product *i;
		}
		System.out.println(product);
	}

}
