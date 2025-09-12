package arrayTasks;

//Find the second largest number without sorting.
public class SecondLargest {
	public static void main(String[] args) {
		int num[] = { 12, 15, 17, 19, 22 };
		int small = num[0], max = 0,max2,ans=small;
		int i;
		for (i = 0; i < num.length; i++) {
			if (num[i] < small) {
				small = num[i];
			}
		}
		for (i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		for (i = 0; i < num.length; i++) {
			max2=max-num[i];
			if(max2<ans){
				
			}
		}
		
		
	}
}