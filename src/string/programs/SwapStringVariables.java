package string.programs;

public class SwapStringVariables {
	public static void main(String[] args) {
		String a = "vi";
		String b = "ku";

		System.out.println(">>> a <<< " + a);
		System.out.println(">>> b <<< " + b);

		a = a + b;
		b = a.substring(0, (a.length() - (b.length())));
		a = a.substring((b.length()));

		System.out.println(">>> a <<< " + a);
		System.out.println(">>> b <<< " + b);

	}

}
