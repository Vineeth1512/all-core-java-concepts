package string.programs;

public class FindEvenStringsFromSenrtence {

	public static void main(String[] args) {
		String s = "My name is thanmai java developer pavan";
		String[] str = s.split(" ");

		for (String s1 : str) {
			if (s1.length() % 2 == 0) {
				System.out.println(" even :"+s1);
			}
		}
	}
}
