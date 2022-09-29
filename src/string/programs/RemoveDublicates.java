package string.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDublicates {
	public static void main(String[] args) {
		String s = "vineeth";
		String str = " ";
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {

					count++;
				}
			}
			if (count == 0) {
				str = str + s.charAt(i);
			}
		}
		System.out.println("Reverse : " + str);

		// String s = "vineeth";
		for (int i = s.length() - 1; i >= 0; i--) {
			// System.out.print(s.charAt(i));
		}

		for (int i = 0; i < s.length(); i++) {
			str = s.charAt(i) + str;
		}
		System.out.println("Using Empty string.. " + str);

		StringBuffer obj = new StringBuffer(s);
		obj.reverse();
		System.out.println("Using StringBuffer   " + obj);

		List<String> l2 = new ArrayList<>(Arrays.asList(s.split("")));

		l2.stream().filter(n -> Collections.frequency(l2, n) > 1).distinct().forEach(System.out::println);// @formatter:off
		 l2.stream().distinct().forEach(System.out::print);;
		
	//	System.out.println(list);

	}

}
