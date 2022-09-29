package sample.programs;

import java.util.Scanner;

public class Armstrong {
	public static int Arm(int num) {
		int temp = num;
		int rem, sum = 0;
		while (num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}

		if (temp == sum) {
			System.out.println("ArmStrong");
		} else {
			System.out.println("not ArmStrong");
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		System.out.println(Arm(scan.nextInt()));

	}
}