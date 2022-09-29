package arrayPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeTwoArraysInList {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("pavan", "naveen", "vinneth", "praveen", "srivani");
		Map<String, Integer> map = new HashMap<>();

		for (String ab : list) {
			map.put(ab, ab.length());
		}

//		System.out.print(map);

		for (int i = 1; i <= 100; i++) {
			int c = 0;

			for (int j = 1; j < i; j++) {

				if (i % j == 0) {

					c++;
				}
			}
			if (c == 1) {

				System.out.print(i + ",");
			}

		}

	}
}
