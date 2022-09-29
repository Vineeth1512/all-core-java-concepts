package string.programs;

public class DigitsInString {
	public static void main(String[] args) {
		String s = "vine34t hKum31a4r$%##&@*##";
		String str = "";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				// count++;
			}
			// >>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<
			if (Character.isDigit(ch))
				count++;

		}
		System.out.println("Number of digits in String : " + count);

		for (int i = 0; i < s.length(); i++) {
			count = 0;
			for (char ch = 'a'; ch < 'z'; ch++) {

				if (s.charAt(i) == ch) {
					count++;

				}
			}
			if (count == 0) {
				System.out.print(s.charAt(i));
			}
		}
		System.out.println(">>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<< ");
		int c = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!Character.isDigit(ch) && !Character.isLetter(ch) && !Character.isWhitespace(ch)) {
				c++;
			} else {
				str = str + s.charAt(i);
			}

		}
		if (c == 0) {
			System.out.println("There are no special characters : " + str);
		} else {
			System.out.println("special characters found : " + c);
		}

	}
}
