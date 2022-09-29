package conversions.com;

public class StringToInt {
	public static void main(String[] args) {
		String s = "120";
		int i = Integer.parseInt(s);
		System.out.println("String to int : " + i);

		Integer a = Integer.valueOf(s);
		System.out.println("String to Integer : " + a);

		int in = 12;
		String str = String.valueOf(in);
		System.out.println("int to String ... : " + str);

		String s1 = "120344567775";
		long l = Long.parseLong(s1);
		System.out.println("String to Long : " + l);

		long l1 = 99876444l;

		String s2 = String.valueOf(l1);
		System.out.println("Long to String : " + s2);

		int x = 123445667;

		String s4 = Integer.toString(x);

		int arr[] = new int[s4.length()];
		for (int j = 0; j < s4.length(); j++) {
			arr[j] = s4.charAt(j) - '0';
			System.out.print(" "+arr[j]);

		}

	}

}
