package sample.programs;

public class Alphabet {
//WAP to check the given character alphabet or not
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';

		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " the character is alphabet");
		}

		else if (ch >= '1' && ch <= '9') {

			System.out.println(ch + " the character is number");
		} else {
			System.out.println(ch + " the character is special character");
		}
	}

}
