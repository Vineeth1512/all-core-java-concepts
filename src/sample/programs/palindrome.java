package sample.programs;

import java.util.Scanner;

public class palindrome {
	public static int pali(int num) {
		int rem = 0;
		int sum = 0;
		int temp = num;

		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		System.out.println(sum);

		if (temp == sum) {
			System.out.println("is polindrom");
		} else {
			System.out.println("not polindrom");
		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");

		// TODO Auto-generated method stub
//int num= scan.nextInt();
		System.out.println(pali(scan.nextInt()));
	}
}
