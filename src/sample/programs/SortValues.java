package sample.programs;

//WAP to SWAP two numbers with the help of 3rd variable or without 3rd variable 
import java.util.Scanner;

public class SortValues {
	public static void sort(int a, int b) {

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " " + b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// System.out.println("enter the 1st value");
		// System.out.print(sort(input.nextInt(),input.nextInt()));
		int fno = input.nextInt();
		int sno = input.nextInt();
		sort(fno, sno);
		// System.out.println("enter the 2nd value");
		// int b=input.nextInt();

		/*
		 * int c; c=a; a=b; b=c; System.out.println(a+" "+b);
		 * 
		 */
		input.close();
	}
}
