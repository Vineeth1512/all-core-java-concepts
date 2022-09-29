package string.programs;

public class CapitalTheEvenPositionInString {
	public static void main(String[] args) {
		String s = "vineeth kumar";
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				str = str + (s.charAt(i) + "").toUpperCase();
			} else {
				str = str + (s.charAt(i) + "").toLowerCase();

			}
		}
		System.out.println(str);
	}

}
