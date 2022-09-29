package sample.programs;

import java.util.Scanner;

public class Ascending {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the 1st value");
		int a = scan.nextInt();
		System.out.println("enter the 2st value");
		int b = scan.nextInt();
		System.out.println("enter the 3st value");
		int c = scan.nextInt();
		if (a < b && b < c) {
			System.out.println(+a + "" + b + "" + c);
		} else if (a < c && c < b) {
			System.out.println(+a + "" + c + "" + b);
		} else if (b < a && a < c) {
			System.out.println(+b + "" + a + "" + c);
		} else if (b < c && c < a) {
			System.out.println(+b + "" + c + "" + a);
		} else if (c < a && a < b) {
			System.out.println(+c + "" + a + "" + b);
		} else {
			System.out.println(+c + "" + b + "" + a);
		}
		// TODO Auto-generated method stub

	}

}
