package string.programs;

public class CountTheCharactersInString {
	public static void main(String[] args) {
		String s = "My Name is vineeth kumar mudham";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				count++;

			}
		}
		System.out.println("Number of characters in given string :" + count);

		int temp = 1;
		for (int i = 0; i < s.length() - 1; i++) {

			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				temp++;

			}
		}

		System.out.println("Nubber of words in given string : " + temp);

		String[] string = s.split(" ");
		int c = 0;
		for (String obj : string) {
			System.out.println(" "+obj);
			c++;
		}
		System.out.println("Using for loop : "+c);
	}

}
