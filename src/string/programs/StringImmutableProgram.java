package string.programs;

public class StringImmutableProgram {
	public static void main(String[] args) {
		String s1 = "vineeth";
		String s2 = s1;
		System.out.println(s1 == s2);
		s1 = "kumar";
		System.out.println(s1);

		System.out.println(s1 == s2);
		String s = """ 
				Hi
				hello
				bye
				""";
		System.out.println(s);
	}

}
