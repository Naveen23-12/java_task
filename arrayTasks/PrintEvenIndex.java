package arrayTasks;

//Print all the elements that are present at even indices.
public class PrintEvenIndex {
	public static void main(String[] args) {
		int num[]= {12,15,17,19,29};
		System.out.println("ELEMENTS IN EVEN INDICES ARE:");
		for(int i=0;i<num.length;i+=2) {
			System.out.println(num[i]);
		}
	}

}
