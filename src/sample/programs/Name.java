package sample.programs;

import java.util.Scanner;

//WAP to print the day name by reading the number of the day
public class Name {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		String s = scan.next();
		// TODO Auto-generated method stub
		switch (s) {

		case "mon": {
			System.out.println(1);
			break;
		}
		case "tue": {
			System.out.println(2);
			break;
		}
		case "wen": {
			System.out.println(3);
			break;
		}
		case "thu": {
			System.out.println(4);
			break;
		}
		case "fri": {
			System.out.println(5);
			break;
		}
		case "sat": {
			System.out.println(6);
			break;
		}
		case "sun": {
			System.out.println(7);
			break;
		}
		default: {
			System.out.println("there is no day");
		}
		}
	}

}
