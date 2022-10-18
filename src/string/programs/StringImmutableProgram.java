package string.programs;

public class StringImmutableProgram {
	public static void main(String[] args) {
		String s1 = "vineeth";
		String s5 =s1;
		s1.concat("hyd");
		System.out.println(">>>>><<<<<<<< "+s1);
		String s2 = "vineeth";
		System.out.println(s1 == s2);
		s1 = "kumar";
		System.out.println(s1);

		System.out.println(s1 == s2);
	}

}
