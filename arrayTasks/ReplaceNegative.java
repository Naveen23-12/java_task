package arrayTasks;

//Replace every negative element in the array with 0
public class ReplaceNegative {
	public static void main(String[] args) {
		int num[] = { 12, -20, 27, -13, 50, -9 };
		int i;
		for(i=0;i<num.length;i++) {
			if(num[i]<0) {
				num[i]=0;
			}
			System.out.println(num[i]);
		}

	}
}
