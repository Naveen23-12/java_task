package loopingTasks;

//Print the ASCII values of characters A–Z.
public class ForloopTask13 {
	public static void main(String[] args) {
		char ch = 'A';
		int ascii = ch;
		for (ascii = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ascii);
			ascii++;

		}

	}

}
