package loopingTasks;

//Find the sum of the first 10 natural numbers.
public class DoWhileLoopTask3 {
	public static void main(String[] args) {
		int i=1,sum=0;
		do {
			sum=sum+i;
			i++;
		}while(i<=10);
		System.out.println(sum);
	}

}
