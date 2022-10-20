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
		fibo(0, 1);

		int fiblength = 10;
		int[] num = new int[fiblength];
		// Assign values 0 and 1 to the 0 and 1 indices of the defined array
		num[0] = 0;
		num[1] = 1;

		// Logic for getting the values of all the indices of the array using for loop
		for (int i = 2; i < fiblength; i++) {
			num[i] = num[i - 1] + num[i - 2];
		}

		System.out.print("fibonacci series: ");
		// Printing the fibonacci series
		for (int i = 0; i < fiblength; i++) {
			System.out.print(num[i] + " ");
		}

	}
}