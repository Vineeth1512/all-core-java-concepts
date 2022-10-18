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

		System.out.print(map);

	

		

	}
}
