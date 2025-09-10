package loopingTasks;

//Check if a number is prime.
public class WhileLoopTask11 {
	public static void main(String[] args) {
		int n = 11,i=1,count=0;
		while(n>=i) {
			if(n%i==0) {
				count++;
			}
			i++;
		}
		if(count==2) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime number");
		}
	}

}
