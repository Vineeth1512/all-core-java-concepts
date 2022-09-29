package sample.programs;

import java.util.Scanner;

public class MidleNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the 1st value");
		int a = scan.nextInt();
		System.out.println("enter the 2nd value");
		int b = scan.nextInt();
		System.out.println("enter the 3rd value");
		int c = scan.nextInt();
		// TODO Auto-generated method stub
		if (((c < a && a < b) || b < a && a < c)) {
			System.out.print(a);
		} else if ((a < b && b < c) || (c < b && b < a)) {
			System.out.print(b);

		} else {
			System.out.print(c);
		}

	}

}
