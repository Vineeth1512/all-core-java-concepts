package sample.programs;

import java.util.Scanner;

public class Fibonacci {
	public static void fibo(int num1, int num2) {

		System.out.println(num1);
		System.out.println(num2);
		int c;
		while (true) {
			c = num1 + num2;
			if (c < 100) {

				System.out.print(" " + c);

			} else {
				break;
			}

			num1 = num2;
			num2 = c;
		}

		// return 0;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number 1");
		int a = scan.nextInt();
		System.out.println("enter the number 2");
		int b = scan.nextInt();

		 fibo(a, b);

		int n1 = 0, n2 = 1, n3;
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 1; i < 100; i++) {
			n3 = n1 + n2;

			System.out.println(" "+n3);
			n1 = n2;
			n2 = n3;

		}

	}
}