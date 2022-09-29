package sample.programs;

import java.util.Locale;

public class A {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c;
		System.out.println(a);
		System.out.println(b);

		while (true) {
			c = a + b;

			if (c < 100) {
			 System.out.println(c);
			} else {
				break;
			}
			a = b;
			b = c;

		}
		//>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


		for (int i = 1; i < 100; i++) {
			int count = 0;
			for (int j = 1; j < i; j++) {

				if (i % j == 0) {
					count++;
				}
			}

			if (count == 1) {
				System.out.println(i);
			}

		}
		//>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

		int rem, num = 131;
		int sum = 0;
		int temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}
		System.out.println(sum);

		if (temp == sum) {
			System.out.println("palindrom");
		} else {
			System.out.println("not palindrom");
		}
		//>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

		int num1 = 0;
		int cc = 0;
		if (num1 >= 2) {
			for (int i = 2; i < num1; i++) {
				if (num1 % i == 0)
					cc++;
			}
			if (cc == 0) {
				System.out.println("prime");
			} else {
				System.out.println("not prime");
			}
		} else {
			System.out.println("not prime");
		}
//>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		int arr[] = { 1, 2, 1, 3, 2, 4 };

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					arr[i] = arr[n - 1];
					n--;
				}

			}
			System.out.println(arr[i]);

		}

		String s = " vineeth";
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = i; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}

			if (count == 1) {
				str = str + s.charAt(i);
			}
		}
		System.out.println("duplicates : " + str);

		int x = 0, y = 1, z;
		System.out.println(x);
		System.out.println(y);
		while (true) {
			z = x + y;
			if (z < 100) {
				System.out.println(z);
			} else
				break;
			x = y;
			y = z;
		}
		
		
		
		
		
		System.out.println(">>>>>>>>>>>>><<<<<<<<<<<<<<<");
		Locale locale = Locale.getDefault();	
		System.out.println(locale.getCountry());
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getDisplayLanguage(locale));
		System.out.println(locale.getCountry());

		

	}

}
