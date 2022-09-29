package sample.programs;

import java.util.Scanner;

public class nthPrime {
	public static int prime(int num) {
		int num1 = 1, count = 0, i;
		while (num > count) {
			num1 = num1 + 1;
			for (i = 2; i <= num1; i++) {
				if (num1 % i == 0) {
					break;
				}
			}
			if (i == num1) {
				count = count + 1;
			}
		}

		return num1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// System.out.println("enter the nth prime number .");
		// int num =scan.nextInt();

		int num = 12, num1 = 1, count = 0, i;
		while (num > count) {
			num1++;
			System.out.println("from while "+num1);
			for (i = 2; i < num1; i++) {
				if (num1 % i == 0) {
				System.out.println("from for "+num1);
					break;
				}
			}
			System.out.println(" >>i<<"+i);
			System.out.println(">>num1<< "+num1);
			if (i == num1) {
				count++;
			}
		}
		System.out.println(num + "th position of prime number is :" + num1);
		System.out.println(">>>>nth<<<<< : " + prime(3));

	}

}
