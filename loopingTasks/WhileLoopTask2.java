package loopingTasks;

//Print the multiplication table of 9.
public class WhileLoopTask2 {
	public static void main(String[] args) {
		int i=1;
		int product;
		while(i<=10) {
			product = i*9;
			System.out.println(i+" * 9 = "+product);
			i++;
		}
	}

}
