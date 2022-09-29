package java8.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicatesStringsInHashMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(5, "vineeth");
		map.put(4, "pavan");
		map.put(16, "harsh");
		map.put(7, "pavan");
		map.put(18, "vineeth");
		

		List<Integer> keyList = new ArrayList<>(map.keySet());
		List<String> valueSet = new ArrayList<>(map.values());
		keyList.forEach(System.out::println);
		//valueSet.forEach(System.out:: println);
		List<String> duplicatesList = valueSet.stream().distinct().collect(Collectors.toList());
		
		for(String s : duplicatesList) {
			map.remove(s);
		System.out.println(s);
		}
		System.out.println();
		valueSet.forEach(System.out::println);
		
	}

}
