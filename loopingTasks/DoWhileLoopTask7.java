package loopingTasks;

import java.util.Scanner;

//Menu-driven program (Add, Subtract, Multiply, Divide) until user chooses Exit.
public class DoWhileLoopTask7 {
	public static void main(String[] args) {
		int choice,a,b;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("ENTER YOUR CHOICE FROM 0 TO 4 : ");
			System.out.println("1.ADDITION");
			System.out.println("2.SUBTRACTION");
			System.out.println("3.MULTIPLICATION");
			System.out.println("4.DIVISION");
			System.out.println("0.EXIT");
			choice=s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("YOU HAVE CHOOSEN ADDITION: ");
				System.out.println("ENTER THE VALUE FOR A: ");
				a=s.nextInt();
				System.out.println("ENTER THE VALUE FOR B: ");
				b=s.nextInt();
				System.out.println();
				System.out.println(a+b);
				break;
			case 2:
				System.out.println("YOU HAVE CHOOSEN SUBTRACTION: ");
				System.out.println("ENTER THE VALUE FOR A: ");
				a=s.nextInt();
				System.out.println("ENTER THE VALUE FOR B: ");
				b=s.nextInt();
				System.out.println();
				System.out.println(a-b);
			case 3:
				System.out.println("YOU HAVE CHOOSEN MULTIPLICATION: ");
				System.out.println("ENTER THE VALUE FOR A: ");
				a=s.nextInt();
				System.out.println("ENTER THE VALUE FOR B: ");
				b=s.nextInt();
				System.out.println();
				System.out.println(a*b);
			case 4:
				System.out.println("YOU HAVE CHOOSEN DIVISION: ");
				System.out.println("ENTER THE VALUE FOR A: ");
				a=s.nextInt();
				System.out.println("ENTER THE VALUE FOR B: ");
				b=s.nextInt();
				System.out.println();
				System.out.println(a/b);
			}
			
		}while(choice!=0);
	}
	

}
