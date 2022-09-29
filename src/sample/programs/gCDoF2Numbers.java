package sample.programs;

import java.util.Scanner;

public class gCDoF2Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the tw0 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int gcd = 1;
		for (int i = 1; i <= a && i <= b && i <= c; i++) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);

	}

}
