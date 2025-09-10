package loopingTasks;

//Generate a multiplication table for a given number.
public class DoWhileLoopTask9 {
	public static void main(String[] args) {
		int n = 9,i=1;
		do {
			System.out.println(i+" * "+n+" = "+ i*n );
			i++;
		}while(i<=10);
	}

}
