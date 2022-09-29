package sample.programs;

import java.util.*;

public class CharacterString {
	public static String Character(String s) {
		String str = " ";
		for (int i = 0; i < s.length(); i++) {

			str = s.charAt(i) + str;
		}
		return str;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		// String s=scan.nextLine(Character());
		System.out.println(Character(scan.next()));

		// System.out.println(Letter(scan.nextLine()));

	}

}
