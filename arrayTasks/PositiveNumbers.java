package arrayTasks;

//Print all positive integers from the array.
public class PositiveNumbers {
	public static void main(String[] args) {
		int []num= {12,-20,59,32,0,-1};
		int i;
		System.out.println("THE POSITIVE NUMBERS ARE: ");
		for(i=0;i<num.length;i++) {
			if(num[i]>0) {
				System.out.println(num[i]);
			}
		}
	}

}
