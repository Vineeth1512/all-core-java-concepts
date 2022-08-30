package exceptions.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StringIndexOutOfBondException {
	public static void main(String[] args) {
		try {
			String s = "vinee";
			System.out.println(s.charAt(43));

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("index is not present");
		}

		// NUBERFORMATEXCEPTION
		try {
			// "akki" is not a number
			int num = Integer.parseInt("akki");

			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Number format exception");
		}

		// FileNotFoundException
		try {

			// Following file does not exist
			File file = new File("E://file.txt");

			FileReader fr = new FileReader(file);
			System.out.println(fr);
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist");
		}

		// ArrayIndexOutOfBoundsException e
		try {
			int a[] = new int[5];
			a[6] = 9; // accessing 7th element in an array of
						// size 5
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is Out Of Bounds");
		}
		// Create a new scanner with the specified String
		// Object
		Scanner scan = new Scanner("Hello Geek!");

		// Print the line
		System.out.println("" + scan.nextLine());

		// Check if there is an IO exception
		System.out.println("Exception Output: " + scan.ioException());

		scan.close();

	}

}
