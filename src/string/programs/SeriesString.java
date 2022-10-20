package string.programs;

public class SeriesString {
	public static void main(String[] args) {
		String s = "a1b2c4";

		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) {

			} else {
				int n = Character.getNumericValue(s.charAt(i));

				for (int j = 0; j < n; j++) {
					System.out.print(s.charAt(i - 1));
				}
			}
		}

	}

}
