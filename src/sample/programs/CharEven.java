package sample.programs;

import java.util.Scanner;

public class CharEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the character");
		char ch = scan.next().charAt(0);

		if (ch % 2 == 0) {
			System.out.println("is even");
		} else if (ch % 2 == 1) {
			System.out.println("is odd");
		}
		// TODO Auto-generated method stub

	}

}
