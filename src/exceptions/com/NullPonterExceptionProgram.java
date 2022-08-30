package exceptions.com;

public class NullPonterExceptionProgram {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.charAt(0));
		} catch (NullPointerException e) {
			System.out.println("String is null because it get NullPointer Exception");
		}

	}
}
