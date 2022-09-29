package string.programs;

public class FirstLetterCapital {
	public static void main(String[] args) {
		String s = "vineeth";
		String str = "";
		str = (s.charAt(0) + "").toUpperCase();
		for (int i = 1; i < s.length(); i++) {
			str = str + (s.charAt(i) + "").toLowerCase();
		}
		System.out.println(str);
	}

}
