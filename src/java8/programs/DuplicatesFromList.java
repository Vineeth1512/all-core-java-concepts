package java8.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesFromList {
	public static void main(String[] args) {

		List<Integer> obj = Arrays.asList(2, 4, 5, 5, 4, 8, 1, 23, 4, 2);
		List<Integer> a = obj.stream().distinct().toList();
		a.forEach(i -> System.out.println(i));
		// Output :2 ,4, 5, 8,1,23,
		List<String> string = Arrays.asList("vineeth", "pavan", "ajay", "vineeth", "pavan");
		Set<String> list = string.stream().filter(n -> Collections.frequency(string, n) > 1)
				.collect(Collectors.toSet());
		System.out.println(list);
		
		List<String> set =string.stream().distinct().toList();
		System.out.println(set);
		string.clear();
	//	string.addAll(objSet);
		
		Set<String> objSet = new HashSet<>();
		objSet.addAll(string);
		System.out.println(string);
		System.out.println(objSet);
	}

}
