package sample.programs;

import java.util.Scanner;

//WAP a pogram the given number is EVEN OR ODD
public class EvenOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the text case");
		int num = input.nextInt();
		// a=4;
		// String res=(a%2==0)?(a+"is even"):(a+"is odd");
		// System.out.println(res);

		String result = (num % 7 == 0) ? (num + "is divisible by 7") : (num + "is not divisible by 7");
		// WAP TO CHECK THE GIVEN IS DIVISABLE BY 7
		if (num % 7 == 0) {
			System.out.println(num + "number is divisible by 7");
		} else if (num % 7 == 1) {

		}

		System.out.println(result);
	}
}
