package sample.programs;

import java.util.Scanner;

public class Name1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scan.nextInt();
		switch (n) {
		case 1: {
			System.out.println("31 days in janvary ");
			break;
		}
		case 2: {
			System.out.println("28days in febravary");
			break;
		}
		case 3: {
			System.out.println("31 days in march");
		}
		case 4: {
			System.out.println("30 days in april");

		}
		case 5: {
			System.out.println("31 days in may");
			break;
		}
		case 6: {
			System.out.println("30 days in june");
			break;
		}
		case 7: {
			System.out.println("31 days in july");
			break;
		}
		case 8: {
			System.out.println("31 days in augest");
			break;
		}
		case 9: {
			System.out.println("30 days in septmber");
			break;
		}
		case 10:
			System.out.println("31 days in octmber");
			break;

		case 11: {
			System.out.println("30 days in november");
			break;
		}
		case 12: {
			System.out.println("31 days in december");
			break;
		}
		default: {
			System.out.println("there is no month");
		}
		}

		// TODO Auto-generated method stub

	}

}