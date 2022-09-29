package string.programs;

public class UpperToLowerAndLowerToUpperInString {
	public static void main(String[] args) {
		String s = "VineEtHKumarR";
		StringBuffer str = new StringBuffer(s);

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (Character.isLowerCase(ch)) {

				str.setCharAt(i, Character.toUpperCase(ch));

			} else if (Character.isUpperCase(ch)) {

				str.setCharAt(i, Character.toLowerCase(ch));
			}
		}
			System.out.println(str);
		}
	}
