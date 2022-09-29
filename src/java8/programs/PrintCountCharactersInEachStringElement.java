package java8.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintCountCharactersInEachStringElement {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("vineeth", "kumar", "ram", "pavan", "vikash", "aravind");

		Set<String> lists = list.stream().filter(n -> Collections.frequency(list, n) > 1).collect(Collectors.toSet());
		System.out.println(lists);

		Map<String, Integer> map = list.stream().collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println("Each element "+map);

		// Count the names start with V
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			if (name.startsWith("v")) {
				count++;
			}
		}
		System.out.println(count);
		Long c = list.stream().filter(n -> n.startsWith("v")).count();

		System.out.println(c);
		System.out.println(">>>>>>>>>>><<<<<<<<<<<<<<<<<<");
		list.stream().filter(n -> n.startsWith("v")).forEach(s -> System.out.println(s));
		System.out.println(">>>>>>>>>>><<<<<<<<<<<<<<<<<<");

		list.stream().filter(s -> s.length() < 5).forEach(System.out::println);

		list.stream().filter(n -> n.endsWith("h")).map(m -> m.toUpperCase()).forEach(System.out::println);
		list.stream().distinct().forEach(System.out::println);
	}

}
